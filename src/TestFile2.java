import java.io.File;

/**
 * @author songjian
 * @create 2023-11-06-16:42
 */
public class TestFile2 {
    public static void main(String[] args) {
        File file = new File("f:/myproject/RuoYi-Vue-master");
        String[] fs = file.list();
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i]);
        }

        File[] fl = file.listFiles();
        for (File fll:fl){
            System.out.println(fll);
        }

        File file2 = new File("f:/myproject/RuoYi-Vue-master/README.md");
        File parentFile = file2.getParentFile();
        String parent = file2.getParent();
        System.out.println(parent);
        System.out.println(parentFile);

        for(File fll:fl){
            String name = fll.getName();
            if( name == "f:/myproject/RuoYi-Vue-master/星际.txt"){
                fll.delete();
            }
        }

    }
}
