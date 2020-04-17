package io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * File 类的使用
 * 1、File 类的一个对象，代表一个文件活一个文件目录（俗称：文件夹）。
 * 2、File 类声明在java.io包下。
 * 3、File 类中涉及到关于文件活文件目录的创建、删除、重命名、修改时间、文件大小等方法，
 *      并未涉及到写入或读取文件内用的操作。如果需要读取或写入文件内容，必须用IO流来完成。
 * 4、后续 File 类的对象常会作为参数传递到流的构造器中，指明读取或写入的“终点”
 */
public class FileDemo {
    /*
    1、如何创建一个File 类的实例。
        File(String filePath)
        File(String parentPath,String childPath)
        File(File parentFile,String childPath)

    2、
    相对路径：相较于某个路径下，指明的路径。
    绝对路径：包含盼复在内的文件或文件目录的路径。

    3、路径分隔符
        windows：\\
        unix：/
     */
    @Test
    public void test1() {
        //构造器1
        File file1 = new File("hello.txt");//相对于当前的module，src同级。
        File file2 = new File("D:\\Test\\javatest\\src\\io\\he.txt");
        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("D:\\Test", "javatest");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3, "hi.txt");
        System.out.println(file4);
    }

    /*
    public String getAbsolutePath(): 获取绝对路径
    public String getPath(): 获取路径
    public String getName(): 获取名称
    public String getParent(): 获取上层文件目录路径。若无，返回 null
    public Long length(): 获取文件长度（即：字节数）。不能获取目录的长度。
    public Long LastModified(): 获取最后一次的修改时间，毫秒值。
    如下的两个方法适用于文件目录：
    public String[] list(); 获取指定目录下的所有文件或者文件目录的名称数组。
    public File[] listFiles(): 获取指定目录下的所有文件或者文件目录的 File 数组。
     */
    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\hi.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

    }

    @Test
    public void test3() {
        File file = new File("D:\\Test\\javatest\\src");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    /*
    public boolean renameTo(File dest):把文件重命名为指定的文件路径。
    比如：file1.renameTo(file2)为例：
        要想保证返回ture，需要file1在硬盘中是存在的，且file2不能在硬盘中存在。
     */
    @Test
    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\hi.txt");
        boolean rename = file1.renameTo(file2);
    }

    @Test
    public void test5() {
        File file1 = new File("hello.txt");
        file1 = new File("hello.txt");
        System.out.println(file1.isDirectory());//是否是文件夹
        System.out.println(file1.isFile());//是否为文件
        System.out.println(file1.exists());//判断在硬盘中是否存在。
        System.out.println(file1.canRead());//是否可读
        System.out.println(file1.canWrite());//是否可写
        System.out.println(file1.isHidden());//是否隐藏

    }

    /*
    创建硬盘中对应的文件或文件目录
    public boolean createNewFile():创建文件。若文件存在，则不创建，返回falst
    public boolean madir():创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
    public boolean madirs():创建文件目录。如果上层文件目录不存在，一并创建。
    注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目路径下。

    删除磁盘中的文件或文件目录
    public boolean delete():删除文件或者文件夹。
    删除注意事项：
    Java 中的删除不走回收站。
     */
    @Test
    public void test6() throws IOException {

        File file1 = new File("hi.txt");
        if (!file1.exists()) {
            file1.createNewFile();
            System.out.println("创建成功");
        } else {
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test7(){
        //文件目录的创建
        File file1 = new File("d:\\io\\io1");
        boolean mkdir = file1.mkdir();
        if (mkdir) {
            System.out.println("创建成功1");
        }

        File file2 = new File("d:\\io\\io2");
        boolean mkdir1 = file1.mkdirs();
        if (mkdir) {
            System.out.println("创建成功2");
        }
    }


}
