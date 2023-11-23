import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author songjian
 * @create 2023-11-07-16:11
 */
public class TestStream {
    public static void main(String[] args) {
        File f= new File("f:/唐诗.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(f);
            byte[] all = new byte[(int)f.length()];
            try {
                fis.read(all);
            }catch (Exception e){
                e.printStackTrace();
            }
            for(byte bt:all){
                System.out.println(bt);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            if(null != fis){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
