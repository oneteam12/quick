package com.eliteams.quick4j.test.dao;

import java.io.*;

public class Tese15 {
    public static void main(String[] args) throws IOException {
        String str1 = "C:\\Users\\Administrator\\Desktop\\project\\辽河流域\\细河\\2015\\测试\\1.dfs0,2016,社河,BA06060000,20160101,1402,24";
        String str2 ="C:\\Users\\Administrator\\Desktop\\project\\55\\py.txt";
        writeToText(str1,str2);
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
}
