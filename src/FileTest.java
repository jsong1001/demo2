import java.io.File;

/**
 * @author songjian
 * @create 2023-11-06-17:11
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:/WINDOWS");
        File[] fl = file.listFiles();
        File largestFile = fl[0];
        File smallestFile = fl[3];
        int length1 = (int)(smallestFile.length());
        int length = (int)(largestFile.length());
        for(File fll:fl){
            System.out.println(fll);
            System.out.println((int)(fll.length()));
            if((int)(fll.length()) > length){
                largestFile = fll;
                length = (int)(fll.length());
            }
            if((int)(fll.length()) < length1){
                if((int)(fll.length())>0){
                    smallestFile = fll;
                    length1 = (int)(fll.length());
                }
            }
        }
        System.out.println(largestFile);
        System.out.println(length);
        System.out.println(smallestFile);
        System.out.println(length1);
    }
}
