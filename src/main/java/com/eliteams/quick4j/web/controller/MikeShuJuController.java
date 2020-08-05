package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.ShuiXi;
import com.eliteams.quick4j.web.service.ShuiXiService;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

@Controller
@RequestMapping("/mikeShuJu")
public class MikeShuJuController {




    @Resource
    private ShuiXiService shuiXiService;


    /**
     * 添加控制断面跳转
     *
     */
    @RequestMapping("/addShuiXi")
    public String addShuiXiUnit() {
        return "mike/addShuiXi";
    }


    /**
     * 查询控制断面跳转
     */
    @RequestMapping("/searchShuiXi")
    public String searchShuiXi() {
        return "mike/searchShuiXi";
    }


    /**
     * bulkImport页
     */
    @RequestMapping("/bulkImportShuiXi")
    public String bulkImportShuiXi() {
        return "mike/bulkImportShuiXi";
    }


    /**
     * 查询列表
     */
    @RequestMapping("/ShuiXi")
    public String controlUnitList(HttpServletRequest request, Model model) {
        String pageNow = request.getParameter("pageNow");

        model = shuiXiService.selectShuiXiByPage(pageNow, model);
        return "mike/shuiXiList";
    }




    /**
     * 添加信息
     */
    @RequestMapping("/insertShuiXi")
    @ResponseBody
    public String insert(HttpServletRequest request, ShuiXi shuiXi) {
        int result = shuiXiService.insertselective(shuiXi);
        request.setAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }


    /**
     * 查询修改信息的id
     */
    @RequestMapping("/shuiXiId")
    public String updateid(HttpServletRequest request, Integer id, Model model) {
        ShuiXi shuixi = shuiXiService.selectByPrimaryKey(id);
        model.addAttribute("shuiXi", shuixi);
        return "mike/editShuiXi";
    }

    /**
     * 修改
     */
    @RequestMapping("/shuiXiUpdate")
    @ResponseBody
    public String update(HttpServletRequest request, ShuiXi shuixi, Model model) {
        int result = shuiXiService.updateByPrimaryKeySelective(shuixi);
        model.addAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 删除 ，根据id删除
     */
    @RequestMapping("/shuiXiDelete")
    @ResponseBody
    public String delete(HttpServletRequest request, Integer id) {
        int result = shuiXiService.deleteByPrimaryKey(id);
        request.setAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/searchShuiXi_S")
    @ResponseBody
    public ModelAndView search(HttpServletRequest request, ModelAndView m) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("sx_hlmc", (String) request.getParameter("sx_hlmc"));
        map.put("sx_hlbh", (String) request.getParameter("sx_hlbh"));
        map.put("sx_hljb", (String) request.getParameter("sx_hljb"));
        map.put("sx_szly", (String) request.getParameter("sx_szly"));
        map.put("sx_sjhl", (String) request.getParameter("sx_sjhl"));
        map.put("sx_xjhlxl", (String) request.getParameter("sx_xjhlxl"));
        map.put("sx_hsqmj", (String) request.getParameter("sx_hsqmj"));
        map.put("sx_ldmj", (String) request.getParameter("sx_ldmj"));
        map.put("sx_cdmj", (String) request.getParameter("sx_cdmj"));
        map.put("sx_stmj", (String) request.getParameter("sx_stmj"));
        map.put("sx_hdmj", (String) request.getParameter("sx_hdmj"));
        map.put("sx_czmj", (String) request.getParameter("sx_czmj"));
        map.put("sx_ncmj", (String) request.getParameter("sx_ncmj"));
        map.put("sx_gjmj", (String) request.getParameter("sx_gjmj"));
        map.put("sx_wlymj", (String) request.getParameter("sx_wlymj"));
        map.put("sx_date", (String) request.getParameter("sx_date"));

        String pageNow = request.getParameter("pageNow");
        List<ShuiXi> list = shuiXiService.searchByPage(pageNow, map);
        Page page = shuiXiService.getSearchPage(pageNow, map);

        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("mike/shuiXiList_S");
        return m;
    }


    @RequestMapping("/getTableNameShuiXi")
    public void getTableName(HttpServletRequest request, HttpServletResponse response) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='tbl_sx'";
        java.sql.PreparedStatement pstmt;
        List list = new ArrayList<String>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "root");

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            String sql2 = "select count(column_name) from information_schema.columns where table_schema='new_env' and table_name='tbl_sx'";
            java.sql.PreparedStatement pstmt2;

            pstmt2 = (PreparedStatement) conn.prepareStatement(sql2);
            ResultSet rs2 = pstmt2.executeQuery();
            int a =0;
            while(rs2.next()){
                a = rs2.getInt("count(column_name)");
            }

