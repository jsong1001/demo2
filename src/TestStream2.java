import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author songjian
 * @create 2023-11-07-16:35
 */
public class TestStream2 {
    public static void main(String[] args) {
        File file = new File("f:/唐诗.txt");
        FileReader fir = null;
        try {
            fir= new FileReader(file);
            char[] all = new char[(int)(file.length())];
            try {
                fir.read(all);
                for(char c:all){
                    System.out.println(c);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != fir){
                try{
                    fir.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
