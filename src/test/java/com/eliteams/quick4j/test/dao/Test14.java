package com.eliteams.quick4j.test.dao;

import java.io.*;

public class Test14 {
    public static void main(String[] args) throws IOException {
//        File file=new File("C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\细河\\2020");
//        if(!file.exists()){//如果文件夹不存在
//            file.mkdir();//创建文件夹
//        }

//            String source = "C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\社河\\2017\\方案1\\2017社河断面文件 -增加断面数.xns11";
//            String dest="C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\社河\\2017\\方案1\\2.xns11";
//
//            FileInputStream fi=null;
//            FileOutputStream fo=null;
//
//            try {
//                //初始化IO流对象
//                fi=new FileInputStream(source);
//                fo=new FileOutputStream(dest);
//
//                //定义字节数组，用来存放输入流读取的字节
//                byte[] b=new byte[1024];
//                //定义一个整型len，主要用来记录输入流读取字节长度，
//                //1 判断文件是否读取完毕 2 确定输出流写入到文件的字节数
//                int len=0;
//
//                //输入流读取文件到末尾时，返回-1
//                while((len=fi.read(b))!=-1) {
//                    //输出流将字节数组写入到文件中去
//                    fo.write(b, 0, len);
//                }
//
//                System.out.println("复制完成!");
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//                //关闭IO流
//                if(fi!=null) {
//                    try {
//                        fi.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                if(fo!=null) {
//                    try {
//                        fo.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//
//        }


        copy("C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\细河\\2017\\副本", "C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\细河\\2015\\方案2");
        System.out.println("复制成功!");


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

}