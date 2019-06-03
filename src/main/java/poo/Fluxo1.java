package poo;

import java.util.Random;

public class Fluxo1 extends Thread{

    private Random r = new Random();
    Contador count;

    public Fluxo1(Contador cont){
        this.count = cont;
    }
    @Override
    public void run() {

            for(int i=0;i<10; i++){
                System.err.println(i+"-> F1 : contador"+ this.count.getValor());
                this.count.incrementa();
                System.err.println(i+"-> F1 : contador"+ this.count.getValor());
                try {
                    Thread.sleep(r.nextInt(2000)+500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
