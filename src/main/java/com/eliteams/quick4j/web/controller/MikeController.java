package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.*;

@Controller
@RequestMapping("/mike")
public class MikeController {

    @Resource
    private ShuiXiService shuixiService;

    @Resource
    private HlswService hlswService;

    @Resource
    private PollSourceService pollsourceService;
    @Resource
    private PollFactoryService pollfactoryService;

    @Resource
    private MikeService mikeService;

    @RequestMapping("/searchAllQiYe")
    @ResponseBody
    public List<PollSource> getQiYeList(HttpServletRequest request,String szlymc,String snscmc, String tjnf)  {
        szlymc =request.getParameter("szlymc");
        snscmc = request.getParameter("snscmc");
        tjnf = request.getParameter("tjnf");

        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",snscmc);
        map1.put("sx_szly",szlymc);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();




        HashMap map = new HashMap();
        map.put("snstdm",hlbh);
        map.put("snstmc", snscmc);
        map.put("tjnf", tjnf);
        List<PollSource> list=pollsourceService.selectForM(map);

        return  list;
    }


    @RequestMapping("/test")
    @ResponseBody
    public HashMap test(HttpServletRequest request,String szlymc,String snscmc, String time)  {
        szlymc =request.getParameter("lyname");
        snscmc = request.getParameter("hlname");
        time = request.getParameter("time");

        HashMap map = new HashMap();
        map.put("mike_lymc",szlymc);
        map.put("mike_hlmc", snscmc);
        map.put("mike_mnnf", time);
        List<MikeJbxx> list=mikeService.selectOne(map);
        HashMap h = new HashMap();
        if(list.size()!=0){
            h.put("h",1);
        }else {
            h.put("h",0);
        }

        return h;
    }
    @RequestMapping("/startmoni")
    @ResponseBody
    public void startmoni(HttpServletRequest request,String szlymc,String snscmc, int time,String name,int hlswtime,String shujuly,String yiji,String erji,String sanji,String siji,String wuji,String shuixi,String ganliu) throws IOException {
        szlymc =request.getParameter("lyname");
        snscmc = request.getParameter("hlname");
        time = Integer.parseInt(request.getParameter("time"));
        hlswtime = Integer.parseInt(request.getParameter("hlswtime"));
        name =request.getParameter("name");
        shujuly =request.getParameter("shujuly");
        yiji =request.getParameter("yiji");
        erji =request.getParameter("erji");
        sanji =request.getParameter("sanji");
        siji =request.getParameter("siji");
        wuji =request.getParameter("wuji");
        shuixi=request.getParameter("shuixi");
        ganliu=request.getParameter("ganliu");



        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",snscmc);
        map1.put("sx_szly",szlymc);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();

        MikeJbxx m = new MikeJbxx();
        m.setMikeHlmc(snscmc);
        m.setMikeLymc(szlymc);
        m.setMikeHlbh(hlbh);
        m.setMikeMnnf(time);
        m.setMikeSwnf(hlswtime);
        m.setMikeSjly(shujuly);
        m.setMikeSxmc(shuixi);
        m.setMikeGl(ganliu);
        m.setMikeFamc(name);
        String test11="C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+time+"\\"+name;
        m.setMikeCclj(test11);
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        m.setMikeFxsj(Integer.parseInt(year));
        //模拟指标？？？？？？？？？？？？？？？？？？？？？
        if(!yiji.equals("0")){
            m.setMike1jhl(yiji);
        }
        if(!siji.equals("0")){
            m.setMike4jhl(siji);
        }
        if(!erji.equals("0")){
            m.setMike2jhl(erji);
        }
        if(!sanji.equals("0")){
            m.setMike3jhl(sanji);
        }
        if(!wuji.equals("0")){
            m.setMike5jhl(wuji);
        }




        mikeService.insertSelective(m);

//        HashMap map = new HashMap();
//        map.put("mike_lymc",szlymc);
//        map.put("mike_hlmc", snscmc);
//        map.put("mike_mnnf", time);
//        List<MikeJbxx> list=mikeService.selectOne(map);
//        HashMap h = new HashMap();

        String source ="C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+"2017\\副本";
        String dest="C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+time+"\\"+name;
        String f2="C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+time;
        File file=new File(f2);
        if(!file.exists()){//如果文件夹不存在
            file.mkdir();//创建文件夹
        }
        copy(source, dest);

        String  str7 =hlswtime+"0101";
        String str1 = "C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+time+"\\"+name+"\\"+"py.txt";
        String str2 = "C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+time+"\\"+name+"\\"+"1.dfs0"+","+hlswtime+","+snscmc+","+hlbh+","+str7+","+"1402"+","+"24";
        writeToText(str2,str1);
        String str3="C:\\Users\\Administrator\\Desktop\\mikeio-master\\tests\\mytest14.py";
        createdfs0(str3,str1);

        String str4="C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MzShell-Chinese.exe";
        String str5= "C:\\Users\\Administrator\\Desktop\\project\\"+szlymc+"\\"+snscmc+"\\"+time+"\\"+"2017模拟文件.sim11";

        runMike(str4,str5);


    }




