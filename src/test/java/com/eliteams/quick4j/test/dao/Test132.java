package com.eliteams.quick4j.test.dao;

import java.io.*;

public class Test132 {

    public static void main(String[] args) {
       String str1 = "C:\\Users\\Administrator\\Desktopmytest14.exe";
        String str2 ="C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\细河\\2015\\测试\\py.txt";




        String str = str1+""+str2 ;
    createdfs0(str);






    }


    public static void createdfs0(String str) {
//        try {
//            String[] args1 = new String[]{"python", str1, str2};
//            Process pr = Runtime.getRuntime().exec(args1);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }




            try {

                Runtime.getRuntime().exec(str);
            } catch (Exception e) {
                System.out.println("open failure");
            }




    }


}