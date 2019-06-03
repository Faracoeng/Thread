package poo;

public class Fluxo {

        private String id;
        public Fluxo(Contador id){
            this.id = id;
        }
        public void diparar(){
            for (int i = 0; i < 10 ; i++){
                System.err.println(id+": " + i);
            }
        }


}
