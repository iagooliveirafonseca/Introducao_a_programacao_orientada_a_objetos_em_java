package Animals;

public class Cachorro {
    public String nome;
    public String cor;
    public int idade;
    public double peso;

    public String estadoDeEspirito;

    // metodo é uma função equivalente ao Javascript
    public void comer(){

    }

     public void latir(){
        System.out.println("Au au");
    }

    public String pegar(){
        return "Bolinha";
    };

    public String interagir(String acao){
        if(acao.equals("carinho")){
            estadoDeEspirito = "Feliz";
            return estadoDeEspirito;
        } else if (acao.equals("vai dormir")){
            estadoDeEspirito = "Bravo";
            return estadoDeEspirito;
        } else{
            estadoDeEspirito = "Neutro";
            return estadoDeEspirito;
        }

    };
}
