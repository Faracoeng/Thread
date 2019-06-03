package poo;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        int i;
//        Fluxo f1 = new Fluxo("fluxo 1");
//        Fluxo f2 = new Fluxo("fluxo 2");
//
//        System.err.println("iniciando");
//        f1.diparar();
//        f2.diparar();
//        System.err.println("Finalizando");
//        Thread comHeranca = new Fluxo1();
//        Thread comInterface = new Thread(new Fluxo2());
//        Thread f3 = new Fluxo1();

        //execuntando
//
//        comHeranca.start();
//        comInterface.start();
//
//        System.err.println("Fim do programa");
        //método join()
//        f3.start();
//        System.err.println("Depois do start antes do join()");
//        try{
//        f3.join();
//        System.err.println("Depois do join");
//
//    }catch (InterruptedException ex){
//            System.err.println(ex.toString());
//        }
//        System.err.println("Fim do programa");
        Contador c = new Contador();
        Fluxo f1 = new Fluxo(c);
        Fluxo f2 = new Fluxo(c);
    }
}
