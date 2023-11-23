package charactor;

/**
 * @author songjian
 * @create 2023-10-27-15:48
 */
public class ADAPHero extends Hero implements AD,AP,Mortal{
    @Override
    public void physicalAttack(){
        System.out.println("物理攻击");
    }
    @Override
    public void magicAttack(){
        System.out.println("魔法攻击");
    }
    @Override
    public void die(){
        System.out.println("物理魔法英雄" + name + "死亡");
    }
    public ADAPHero(){}
    public ADAPHero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
}
