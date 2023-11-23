/**
 * @author songjian
 * @create 2023-11-07-11:28
 */
public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer integer = new Integer(i);
        int i2 = integer.intValue();
        System.out.println(integer);
        System.out.println(i2);
        System.out.println(integer instanceof Number);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        short sho = 12;
        Short sh = new Short(sho);
        Short sh2 = sho;
        short sho2 = sh2;
        System.out.println(sh2);
        System.out.println(sho2);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}
