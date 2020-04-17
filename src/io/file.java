package io;

import javax.sound.midi.Soundbank;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class file {
    public static void main(String[] args) throws IOException {
        File file = new File("./测试文件夹");
        //判断文件是否存在
        if (!file.exists()) {
            //创建文件夹。创建多个文件夹用 file.mkdirs();
            file.mkdir();
        }
        //获取相对路径：.\测试文件夹
        System.out.println(file.getPath());
        //获取绝对路径：D:\Test\javatest\.\测试文件夹
        System.out.println(file.getAbsolutePath());
        //获取名称：测试文件夹
        System.out.println(file.getName());
        //判断是否为文件夹： true
        System.out.println(file.isDirectory());
        //判断是否为文件: false
        System.out.println(file.isFile());

        //创建新文件
        File file1 = new File(file.getAbsolutePath(), "测试文本.txt");
        if (!file1.exists()) {
            //创建文件
            file1.createNewFile();
        }
        /**
         * 一般来说 java file.delete失败 有以下几个原因
         * 1.看看是否被别的进程引用，手工删除试试(删除不了就是被别的进程占用)
         * 2.file是文件夹 并且不为空，有别的文件夹或文件，
         * 3.极有可能有自己前面没有关闭此文件的流(我遇到的情况)
         */
        file.delete();
        String [] names = file.list();
        for (String name:names) {
            System.out.println(name);
        }
    }
}
