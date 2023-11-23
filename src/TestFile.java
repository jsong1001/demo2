import java.io.File;
import java.util.Date;

/**
 * @author songjian
 * @create 2023-11-06-16:25
 */
public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("f:/LOLFolder");
        System.out.println("f1的绝对路径是" + f1.getAbsolutePath());
        File f2 = new File("LOL.txt");
        System.out.println("f2的绝对路径是"+ f2.getAbsolutePath());
        File f3 = new File(f1,"LOL.xlsx");
        System.out.println("f3的绝对路径是" + f3.getAbsolutePath());

        System.out.println("当前的文件是" + f3);
        System.out.println("判断是否存在" + f3.exists());
        System.out.println("是否为文件夹" + f3.isDirectory());
        System.out.println("是否为文件" + f2.isFile());
        System.out.println("文件的长度" + f3.length());
        long time = f3.lastModified();
        Date date = new Date(time);
        System.out.println("最后修改时间" + date);
        File f4 = new File("f:/LOLFolder/Lolddd.xlsx");
        f3.renameTo(f4);
        System.out.println("重命名后的绝对路径" + f3);
        System.out.println(f3.exists());
    }
}
