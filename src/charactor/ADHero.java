package charactor;

import property.Item;

/**
 * @author songjian
 * @create 2023-10-27-15:04
 */
public class ADHero extends Hero implements AD,Mortal{
    public void attack(){
        System.out.println(name + "进行了一次攻击");
    }
    public void attack(Hero h1){
        System.out.println(name + "对" + h1.name + "进行了一次攻击");
    }
    public void attack(Hero h1,Hero h2){
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了一次攻击");
    }
    public void attack(Hero...heroes){
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(name + "攻击了" + heroes[i].name);
        }
    }
    @Override
    public void physicalAttack(){
        System.out.println("进行了物理攻击");
    }
    @Override
    public void die(){
        System.out.println("物理英雄" + name + "死亡");
    }
    public ADHero(String name,float hp){
        super(name,hp);
        System.out.println("调用ADHero的构造方法");
    }
    public ADHero(){}
    public void useItem(Item item){
        System.out.println("adhero use item");
        super.useItem(item);
    }

    public static void main(String[] args) {
        ADHero adHero = new ADHero("TIMO",123.22f);
        Item item = new Item();
        item.setName("LifePotion");
        adHero.useItem(item);
    }

}
