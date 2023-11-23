package property;

/**
 * @author songjian
 * @create 2023-10-27-15:01
 */
public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();
    }
}
