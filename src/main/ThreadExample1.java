package main;

/**
 * Created by prajesh on 3/10/16.
 */
public class ThreadExample1 {


    static class Player implements Runnable{


        String name;

        @Override
        public void run() {

            for(int i=0;i<10;i++){
                try {
                    System.out.println(this.name+" : "+i);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }



    public static void main(String[] args) throws InterruptedException {

        Player p1 = new Player();

        Player p2 = new Player();


        p1.name="player1";
        p2.name="player2";

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);


        t1.start();

        //t2.start();

        t1.join();

        System.out.println("End of main thread");

    }
}
