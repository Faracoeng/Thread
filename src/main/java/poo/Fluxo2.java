package poo;

import java.util.Random;

public class Fluxo2 implements Runnable{

        Contador count;
        private Random r = new Random();

        public Fluxo2(Contador cont){
                this.count = cont;
        }
        @Override
        public void run() {

                for(int i=0;i<10; i++){
                    System.err.println("Fazendo uso de interface");
                        try {
                                Thread.sleep(r.nextInt(2000)+500);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }
}
