package io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lyq on 2019/9/16.
 */
public class IOUtil {
    public static void printHex(String fileName) throws IOException {
        //把文件作为字节流进行操作
        FileInputStream fis = new FileInputStream(fileName);
        //存字节
        int b;
        //计数，用于每10个分组
        int i = 1;
        while ((b = fis.read()) != -1) {
            //16进制前补零
            if (b < 0xf) {
                System.out.print("0");
            }
            //转为16进制输出
            System.out.print(Integer.toHexString(b) + " ");
            //每10位一组输出
            if (i++ % 10 == 0) {
                System.out.println();
            }
        }
        //关闭流
        fis.close();
    }

    //方式2读取
    public static void printHexByByteArray(String fileName) throws IOException {
        FileInputStream in = new FileInputStream(fileName);
        /**
         * 从 int 中批量读取字节，放入到 bytes 这个字节数组中，
         * 冲第0个位置开始放，最多放 buf.length 个
         * 返回的是读到的字节的个数
         */
        byte[] buf = new byte[8 * 1024];
        // 方法1
//        int bytes = fis.read(buf, 0, buf.length); //一次性读完，说明字节数组足够大
//        int j = 1;
//        for (int i = 0; i < bytes; i++) {
//            if (buf[i] < 0xff) {
//                System.out.print("0");
//            }
//            System.out.print(Integer.toHexString(buf[i]) + " ");
//            if (j++ % 10 == 0) {
//                System.out.println();
//            }
//        }
        //方法2
        int bytes = 0;
        //计数
        int j = 1;
        //一组一组读，也就是以 byte[] buf 位单位读取
        while ((bytes = in.read(buf, 0, buf.length)) != -1) {
            //每个单位里遍历转16进制
            for (int i = 0; i < bytes; i++) {
                System.out.println(Integer.toHexString(buf[i] & 0xff) + "");
            }
            //每10位一组
            if (j++ % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void test(String fileName) throws IOException {
        FileInputStream in = new FileInputStream(fileName);
        byte[] buf = new byte[8 * 1024];
        int i;
        while ((i = in.read(buf, 0, buf.length)) != -1) {
            System.out.println();
        }
    }

    public static void copyFile(File srcFile, File testFile) throws IOException {
        Long time = System.currentTimeMillis();
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("不存在");
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException("不是文件");
        }
        if (!testFile.exists()) {
            testFile.createNewFile();
        }
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(testFile, true);
        byte[] bytes = new byte[2 * 1024];
        int i;
        while ((i = in.read(bytes, 0, bytes.length)) != -1) {
            out.write(bytes, 0, bytes.length);
            out.flush();
        }
        System.out.println(System.currentTimeMillis() - time);
        in.close();
        out.close();
    }

    public static void copyFile1(File srcFile, File testFile) throws IOException {
        Long time = System.currentTimeMillis();
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("不存在");
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException("不是文件");
        }
        if (!testFile.exists()) {
            testFile.createNewFile();
        }
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(testFile, true);
        int b;

        while ((b = in.read()) != -1) {
            out.write(b);
            out.flush();
        }
        System.out.println(System.currentTimeMillis() - time);
        in.close();
        out.close();
    }

    public static void controlView(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException("文件不存在");
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("不是文件");
        }
        FileInputStream in = new FileInputStream(file);
        byte[] bytes = new byte[8 * 1024];
        int i;
        while ((i = in.read(bytes, 0, bytes.length)) != -1) {
            System.out.println(new String(bytes,0,bytes.length));
        }
    }
}
