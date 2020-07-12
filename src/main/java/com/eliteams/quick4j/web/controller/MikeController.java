package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.model.MikeJbxx;
import com.eliteams.quick4j.web.model.Shui;
import com.eliteams.quick4j.web.service.MikeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

@Controller
@RequestMapping("/mike")
public class MikeController {




    @Resource
    private MikeService mikeService;


//    @RequestMapping("/getShuixi")
//    @ResponseBody
//    public List<Shui> filelist(Model model) {
//        String path = "C:\\Users\\Administrator\\Desktop\\project";
//        List<Object> list = new GetFiles().getFiles(path);
//        List<String> bb = new ArrayList<String>();
//        List<Shui> cc = new ArrayList<Shui>();
//        List<String> dd = new ArrayList<String>();
//
//        for (Object obj : list) {
//
//            // System.out.println(obj);
//            String a = (String) obj;
//            String b = "C:\\Users\\Administrator\\Desktop\\project\\";
//
//            String c = a.replace(b, "");
//            bb.add(c);
//
//        }
//        for (String str : bb) {
//            Shui s = new Shui();
//            int a = str.length();
//            String str2 = str.replace("\\", "");
//            int b = str2.length();
//            if (a == b) {
//                // shuixi.add(str);
//                dd.add(str);
//            }
//
//        }
//
//
//        List newList = new ArrayList();
//        for (Object o : dd) {
//            if (!newList.contains(o)) newList.add(o);
//        }
//        return newList;
//
//    }
//
//
//    @RequestMapping("/getYiJi")
//    @ResponseBody
//    public List<Shui> filelis(HttpServletRequest request, Model model) {
//        String shuixi = request.getParameter("shuixi");
//        String path = "C:\\Users\\Administrator\\Desktop\\project";
//        List<Object> list = new GetFiles().getFiles(path);
//        List<String> bb = new ArrayList<String>();
//        List<Shui> cc = new ArrayList<Shui>();
//
//
//        for (Object obj : list) {
//
//            // System.out.println(obj);
//            String a = (String) obj;
//            String b = "C:\\Users\\Administrator\\Desktop\\project\\";
//
//            String c = a.replace(b, "");
//            bb.add(c);
//
//        }
//        for (String str : bb) {
//            Shui s = new Shui();
//            int a = str.length();
//            String str2 = str.replace("\\", "");
//            int b = str2.length();
//            if (a - b == 1) {
//                String temp[] = str.split("\\\\");
//                if (temp[0].equals(shuixi)) {
//                    s.setShuixi(temp[0]);
//                    s.setYijiheliu(temp[1]);
//                    cc.add(s);
//                }
//            }
//        }
//
//        // model.addAttribute("addtwo",cc);
//
//        return cc;
//    }
//
//    @RequestMapping("/getMoNi")
//    @ResponseBody
//    public List<Shui> filels(HttpServletRequest request, Model model) {
//        String yiji = request.getParameter("yiji");
//        String path = "C:\\Users\\Administrator\\Desktop\\project";
//        List<Object> list = new GetFiles().getFiles(path);
//        List<String> bb = new ArrayList<String>();
//        List<Shui> cc = new ArrayList<Shui>();
//
//
//        for (Object obj : list) {
//
//
//            String a = (String) obj;
//            String b = "C:\\Users\\Administrator\\Desktop\\project\\";
//
//            String c = a.replace(b, "");
//            bb.add(c);
//
//        }
//        for (String str : bb) {
//            Shui s = new Shui();
//            int a = str.length();
//            String str2 = str.replace("\\", "");
//            int b = str2.length();
//            if (a - b == 2) {
//                String temp[] = str.split("\\\\");
//                if (temp[1].equals(yiji)) {
//                    s.setShuixi(temp[0]);
//                    s.setYijiheliu(temp[1]);
//                    s.setMoni(temp[2]);
//                    cc.add(s);
//                }
//            }
//        }
//
//        // model.addAttribute("addtwo",cc);
//
//        return cc;
//    }
//
//    @RequestMapping("/getFangan")
//    @ResponseBody
//    public List<Shui> filelwqs(HttpServletRequest request, Model model) {
//        String moni = request.getParameter("moni");
//        String yiji = request.getParameter("yiji");
//        String path = "C:\\Users\\Administrator\\Desktop\\project";
//        List<Object> list = new GetFiles().getFiles(path);
//        List<String> bb = new ArrayList<String>();
//        List<Shui> cc = new ArrayList<Shui>();
//
//
//        for (Object obj : list) {
//
//
//            String a = (String) obj;
//            String b = "C:\\Users\\Administrator\\Desktop\\project\\";
//
//            String c = a.replace(b, "");
//            bb.add(c);
//
//        }
//        for (String str : bb) {
//            Shui s = new Shui();
//            int a = str.length();
//            String str2 = str.replace("\\", "");
//            int b = str2.length();
//            if (a - b == 3) {
//                String temp[] = str.split("\\\\");
//                if (temp[2].equals(moni)&&temp[1].equals(yiji)) {
//                    s.setShuixi(temp[0]);
//                    s.setYijiheliu(temp[1]);
//                    s.setMoni(temp[2]);
//                    s.setFangan(temp[3]);
//                    cc.add(s);
//                }
//            }
//        }
//
//        // model.addAttribute("addtwo",cc);
//
//        return cc;
//    }
//
//    @RequestMapping("/newOne")
//    @ResponseBody
//    public List<MikeSelect> newOne(HttpServletRequest request, Model model) {
//        String sheng = request.getParameter("sheng");
//        String shi = request.getParameter("shi");
//        String qu = request.getParameter("qu");
//        String dateb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
//        String date = dateb.replaceAll("[[\\s-:punct:]]", "");
//
//        String path = "C:\\Users\\Administrator\\Desktop\\project";
//        path += "\\" + sheng + "\\" + shi + "\\" + qu + "\\" + date;
//        File dir = new File(path);
//        if (!dir.exists()) {// 判断目录是否存在
//            dir.mkdir();
//        }
//        List<MikeSelect> list= getShuJuList(shi,qu);
//        return list;
//    }

//    @RequestMapping("/openresult")
//    @ResponseBody
//    public void resultlist(HttpServletRequest request, String sheng, String shi, String qu, String hr) throws AWTException {
//
//        sheng = request.getParameter("sheng");
//        shi = request.getParameter("shi");
//        qu = request.getParameter("qu");
//        hr = request.getParameter("hr");
//        String path = "C:\\Users\\Administrator\\Desktop\\project";
//        path += "\\" + sheng + "\\" + shi + "\\" + qu + "\\" + hr;
//        HashMap<Long,String> h= search(path);
//        Long a = Long.valueOf(0);
//        for (Long key : h.keySet()) {
//
//            if(key>=a){
//                a = key;
//            }
//        }
//        String str  = "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MikeView.exe" + " " + path + "\\"+h.get(a) ;
//
//        try {
//
//            Runtime.getRuntime().exec(str);
//        } catch (Exception e) {
//            System.out.println("open failure");
//        }
////鼠标模拟
//        //sleep
//        try {
//            Thread.currentThread().sleep(1000);
//            System.out.println("执行延迟");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        openExe();
//
//    }




//    public List<MikeSelect> getShuJuList(String shi, String qu)  {
//
//
//        String sql = "SELECT * FROM mike_qy_htxx WHERE htqy_tjnf='"+qu+"' AND htqy_snstmc='"+shi+"' ";
//        System.out.println(sql);
//        PreparedStatement pstmt;
//        List<MikeSelect> list=new ArrayList<MikeSelect>();
//
//            try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env","root","root");
//                pstmt = (PreparedStatement)conn.prepareStatement(sql);
//                ResultSet rs = pstmt.executeQuery();
//                DecimalFormat df3 = new DecimalFormat("###.000");
//
//
//                while (rs.next()) {
//                    MikeSelect s = new MikeSelect();
//                    s.setQiyename(rs.getString("htqy_dwmc"));
//                    s.setLiuliang(df3.format(rs.getDouble("htqy_ll")));
//                    if(rs.getDouble("htqy_codnd")==0.0){
//                        s.setCodnd("无");
//                    }else{
//                        s.setCodnd(MikeController.double2ScientificNotation(rs.getDouble("htqy_codnd")));
//                    }
//
//
//
//                    if(rs.getDouble("htqy_codpfl")==0.0){
//                        s.setCodpfl("无");
//                    }else{
//                        String str1 = Double.toString(rs.getDouble("htqy_codpfl"));
//                        s.setCodpfl(str1);
//                    }
//
//                    if(rs.getDouble("htqy_tnnd")==0.0){
//                        s.setTnnd("无");
//                    }else{
//                        s.setTnnd(MikeController.double2ScientificNotation(rs.getDouble("htqy_tnnd")));
//                    }
//
//
//
//
//                    if(rs.getDouble("htqy_tnpfl")==0.0){
//                        s.setTnpfl("无");
//                    }else{
//                        String str2 = Double.toString(rs.getDouble("htqy_tnpfl"));
//                        s.setTnpfl(str2);
//                    }
//
//                    if(rs.getDouble("htqy_tpnd")==0.0){
//                        s.setTpnd("无");
//                    }else{
//                        s.setTpnd(MikeController.double2ScientificNotation(rs.getDouble("htqy_tpnd")));
//                    }
//
//                    if(rs.getDouble("htqy_tppfl")==0.0){
//                        s.setTppfl("无");
//                    }else{
//                        String str3 = Double.toString(rs.getDouble("htqy_tppfl"));
//                        s.setTppfl(str3);
//
//                    }
//
//                    //  System.out.println("cod浓度"+rs.getDouble("htqy_codnd")+"cod排放量"+rs.getDouble("htqy_codpfl")+"总氮浓度"+rs.getDouble("htqy_tnnd")+"总氮排放量"+rs.getDouble("htqy_tnpfl")+"总磷浓度"+rs.getDouble("htqy_tpnd")+"总磷排放量"+rs.getDouble("htqy_tppfl"));
//                   list.add(s);
//                }
//
//
//                conn.close();
//            }catch(ClassNotFoundException e){
//                e.printStackTrace();
//            }catch(SQLException e){
//                e.printStackTrace();
//            }
//            return  list;
//        }
//    @RequestMapping("/searchAllQiYe")
//    @ResponseBody
//    public List<MikeSelect> getQiYeList(HttpServletRequest request,String snscmc, String tjnf)  {
//        snscmc = request.getParameter("snscmc");
//        tjnf = request.getParameter("tjnf");
//
//        String sql = "SELECT * FROM mike_qy_htxx2 WHERE htqy_tjnf='"+tjnf+"' AND htqy_snstmc='"+snscmc+"' ";
//        System.out.println(sql);
//        PreparedStatement pstmt;
//        List<MikeSelect> list=new ArrayList<MikeSelect>();
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env","root","root");
//            pstmt = (PreparedStatement)conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            DecimalFormat df3 = new DecimalFormat("###.000");
//
//
//            while (rs.next()) {
//                MikeSelect s = new MikeSelect();
//                s.setQiyename(rs.getString("htqy_dwmc"));
//                s.setLiuliang(df3.format(rs.getDouble("htqy_ll")));
//                if(rs.getDouble("htqy_codnd")==0.0){
//                    s.setCodnd("无");
//                }else{
//                    s.setCodnd(MikeController.double2ScientificNotation(rs.getDouble("htqy_codnd")));
//                }
//
//
//
//                if(rs.getDouble("htqy_codpfl")==0.0){
//                    s.setCodpfl("无");
//                }else{
//                    String str1 = Double.toString(rs.getDouble("htqy_codpfl"));
//                    s.setCodpfl(str1);
//                }
//
//                if(rs.getDouble("htqy_tnnd")==0.0){
//                    s.setTnnd("无");
//                }else{
//                    s.setTnnd(MikeController.double2ScientificNotation(rs.getDouble("htqy_tnnd")));
//                }
//
//
//
//
//                if(rs.getDouble("htqy_tnpfl")==0.0){
//                    s.setTnpfl("无");
//                }else{
//                    String str2 = Double.toString(rs.getDouble("htqy_tnpfl"));
//                    s.setTnpfl(str2);
//                }
//
//                if(rs.getDouble("htqy_tpnd")==0.0){
//                    s.setTpnd("无");
//                }else{
//                    s.setTpnd(MikeController.double2ScientificNotation(rs.getDouble("htqy_tpnd")));
//                }
//
//                if(rs.getDouble("htqy_tppfl")==0.0){
//                    s.setTppfl("无");
//                }else{
//                    String str3 = Double.toString(rs.getDouble("htqy_tppfl"));
//                    s.setTppfl(str3);
//
//                }
//
//
//
//                s.setJd(rs.getDouble("htqy_jdjz"));
//
//                s.setWd(rs.getDouble("htqy_wdjz"));
//
//               // System.out.println("cod浓度"+rs.getDouble("htqy_codnd")+"cod排放量"+rs.getDouble("htqy_codpfl")+"总氮浓度"+rs.getDouble("htqy_tnnd")+"总氮排放量"+rs.getDouble("htqy_tnpfl")+"总磷浓度"+rs.getDouble("htqy_tpnd")+"总磷排放量"+rs.getDouble("htqy_tppfl"));
//                list.add(s);
//            }
//
//
//            conn.close();
//        }catch(ClassNotFoundException e){
//            e.printStackTrace();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        return  list;
//    }
    @RequestMapping("/searchAllQiYeTwo")
    @ResponseBody
    public HashMap get2(HttpServletRequest request,String snscmc, String tjnf)  {
        List l1 = new ArrayList();
        l1.add("现状");
        l1.add("容量");


        List l21 = new ArrayList();
        l21.add(25987);
        l21.add(56875);
        l21.add(36547);
        l21.add(48732);
        l21.add(15648);
        List l22 = new ArrayList();
        l22.add(45678);
        l22.add(16523);
        l22.add(36254);
        l22.add(59874);
        l22.add(22145);
        List l2 = new ArrayList();
        l2.add(l21);
        l2.add(l22);
        //  {'categ': ['男', '女'], 'data': [[], [3, 75, 25, 5, 1, 0]], 'name': ['青少年', '青年人', '中年人', '老年前期', '老年人', '长寿老人']}
        List l3 = new ArrayList();
        l3.add("3月");
        l3.add("4月");
        l3.add("5月");
        l3.add("6月");
        l3.add("7月");


        HashMap h =new HashMap();
        h.put("categ",l1);
        h.put("data",l2);
        h.put("name",l3);
        return h;


    }
    @RequestMapping("/test")
    @ResponseBody
    public List test(HttpServletRequest request,String term,HttpServletResponse response)  {
        term = request.getParameter("term");

        String sql = "SELECT * FROM mike_qy_htxx2 WHERE htqy_dwmc like "+"'%"+term+"%'";
        System.out.println(sql);
        PreparedStatement pstmt;
        String json ="";
        List list =new ArrayList();
        HashMap map =new HashMap();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env","root","root");
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
         //   PrintWriter pw = response.getWriter();

            while (rs.next()) {
             // map.put("lable",rs.getString("htqy_dwmc"));
             //   map.put("value",rs.getString("htqy_dwmc"));
            list.add(rs.getString("htqy_dwmc"));
           //  l.add(map);
            }

         //   json = new Gson().toJson(l);


            conn.close();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }

