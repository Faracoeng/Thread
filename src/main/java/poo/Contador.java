package poo;

public class Contador {
    private int valor;
    public Contador(){
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public synchronized void  incrementa(){ //synchronized restringe o acesso das threads nesse metodo permitindo apenas uma por vez
        int i = this.valor;
        i = i+ 1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.valor = i;
    }
}