    public void create(HttpServletRequest request,String szlymc,String snscmc, String time) {

        File file = new File("C:\\Users\\Administrator\\Desktop\\project" + szlymc + "\\" + snscmc + "\\" + time+"\\"+"方案1");
        if (!file.exists()) {//如果文件夹不存在
            file.mkdir();//创建文件夹
        }

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
        list = removeDuplicate_2(list);
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

    @RequestMapping("/getShujunf")
    @ResponseBody
    public List<PollSource>  getShujunf(HttpServletRequest request, String sj, String hlname, String lyname){
        sj = request.getParameter("sj");
        lyname =request.getParameter("lyname");

        hlname = request.getParameter("hlname");
        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);

        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("SNSTMC",hlname);
        map.put("SNSTDM", hlbh);
        List<PollSource> listone =new ArrayList<PollSource>();
        if(sj.equals("huantong")){
            listone =pollsourceService.getShuiwennf(map);
        }

        return listone;
    }

    @RequestMapping("/getShuiwennf")
    @ResponseBody
    public ArrayList<Integer>  getShuiwennf(HttpServletRequest request,String time,String lyname,String hlname){
        time = request.getParameter("time");
        lyname =request.getParameter("lyname");
       hlname = request.getParameter("hlname");



        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("hlsw_hlmc",hlname);
        map.put("hlsw_hlbh", hlbh);
        ArrayList<Integer> listone =new ArrayList<Integer>();
        listone =hlswService.selectDate(map);
        Integer i = 0;
        if(time !=null){
           i = Integer.valueOf(time);
        }






        if(time.equals("2017")||time.equals("99")){
            return listone;
        }else{
            if(listone.contains(i)){
                listone.clear();
                listone.add(i);
                return listone;
            }else{
                listone.clear();
                listone.add(2017);
                return listone;
            }
        }




    }

    @RequestMapping("/getQiye")
    @ResponseBody
    public List<PollSource>  getQiye(HttpServletRequest request,String time,String lyname,String hlname,String monizb){
        time = request.getParameter("time");
        lyname =request.getParameter("lyname");
        hlname = request.getParameter("hlname");
        monizb = request.getParameter("monizb");


        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("SNSTMC",hlname);
        map.put("SNSTDM", hlbh);
        map.put("TJNF", time);


        List<PollSource> listone =new ArrayList<PollSource>();
        listone =pollsourceService.getQiye(map);

        return listone;

    }


