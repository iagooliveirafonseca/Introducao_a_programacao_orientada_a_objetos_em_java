package Animals;

public class Cachorro {
    private String nome;
    private String cor;
    private int idade;
    private double peso;
    private String estadoDeEspirito;


    // Construtores 
    public Cachorro(){};

    public Cachorro(String nome,String cor,int idade, Double peso){
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
   
     

    }

    // Metodos
    // metodo é uma função equivalente ao Javascript
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

      public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

      public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
     public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }




    public void comer() {

    };

    public void latir() {
        System.out.println("Au au");
    };

    public String pegar() {
        return "Bolinha";
    };

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "Triste";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
        }
        return this.estadoDeEspirito;
    }
    // public String interagir(String acao){
    // if(acao.equals("carinho")){
    // estadoDeEspirito = "Feliz";
    // return estadoDeEspirito;
    // } else if (acao.equals("vai dormir")){
    // estadoDeEspirito = "Bravo";
    // return estadoDeEspirito;
    // } else{
    // estadoDeEspirito = "Neutro";
    // return estadoDeEspirito;
    // }

    // };

}
