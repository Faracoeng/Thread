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

    public void incrementa(){
        int i = this.valor;
        i =+ 1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.valor = i;
    }
}
