package Animals;

public class Passaro extends Animal{
    static int numeroDePassaros;


    public Passaro(String nome,String cor,int idade, double peso,String estadoDeEspirito){
         this.nome = nome;
         this.cor =  cor;
         this.idade = idade ;
         this.peso = peso ;
         this.estadoDeEspirito = estadoDeEspirito;

        ++numeroDePassaros;
    }

    protected void comer(){};
    protected void dormir(){};
    
    @Override   
      public String toString() {
        return "Cachorro{" + "nome=" + nome + '\'' + '}';
    }
    public void soar(){
        System.out.println("Piau Piau");
    }
}
