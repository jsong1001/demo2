import charactor.Hero;

/**
 * @author songjian
 * @create 2023-11-08-14:25
 */
public class TestThread {
    public static void main(String[] args) {
        /*Thread t = new Thread() {

            public void run(){
                int seconds = 0;
                while (true){
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.printf("程序已运行了%d秒%n",seconds++);
                }
            }
        };
        t.setDaemon(true);
        t.start();*/

        Hero garren = new Hero();
        garren.name = "盖伦";
        garren.hp = 100;
        garren.damage = 1;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 4200;
        teemo.damage = 1;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 5400;
        bh.damage = 1;

        Hero leesin = new Hero();
        leesin.name = "李信";
        leesin.hp = 6020;
        leesin.damage = 1;

        /*while (!teemo.isDead()){
            garren.attackHero(teemo);
        }

        while (!leesin.isDead()){
            bh.attackHero(leesin);
        }*/

        /*KillThread killThread1 = new KillThread(garren,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();*/

        /*Battle battle1 = new Battle(garren,teemo);
        new Thread(battle1).start();
        Battle battle2 = new Battle(bh,leesin);
        new Thread(battle2).start();*/

        /*Thread t1 = new Thread(){
            public void run(){
                while (!teemo.isDead()){
                    garren.attackHero(teemo);
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                while (!leesin.isDead()){
                    Thread.yield();
                    bh.attackHero(leesin);
                }
            }
        };

        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();*/
       /* try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/

        /*System.out.println("盖伦的初始血量是："+ garren.hp);
        int n = 10000;
        Thread[] addThread = new Thread[n];
        Thread[] reduceThread = new Thread[n];

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(){
                public void run(){
                    garren.recover();
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
            addThread[i] = thread;
        }

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(){
                public void run(){
                    garren.hurt();
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
            reduceThread[i] = thread;
        }

        for (Thread thread : addThread){
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (Thread thread : reduceThread){
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("现在盖伦的血量是："+garren.hp);*/

        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    /*while (garren.hp == 1){
                        continue;
                    }*/
                    garren.hurt();
                    System.out.println("t1为盖伦减一点血，当前血量是"+garren.hp);
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    garren.recover();
                    System.out.println("t2为盖伦加一点血，当前血量是"+garren.hp);
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();
    }
}