        return  list;




    }
    public void toDfs0(String path) {
        StringBuffer sb = new StringBuffer();

        sb.append("\r\n");
        sb.append("时间");
        sb.append("/t");//服务器的DHI地址；
        sb.append("下游边界水位");
        sb.append("/t");
        sb.append("上游边界流量");
        sb.append("\r\n");
        sb.append("1996-08-11 08:00:00");
        sb.append("/t");
        sb.append("4.21356");
        sb.append("/t");
        sb.append("9.21356");
        sb.append("\r\n");
        sb.append("1996-08-11 08:30:00");
        sb.append("/t");
        sb.append("4.265456");
        sb.append("/t");
        sb.append("9.217856");
        sb.append("\r\n");

        String dateb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String date = dateb.replaceAll("[[\\s-:punct:]]", "");

        // File f = new File("C:\\Users\\Administrator\\Desktop" + "\\" + "ad11" + date + ".ad11");//新建文件
        try {
//            BufferedWriter bw = null;
//            FileWriter fw = null;
//
//           // fw = new FileWriter(f);
//            bw = new BufferedWriter(fw);
//            bw.write(sb.toString());
//            bw.flush();
//            bw.close();
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "ad11" + date + ".ad11"));
            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "dfs0" + date + ".dfs0", true), "GBK");
            osw.write(String.valueOf(sb));
            osw.flush();
            osw.close();
            System.out.println("dfs0文件生成成功");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


