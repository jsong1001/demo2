import java.io.File;
import java.io.FileWriter;

/**
 * @author songjian
 * @create 2023-11-07-16:45
 */
public class TestStream3 {
    public static void main(String[] args) {
        File file = new File("f:/唐诗.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            String st = "这是插入的话";
            fw.write(st);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != fw){
                try {
                    fw.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
