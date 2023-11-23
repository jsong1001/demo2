package charactor;

/**
 * @author songjian
 * @create 2023-10-27-15:47
 */
public class APHero extends Hero implements AP,Mortal{
    @Override
    public void magicAttack(){
        System.out.println("进行了魔法攻击");
    }
    @Override
    public void die(){
        System.out.println("魔法英雄" + name + "死亡");
    }
    public APHero(){}

    public APHero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
}
