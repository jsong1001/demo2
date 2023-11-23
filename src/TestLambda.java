import charactor.Hero;
import charactor.HeroChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author songjian
 * @create 2023-11-08-10:19
 */
public class TestLambda {
    public static void main(String[] args) {
        Random random = new Random();
        List<Hero> heroes = new ArrayList();
        for (int i = 0; i < 12; i++) {
            Hero hero = new Hero("hero" + i,random.nextInt(1000),random.nextInt(100));
            heroes.add(hero);
            System.out.println(hero);
        }
        System.out.println("初始化的集合：");
//        System.out.println(heroes);

        /*HeroChecker heroChecker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return h.hp > 100 && h.damage<50;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(heroes,heroChecker);
        System.out.println("使用lambda表达式过滤");
        filter(heroes,h ->h.hp>100 && h.damage<50);
        System.out.println("在lambda表达式忠使用静态方法");
        filter(heroes,h-> TestLambda.testHero(h));
        System.out.println("直接引用静态方法");
        filter(heroes,TestLambda::testHero);*/
    }

    public static boolean testHero(Hero h){
        return h.hp>100 && h.damage<50;
    }

    public static void filter(List<Hero> heroes, HeroChecker heroChecker){
        for (Hero hero : heroes){
            if (heroChecker.test(hero)){
                System.out.println(hero);
            }
        }
    }


}
