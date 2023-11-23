/**
 * @author songjian
 * @create 2023-11-07-11:40
 */
public class TestNumber2 {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        String s = it.toString();
        System.out.println(s);
        String s1 = String.valueOf(i);
        System.out.println(s1);
        int i1 = Integer.parseInt(s1);
        float fl = 3.14f;
        String s2 = String.valueOf(fl);
        System.out.println(s2);
        float v = Float.parseFloat(s2);
        System.out.println(v);
    }
}