//    @RequestMapping("/list")
//    public String filelist(Model model) {
//        ArrayList<String> listFileName = new ArrayList<String>();
//        ArrayList<String> fileList = new ArrayList<String>();
//        getAllFileName("C:\\Users\\Administrator\\Desktop\\2017社河模拟\\", listFileName);
//        for (String name : listFileName) {
//            if (name.contains(".sim11")) {
//                fileList.add(name);
//            }
//        }
//
//
//        model.addAttribute("fileList", fileList);
//
//        return "mike/fileList";
//    }
//
//
//    @RequestMapping("/open")
//    public void filelist(HttpServletRequest request, String name) {
//
//        name = request.getParameter("name");
//        Runtime rt = Runtime.getRuntime();
//        Process p = null;
//        String fileLac = "";
//        try {
//            String str = "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MzShell-Chinese.exe" + " " + name;
//            Runtime.getRuntime().exec(str);
//        } catch (Exception e) {
//            System.out.println("open failure");
//        }
//    }
//
//
//    @RequestMapping("/resultlist")
//    public String resultlist(Model model) {
//        ArrayList<String> listFileName = new ArrayList<String>();
//        ArrayList<String> fileList = new ArrayList<String>();
//        getAllFileName("C:\\Users\\Administrator\\Desktop\\2017社河模拟\\", listFileName);
//        for (String name : listFileName) {
//            if (name.contains(".res11")) {
//                fileList.add(name);
//            }
//        }
//
//
//        model.addAttribute("resultList", fileList);
//
//        return "mike/resultList";
//    }
//
//
//    @RequestMapping("/openresult")
//    public void resultlist(HttpServletRequest request, String name) {
//
//        name = request.getParameter("name");
//        Runtime rt = Runtime.getRuntime();
//        Process p = null;
//        String fileLac = "";
//        try {
//            String str = "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MikeView.exe" + " " + name;
//            Runtime.getRuntime().exec(str);
//        } catch (Exception e) {
//            System.out.println("open failure");
//        }
//    }
//
//
//    public static void getAllFileName(String path, ArrayList<String> listFileName) {
//        File file = new File(path);
//        File[] files = file.listFiles();
//        String[] names = file.list();
//        if (names != null) {
//            String[] completNames = new String[names.length];
//            for (int i = 0; i < names.length; i++) {
//                completNames[i] = path + names[i];
//            }
//            listFileName.addAll(Arrays.asList(completNames));
//        }
//        for (File a : files) {
//            if (a.isDirectory()) {//如果文件夹下有子文件夹，获取子文件夹下的所有文件全路径。
//                getAllFileName(a.getAbsolutePath() + "\\", listFileName);
//            }
//        }
//    }
//
//
//    @RequestMapping("/toTxt")
//    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        ArrayList<Shuiwei> allList = new ArrayList<Shuiwei>();
//        Shuiwei s1 = new Shuiwei();
//        s1.setShangyoushuiwei("4.31296");
//        s1.setXiayoushuiwei("9.93889");
//        s1.setTime("1996-08-11 08:00:00");
//        Shuiwei s2 = new Shuiwei();
//        s2.setShangyoushuiwei("4.29448");
//        s2.setXiayoushuiwei("10.78341");
//        s2.setTime("1996-08-11 08:30:00");
//        allList.add(s1);
//        allList.add(s2);
//
//        ArrayList<String> title = new ArrayList<String>();
//        title.add("时间");
//        title.add("上游水位");
//        title.add("下游水位");
//
//
//
//        response.setContentType("application/binary;charset=UTF-8");
//        String fileName = new String(("temp").getBytes(), "UTF-8");
//        String datea = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
//        String date = datea.replaceAll("[[\\s-:punct:]]","");
//        String path = request.getSession().getServletContext().getRealPath("export/mike");
//
//        try {
//            ServletOutputStream out = response.getOutputStream();
//
//            response.setHeader("Content-disposition", "attachment; filename=" + fileName + date + ".txt");
//
//            toTxt(allList, title, path,out);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void toTxt(List<Shuiwei> list, ArrayList<String> title, String path,ServletOutputStream out){
//        StringBuffer sb = new StringBuffer();
//        sb.append("\r\n");
//        for (int j = 0; j < title.size(); j++) {
//            sb.append(title.get(j) + "\t");
//        }
//        sb.append("\r\n");
//        for (int i = 0; i < list.size(); i++) {
//            Shuiwei s = list.get(i);
//            String value = s.getTime() + "\t" + s.getShangyoushuiwei() + "\t" + s.getXiayoushuiwei()+"\r\n";
//            sb.append(value);
//        }
//        sb.append("\r\n");
//        String fileName = null;
//        try {
//            fileName = new String(("temp").getBytes(), "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String datea = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
//        String date = datea.replaceAll("[[\\s-:punct:]]","");
//
//        File f = new File(path+"\\"+fileName+ date+".txt");//新建文件
//        try {
//            BufferedWriter bw = null;
//            FileWriter fw = null;
//
//            fw = new FileWriter(f);
//            bw = new BufferedWriter(fw);
//            bw.write(sb.toString());
//            bw.flush();
//            bw.close();
//            int len=0;
//            byte[] buffer=new byte[1024];
//            InputStream in=new FileInputStream(path+"\\"+fileName+ date+".txt");
//            while((len=in.read(buffer))>0){
//                //将缓冲区数据输出到浏览器
//                out.write(buffer,0,len);
//            }
//            out.close();
//
//    } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    @RequestMapping("/toAd11")
//    public void toAd(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        //得到数据
//
//        //写项目路径（需要传值项目文件夹名）
//        String path = request.getSession().getServletContext().getRealPath("export/mike");
//        StringBuffer sb = new StringBuffer();
//
//        sb.append("\\\\" + "Created" + "\t");
//        String datea = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
//        sb.append("datea");
//        sb.append("\r\n");
//        sb.append("\\\\" + "DLL id" + "\t");
//        sb.append("");//服务器的DHI地址；
//        sb.append("\r\n");
//        sb.append("\\\\" + "PFS version :Feb" + "\t"+"2015 19:27:20");
//        sb.append("\r\n");
//        String fileName = null;
//
//
//        fileName = new String(("temp").getBytes(), "UTF-8");
//
//
//        String dateb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
//        String date = dateb.replaceAll("[[\\s-:punct:]]", "");
//
//        File f = new File(path + "\\" + fileName + date + ".txt");//新建文件
//        try {
//            BufferedWriter bw = null;
//            FileWriter fw = null;
//
//            fw = nb  ew FileWriter(f);
//            bw = new BufferedWriter(fw);
//            bw.write(sb.toString());
//            bw.flush();
//            bw.close();
//
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//
//    }


    //