    @RequestMapping("/getWsc")
    @ResponseBody
    public List<PollFactory>  getWsc(HttpServletRequest request, String time, String lyname, String hlname, String monizb){
        time = request.getParameter("time");
        lyname =request.getParameter("lyname");
        hlname = request.getParameter("hlname");
        monizb = request.getParameter("monizb");


        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("SNSTMC",hlname);
        map.put("SNSTDM", hlbh);
        map.put("TJNF", time);


        List<PollFactory> listone =new ArrayList<PollFactory>();
        listone =pollfactoryService.getWsc(map);

        return listone;

    }


    @RequestMapping("/searchRiverName")
    @ResponseBody
    public List test(HttpServletRequest request,String name,HttpServletResponse response)  {
        name = request.getParameter("name");
        HashMap map =new HashMap();
        map.put("sx_hlmc",name);
        ArrayList<ShuiXi> list = new ArrayList<>();
        ArrayList<String> riverlist = new ArrayList<>();
        list = shuixiService.getRiverName(map);
        for (ShuiXi s : list){
            riverlist.add(s.getSxHlmc());
        }


        return  riverlist;
    }


    @RequestMapping("/getResShow")
    @ResponseBody
    public HashMap get(HttpServletRequest request  ) throws IOException {
        String str1="";
        String str2="";
        String str3= "0.00";
        res2txt(str1,str2);

        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

        list = readTxt("C:\\Users\\Administrator\\Desktop\\haha\\2.txt");
        int totalnum  =list.size()-2;

        int i = 0;

        for(String str : list.get(0)){
            if (str .equals("COD")){
                i++;
            }
        }
         System.out.print("结果文件COD数:"+i);

        int j = 0;
        for(String str :list.get(1)){
            if (str .equals(str3)){
                break;
            }
            j++;
        }
        j = j+6;
        System.out.print("计划点所在位数:"+j);

        List l1 = new ArrayList();
        l1.add("标准值");
        l1.add("监测值");
        l1.add("实测值");


        List l21 = new ArrayList();
        List l22 = new ArrayList();
        List l23= new ArrayList();
        for(int p = 2;p<totalnum-2;p++){
            String str10 =list.get(p).get(1)+"月"+list.get(p).get(2)+"日";
            if((str10).equals("1月1日")||(str10).equals("2月1日")||(str10).equals("3月1日")||(str10).equals("4月1日")
                   ||(str10).equals("5月1日")||(str10).equals("6月1日")||(str10).equals("7月1日")||(str10).equals("8月1日")
                 ||(str10).equals("9月1日")||(str10).equals("10月1日")||(str10).equals("11月1日")||(str10).equals("12月1日")){
                l23.add(list.get(p).get(j));
                l21.add("123");
                l22.add("456");
            }

        }


        List l2 = new ArrayList();
        l2.add(l21);
        l2.add(l22);
        l2.add(l23);
        //  {'categ': ['男', '女'], 'data': [[], [3, 75, 25, 5, 1, 0]], 'name': ['青少年', '青年人', '中年人', '老年前期', '老年人', '长寿老人']}
        List l3 = new ArrayList();
        for(int p = 2;p<totalnum;p++){

            String str10 =list.get(p).get(1)+"月"+list.get(p).get(2)+"日";
            if((str10).equals("1月1日")||(str10).equals("2月1日")||(str10).equals("3月1日")||(str10).equals("4月1日")
                    ||(str10).equals("5月1日")||(str10).equals("6月1日")||(str10).equals("7月1日")||(str10).equals("8月1日")
                    ||(str10).equals("9月1日")||(str10).equals("10月1日")||(str10).equals("11月1日")||(str10).equals("12月1日")){
                l3.add(str10);
            }
//            else{
//                l3.add(" ");
//            }



        }

        HashMap h =new HashMap();
        h.put("title","COD排放现状与水质响应分析图");
        h.put("categ",l1);
        h.put("data",l2);
        h.put("name",l3);
        return h;


    }

    public static  ArrayList<String>  String2Arratlist(String str){
        ArrayList<String> point = new ArrayList<String>();
        if(str!= ""){
            String[] strlist = str.split(" ");

            for(String string : strlist ){
                if(!string.equals("")){
                    point.add(string);
                }

            }
        }

        return  point;
    }



