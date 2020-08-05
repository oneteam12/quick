package com.eliteams.quick4j.web.controller;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;

public class poiExcelShuiXi {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    public static boolean checkHasExist(String sx_hlbh) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM tbl_sx WHERE sx_hlbh=" + sx_hlbh;
        System.out.println(sql);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String password = "root";
        String username = "root";

        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        if (rs.next()) {
            conn.close();
            return true;
        } else {
            conn.close();
            return false;
        }
    }

    public static String executeInsert(String rowValue) {
        System.out.println("-----------------------------------");
        System.out.println(rowValue);
        String[] clean_row_list = rowValue.split(",");
        System.out.println(clean_row_list);
        String clean_row = "";
        int j = 0;
        for (int i = 0; i < clean_row_list.length-1; i++) {

                clean_row += clean_row_list[i] + ",";
                j++;

        }
        System.out.println(j);
        System.out.println(clean_row);
        String new_rowValue = clean_row + clean_row_list[j];
        System.out.println(new_rowValue);
        String columnName = "(sx_hlmc, sx_hlbh, sx_hljb, sx_szly,sx_sjhl,sx_xjhlxl,sx_hsqmj," +
                "sx_ldmj,sx_cdmj,sx_stmj,sx_hdmj,sx_czmj,sx_ncmj,sx_gjmj,sx_wlymj,sx_date) ";
        String sql = "";
        sql = "INSERT INTO tbl_sx" + columnName + "VALUES(" + new_rowValue + ");" + "\n";
        System.out.println("insert语句：\n" + sql);
        return sql;
    }

    public static String executeUpdate(String rowValue, String kzdm_mc) {

        String new_rowValue = rowValue.substring(0, rowValue.length() - 1) + ",0";
        System.out.println("new_rowValue:" + new_rowValue);
        String[] rowValue_list = new_rowValue.split(",");
//        if(rowValue_list[8].equals("\"\"")){
//            rowValue_list[8] = "0";
//        }
        String sql = "";
        sql = "UPDATE tbl_sx SET " +
                "sx_hlmc=" + rowValue_list[0] + ",sx_hlbh=" + rowValue_list[1] +
                ",sx_hljb=" + rowValue_list[2] + ",sx_szly=" + rowValue_list[3] + ",sx_sjhl=" + rowValue_list[4] +
                ",sx_xjhlxl=" + rowValue_list[5] + ",sx_hsqmj=" + rowValue_list[6] + ",sx_ldmj=" + rowValue_list[7] +
                ",sx_cdmj=" + rowValue_list[8] + ",sx_stmj=" + rowValue_list[9] +",sx_hdmj=" + rowValue_list[10] +
                ",sx_czmj=" + rowValue_list[11] + ",sx_ncmj=" + rowValue_list[12]+ ",sx_gjmj=" + rowValue_list[13]+
                ",sx_wlymj=" + rowValue_list[14]+",sx_date=" + rowValue_list[15];
        System.out.println(sql);
        return sql;
    }


    public static int[] connectMySQL(String rowValue) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/new_env";
        String password = "root";
        String username = "root";
        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功！");

        }
        int[] rs_count = new int[2];
        int rs_count_insert = 0;
        int rs_count_update = 0;
        String sql = "";
        // 创建statement类对象，用来执行SQL语句
        Statement statement = conn.createStatement();
        String sx_hlbh = rowValue.split(",")[1];
        System.out.println(sx_hlbh);
        if (checkHasExist(sx_hlbh)) {
            sql = executeUpdate(rowValue, sx_hlbh);
            rs_count_update = rs_count_update + statement.executeUpdate(sql);
        } else {
            sql = executeInsert(rowValue);
            rs_count_insert += statement.executeUpdate(sql);
        }
        System.out.println(rs_count_update);
        System.out.println(rs_count_insert);
        rs_count[0] = rs_count_update;
        rs_count[1] = rs_count_insert;
        conn.close();
        return rs_count;
    }

    public static Workbook getWorkbook(InputStream in, File file) throws IOException {
        Workbook wb = null;
        if (file.getName().endsWith(EXCEL_XLS)) {  //Excel 2003
            wb = new HSSFWorkbook(in);
        } else if (file.getName().endsWith(EXCEL_XLSX)) {  // Excel 2007/2010
            wb = new HSSFWorkbook(in);
        }
        return wb;
    }


    public static String poiExceltoSql(String getString, String localFileName, String localFilePath, String localFileUploadTime) throws Exception {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        int[] rs_count = new int[2];
        int updateCount = 0;
        int insertCount = 0;
        try {
            String[] fopt = getString.split("\\.");
            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[1];
            System.out.println(localFileName);
            System.out.println(localFilePath);
            System.out.println(checkFileName);
            System.out.println(fopt[0]);
            System.out.println(fopt[1]);

            if (checkFileName.equals(localFileName)) {

                File excelFile = new File(localFilePath); // 创建文件对象
//                checkExcelVaild(excelFile);

                FileInputStream fis = new FileInputStream(excelFile); // 文件流

                Workbook workbook = getWorkbook(fis, excelFile);
//                Workbook workbook = WorkbookFactory.create(fis); // 这种方式 Excel2003/2007/2010都是可以处理的

                int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
                /**
                 * 设置当前excel中sheet的下标：0开始
                 */
                Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet
                sheet.setDisplayGridlines(true);
                int rowStart = 2;
                int rowEnd = sheet.getLastRowNum();
                System.out.println("pre_rowEnd");
                System.out.println(rowEnd);
                System.out.println(sheet.getRow(rowEnd).getCell(0));
                int j =0;
                for(int i =1;i<=rowEnd;i++){

                    if( sheet.getRow(i).getCell(0) != null){
                         sheet.getRow(i).getCell(0).setCellType(Cell.CELL_TYPE_STRING);
                        if(sheet.getRow(i).getCell(0).toString() !=""){
                            j++;
                        }
                    }

                }


                System.out.println("rowEnd:");
                System.out.println(rowEnd);
                Row row_title = sheet.getRow(1);

                int max_column = row_title.getLastCellNum();
                System.out.println(max_column);
                for (int rowNum = rowStart; rowNum <=j; rowNum++) {
                    Row row = sheet.getRow(rowNum);
                    StringBuilder rowValue = new StringBuilder();

                    for (int cn = 0; cn < max_column; cn++) {
                        Cell cell = row.getCell(cn, Row.RETURN_BLANK_AS_NULL);

                        String cellValue = "";
                        if (cell == null) {
                            cellValue = "\"\",";
                            rowValue.append(cellValue);
                        } else {
                            int cellType = cell.getCellType();
                            switch (cellType) {
                                case Cell.CELL_TYPE_STRING:
                                    cellValue = '"' + cell.getRichStringCellValue().getString() + '"' + ',';
                                    break;
                                case Cell.CELL_TYPE_NUMERIC:    // 数字、日期
                                    if (DateUtil.isCellDateFormatted(cell)) {
                                        cellValue = fmt.format(cell.getDateCellValue()) + ",";
                                    } else {
                                        cell.setCellType(Cell.CELL_TYPE_STRING);
                                        cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    }
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:    // 布尔型
                                    cellValue = String.valueOf(cell.getBooleanCellValue()) + ",";
                                    break;
                                case Cell.CELL_TYPE_BLANK: // 空白
                                    cellValue = '"' + cell.getStringCellValue() + '"' + ",";
                                    break;
                                case Cell.CELL_TYPE_ERROR: // 错误
                                    cellValue = "错误#";
                                    break;
                                case Cell.CELL_TYPE_FORMULA:    // 公式

                                    cell.setCellType(Cell.CELL_TYPE_STRING);
                                    cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    break;
                                default:
                                    cellValue = ",";
                            }

                            rowValue.append(cellValue);
                        }


                    }
                    rs_count = connectMySQL(rowValue.toString());
                    updateCount += rs_count[0];
                    insertCount += rs_count[1];
                    System.out.println("更新了" + updateCount + "条信息");
                    System.out.println("新增了" + insertCount + "条信息");
                }

            } else {
                return "文件不存在，请重新上传！";
            }


//            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            bw.close();
        }
        return "文件批量导入成功 " + updateCount + " " + insertCount;
    }

//    public static void main(String args[]) throws Exception {
//        String OriFileName = "上报总站监测司-辽宁省点位信息及数据---2013.xls";
//        String localFileName = "上报总站监测司-辽宁省点位信息及数据---2013_20170817161501.xls";
//        String localFilePath = "D:/EnvironmentalProtection/EnvironmentalProtection/target/quick4j/upload/qmp/上报总站监测司-辽宁省点位信息及数据---2013_20170817161501.xls";
//        String localFileUploadTime = "20170817161501";
//
//
//        String sa = poiExceltoSql(OriFileName, localFileName, localFilePath, localFileUploadTime);
//        System.out.println(sa);
//
//    }


}
