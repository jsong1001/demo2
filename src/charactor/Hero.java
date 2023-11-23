package charactor;

import property.Item;
import property.Weapon;

/**
 * @author songjian
 * @create 2023-10-27-14:57
 */
public class Hero {
    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;

    public int damage;
    public Hero(){};

    public Hero(String name,float hp,float armor,int moveSpeed,int damage){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name,float hp,int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public Hero(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHp(float hp){
        this.hp = hp;
    }
    public void huixue(float xp){
        this.hp = this.hp + xp;
    }
    public void attack(Hero hero,int damage){
        hero.hp = hero.hp - damage;
    }
    public void equip(Weapon weapon){
        System.out.println(name + "装备了" );
    }
    public void useItem(Item item){
        item.effect();
    }
    public void kill(Mortal m){
        m.die();
    }

    public boolean isDead(){
        return 0 >= hp?true:false;
    }

    public synchronized void recover(){
        this.hp += 1;
        this.notifyAll();
    }

    public synchronized void hurt(){
        if (this.hp == 1){
            try {
                this.wait(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.hp -= 1;
    }

    public void attackHero(Hero h){
        /*try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
*/
        h.hp -= damage;
        System.out.format("%s正在攻击%s,%s的血变成了%.0f%n",this.name,h.name,h.name,h.hp);
        if(h.isDead()){
            System.out.println(h.name + "死了");
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero("盖伦",456.5f);
        APHero temmoo = new APHero();
        temmoo.name = "提莫";
        ADHero li = new ADHero("李",456.2f);
        ADAPHero huowu = new ADAPHero();
        huowu.name = "不知火舞";
        garen.kill(temmoo);
        garen.kill(li);
        garen.kill(huowu);

    }

}
