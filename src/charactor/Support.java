package charactor;

/**
 * @author songjian
 * @create 2023-10-27-15:10
 */
public class Support extends Hero implements Healer {
    public void heal() {
        System.out.println(name + "进行了治疗");
    }

    public void heal(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了治疗");
    }

    public void heal(Hero h1, int recover) {
        System.out.println(name + "为" + h1.name + "回复了" + recover + "点血");
    }
}