            sql +=" limit 1,"+(a-6);

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs3 = pstmt.executeQuery();
            while (rs3.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs3.getString(i) + "\t");
                    list.add(rs3.getString(i));
                }
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String str = gson.toJson(list);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(str);
    }




    /**
     * 保存数据
     */
    private String fileUploadName;
    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }

    private String fileUploadPath;

    public String getFileUploadPath() {
        return fileUploadPath;
    }

    public void setFileUploadPath(String fileUploadPath) {
        this.fileUploadPath = fileUploadPath;
    }


    private String fileUploadTime;
    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    @RequestMapping("/fileUploadShuiXi")
    @ResponseBody
    public String fileUploadCu(HttpServletRequest request) throws Exception{
//        QmpController qmp = new QmpController();
        Map<String, Object> err = new HashMap<String, Object>();
        err.put("status", "myerror");
        Gson gson = new Gson();
        long  startTime=System.currentTimeMillis();
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
        String dir = request.getSession().getServletContext().getRealPath("upload/mike/shuiXi");

        if(multipartResolver.isMultipart(request)){

            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            Iterator<?> iter=multiRequest.getFileNames();
            while(iter.hasNext()){

                MultipartFile file=multiRequest.getFile(iter.next().toString());
                String path = "";
                String filename_forPath = "\\";

                if(file!=null){
                    String TIME = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(java.util.Calendar.getInstance().getTime());
                    this.setFileUploadTime(TIME);
                    String[] fopt = file.getOriginalFilename().split("\\.");
                    System.out.println("orifilename:");
                    System.out.println(file.getOriginalFilename());
                    fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
                    filename_forPath += fopt[0]+'_'+TIME + '.' + fopt[1];
                    String filename = fopt[0]+'_'+TIME + '.' + fopt[1];
                    this.setFileUploadName(filename);
                    System.out.println("filename:");
                    System.out.println(filename);
                    path = dir + filename_forPath;
                    this.setFileUploadPath(path);
                    System.out.println("path:");
                    System.out.println(path);
                    File newFile = new File(path);
                    //上传
                    file.transferTo(newFile);

                }else{

                }
            }
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("上传花费时间："+String.valueOf(endTime-startTime)+"ms");

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", "success");

        return gson.toJson(result);
    }
    @RequestMapping("/bulkImportShowShuiXi")
    @ResponseBody
    public String bulkImportCu(HttpServletRequest request) throws Exception {
        long startTime=System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        String msg = poiExcelShuiXi.poiExceltoSql(oriFileName,fileName,filePath,fileUploadTime);
        String[] message = msg.split(" ");
        long  endTime=System.currentTimeMillis();
        String timeCost = String.valueOf(endTime-startTime)+"ms";
        System.out.println("批量导入花费时间："+timeCost);
        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg",message[0]);
        result.put("updateCount",message[1]);
        result.put("insertCount",message[2]);
        System.out.println(message[0]);
        System.out.println(message[1]);
        System.out.println(message[2]);
        result.put("time",timeCost);
        return gson.toJson(result);


    }

    @RequestMapping("/upload")
    public ResponseEntity<byte[]> upload(HttpSession session, HttpServletRequest request) throws IOException{
        File file=new File(request.getSession().getServletContext().getRealPath("export/mike")+"/temp.xls");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis())+".xls");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
        file.delete();
        return re;
    }


    @RequestMapping("/exportExcelShuiXi")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException{

        Map map = new HashMap();
        map.put("sx_hlmc", (String) request.getParameter("sx_hlmc"));
        map.put("sx_hlbh", (String) request.getParameter("sx_hlbh"));
        map.put("sx_hljb", (String) request.getParameter("sx_hljb"));
        map.put("sx_szly", (String) request.getParameter("sx_szly"));
        map.put("sx_sjhl", (String) request.getParameter("sx_sjhl"));
        map.put("sx_xjhlxl", (String) request.getParameter("sx_xjhlxl"));
        map.put("sx_hsqmj", (String) request.getParameter("sx_hsqmj"));
        map.put("sx_ldmj", (String) request.getParameter("sx_ldmj"));
        map.put("sx_cdmj", (String) request.getParameter("sx_cdmj"));
        map.put("sx_stmj", (String) request.getParameter("sx_stmj"));
        map.put("sx_hdmj", (String) request.getParameter("sx_hdmj"));
        map.put("sx_czmj", (String) request.getParameter("sx_czmj"));
        map.put("sx_ncmj", (String) request.getParameter("sx_ncmj"));
        map.put("sx_gjmj", (String) request.getParameter("sx_gjmj"));
        map.put("sx_wlymj", (String) request.getParameter("sx_wlymj"));
        map.put("sx_date", (String) request.getParameter("sx_date"));

        List<ShuiXi> allList = shuiXiService.selectForMap(map);

        ArrayList<String> title = new ArrayList<String>();
        Field[] fields=allList.get(0).getClass().getDeclaredFields();



        title.add("河流名称");
        title.add("河流编号");
        title.add("河流级别");
        title.add("所在流域");
        title.add("上级河流");
        title.add("下级河流序列");
        title.add("汇水区面积");
        title.add("林地面积");
        title.add("草地面积");
        title.add("水田面积");
        title.add("旱地面积");
        title.add("城镇居民用地面积");
        title.add("农村居民用地面积");
        title.add("公交建设用地面积");
        title.add("未利用土地面积");
        title.add("年份");



        response.setContentType("application/binary;charset=UTF-8");
        String fileName=new String(("temp").getBytes(),"UTF-8");
        String path = request.getSession().getServletContext().getRealPath("export/mike");
        try{
            ServletOutputStream out=response.getOutputStream();
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            genExcelShuiXi(allList,title, out, fields,path);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private void genExcelShuiXi(List<ShuiXi> allList, ArrayList<String> title, ServletOutputStream out, Field[] fields, String path){
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("水系");
        HSSFRow row;
        HSSFCell cell;

        row = sheet.createRow(0);//创建表格行
        for(int j = 0; j < title.size(); j++) {
            cell = row.createCell(j);//根据表格行创建单元格
            cell.setCellValue(String.valueOf(title.get(j)));
        }

        try {
            for(int i = 0; i < allList.size(); i++) {
                row = sheet.createRow(i+1);//创建表格行
                ShuiXi temp = allList.get(i);
                for(int j=0;j<fields.length-1;j++){
                    Field f = temp.getClass().getDeclaredField(fields[j].getName());
                    f.setAccessible(true);
                    Object o = f.get(temp);
                    cell = row.createCell(j);
                    if(o == null){
                        o ="";
                    }
                    cell.setCellValue(o.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("error1");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path+"/temp.xls");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