    public static ArrayList<ArrayList<String>> readTxt(String txtPath) {
        File file = new File(txtPath);
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuffer sb = new StringBuffer();
                String text = null;
                int i =21;
                int j =-1;
                ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
                while(j+1 <= i &&(text = bufferedReader.readLine()) != null){

                    if(text.startsWith("YYYY")){
                        String  str = text;
                        all.add(String2Arratlist(str));
                    }
                    if(j+1 == i ){
                        String  str2 = text;
                        all.add(String2Arratlist(str2));
                    }
                    j++;
                }

                String text2 = null;
                while((text2 = bufferedReader.readLine()) != null){
                    if(!text2.startsWith("=")&& text2!= "\n"){
                        all.add(String2Arratlist(text2));
                    }
                }
                return  all;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }



    public static void res2txt(String str1,String str2) throws IOException {
        try {


            System.out.println("start");

            str1= "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\res11read.exe -allres";
            str1 +=" "+"C:\\Users\\Administrator\\Desktop\\haha\\2.res11 C:\\Users\\Administrator\\Desktop\\haha\\3.txt";
            Process pr=Runtime.getRuntime().exec(str1);

            System.out.println("end");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private static void copy(String f1, String f2) throws IOException {
        File file1 = new File(f1);
        File file=new File(f2);
        if(!file.exists()){//如果文件夹不存在
            file.mkdir();//创建文件夹
        }
        File[] flist = file1.listFiles();
        for (File f : flist) {
            if (f.isFile()) {
                copyFile2(f.getPath(), f2 + "\\" + f.getName()); //调用复制文件的方法
                System.out.println("原路径[" + f.getPath() + "] 被复制路径[" + f2 + "/" + f.getName() + "]");
            } else if (f.isDirectory()) {
                copyFile1(f.getPath(), f2 + "\\" + f.getName()); //调用复制文件夹的方法
                System.out.println("原路径[" + f.getPath() + "] 被复制路径[" + f2 + "/" + f.getName() + "]");
            }
        }
    }

    /**
     * 复制文件夹
     *
     * @throws IOException
     */
    public static void copyFile1(String f1, String f2) throws IOException {
        //创建文件夹
        File file = new File(f2);
        if (!file.exists()) {
            file.mkdirs();
        }
        copy(f1, f2);
    }

    /**
     * 复制文件
     *
     * @throws IOException
     */
    public static void copyFile2(String f1, String f2) throws IOException {
        try {
            InputStream input = new FileInputStream(f1);
            OutputStream output = new FileOutputStream(f2);
            byte[] bt = new byte[1024];
            if ((input != null) && (output != null)) {
                while ((input.read(bt)) != (-1)) {
                    output.write(bt, 0, bt.length);
                }
            }
            input.close();
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToText(String musicInfo, String path) throws IOException {
        // 生成的文件路径
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        // write 解决中文乱码问题
        // FileWriter fw = new FileWriter(file, true);
        OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(musicInfo);
        bw.flush();
        bw.close();
        fw.close();

    }

    public static void createdfs0(String str1, String str2){
        try {
                    String[] args1 = new String[] { "python", str1, str2};
                    Process pr=Runtime.getRuntime().exec(args1);


                }catch(Exception e){
                    e.printStackTrace();
                }

    }

    public static void runMike(String str1,String str2) {
        Runtime rt = Runtime.getRuntime();
        Process p = null;
        String fileLac = "";
        try {
            String str = str1+" "+str2;
            //String str = "C:\\Program Files (x86)\\DHI\\2014\\bin\\x64\\MzShell-Chinese.exe  C:\\Users\\Administrator\\Desktop\\2017社河模拟\\Untitled1.sim11";
            Runtime.getRuntime().exec(str);
        } catch (Exception e) {
            System.out.println("open failure");
        }
    }

}