package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by lyq on 2019/9/16.
 */
public class FileTest {

    public static void fileDirectory(File dir) throws IOException {
        if (!dir.exists()) {
            throw new IllegalArgumentException(dir + "目录不存在");
        }
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }
        //只遍历出了当前路径下的文件夹或文件
//        String[] names = dir.list();
//        for (String name : names) {
//            System.out.println(dir + "\\" + name);
//        }
        File[] dirs = dir.listFiles();
        for (File file : dirs) {
            if (file.isDirectory()) {
                System.out.println(file);
                FileTest.fileDirectory(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
