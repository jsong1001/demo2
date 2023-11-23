/**
 * @author songjian
 * @create 2023-11-07-15:39
 */
public class TestMath {
    public static void main(String[] args) {
        float f1 = 5.4f;
        float f2 = 5.6f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));
        System.out.println((int)(Math.random()*1000));
        System.out.println(Math.sqrt(12));
        System.out.println(Math.pow(3,8));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        int count = 1;
        for (int i = 3; i <10000000 ; i+=2) {
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    continue;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