//
//private String urlconvertor(String imagesurl1)
//{
// String tmpRootDir = Server.MapPath(System.Web.HttpContext.Current.Request.ApplicationPath.ToString());//获取程序根目录
//String imagesurl2 = imagesurl1.Replace(tmpRootDir, ""); //转换成相对路径
// imagesurl2 = imagesurl2.Replace(@"/", @"/");
////imagesurl2 = imagesurl2.Replace(@"Aspx_Uc/", @"");
//return imagesurl2;
// }

    HashMap<Long,String> res = new HashMap<>();
    public HashMap<Long,String> search(String path) {
        File dir = new File(path);

        File[] subFiles = dir.listFiles();       //获取e盘下所有的文件或文件夹对象

        if (null != subFiles) {
            for (File subFile : subFiles) {
                if (subFile.isDirectory())  {      //文件夹则递归寻找，后缀为jpg文件则输出名字
                    search(subFile.getAbsolutePath());}
                else if (subFile.isFile() && subFile.getName().endsWith(".res11")){
                    long lastModified = subFile.lastModified();

                    res.put(lastModified,subFile.getName());
                }
            }
        }
        return res;
    }


    public static void openExe() {

        String path = "C:\\Users\\Administrator\\Desktop\\2.exe";



        try {

            Runtime.getRuntime().exec(path);
            try {
                Thread.currentThread().sleep(1000);
                System.out.println("执行延迟2");
                pressF10();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            System.out.println("open failure");
        }


    }

    public  static void pressF10()
            throws AWTException
    {
        Robot r=new Robot();//创建自动化工具对象
        r.keyPress(KeyEvent.VK_F10);//按下左Contrl  keycode为17

    }

//科学记数法
    public static String double2ScientificNotation(double num){
        String str = String.format("%E", num);//获取直接格式化结果
        str = str.replace("E-0", "E-");//将E-0N处理为E-N
//处理结果
        String temp = str.substring(0,str.indexOf(".")+4);//前4位
//精确到小数点后两位
        String f = String.format("%.3f", Double.parseDouble(temp));
        str = f+str.substring(str.indexOf("E"));
        return str;
    }

    @RequestMapping("/selectLymc")
    @ResponseBody
    public List<String>  selectLymc(){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
           list.add(m.getMikeLymc());
        }
        list = removeDuplicate_2(list);

        return list;
    }
    @RequestMapping("/selectSxmc")
    @ResponseBody
    public List<String>  selectSxmc(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_lymc", (String) request.getParameter("lymc"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMikeSxmc());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/selectGl")
    @ResponseBody
    public List<String>  selectGl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_sxmc", (String) request.getParameter("sxmc"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMikeGl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select1jhl")
    @ResponseBody
    public List<String>  select1jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_gl", (String) request.getParameter("gl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike1jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select2jhl")
    @ResponseBody
    public List<String>  select2jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_1jhl", (String) request.getParameter("yjhl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike2jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select3jhl")
    @ResponseBody
    public List<String>  select3jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_2jhl", (String) request.getParameter("ejhl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike3jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select4jhl")
    @ResponseBody
    public List<String>  select4jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_3jhl", (String) request.getParameter("sanjhl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike4jhl());
        }
        return list;
    }
    @RequestMapping("/select5jhl")
    @ResponseBody
    public List<String>  select5jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_4jhl", (String) request.getParameter("sijhl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike5jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
   //去重方法
    public static List removeDuplicate_2(List list){
        HashSet set = new HashSet(list);
        //使用LinkedHashSet可以保证输入的顺序
        //LinkedHashSet<String> set2 = new LinkedHashSet<String>(list);
        list.clear();
        list.addAll(set);
        return list;
    }
    
}