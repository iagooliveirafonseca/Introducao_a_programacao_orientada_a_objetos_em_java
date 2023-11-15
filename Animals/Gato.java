package Animals;

public class Gato extends Animal {
    static int numeroDeGatos;

 

    public Gato(String nome, String cor, int idade, Double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos++;
    }

    protected void comer(){};
    protected void dormir(){};


    @Override
    public String toString(){
        return "Gato{" + "nome=" + nome + '\'' + '}'; 
    };   
    public void soar(){
        System.out.println("Miau");
    }
  


}
