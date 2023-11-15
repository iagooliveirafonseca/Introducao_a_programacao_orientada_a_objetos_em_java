package Animals;

public class Cachorro extends Animal {
    static int numeroDeCachorros;


    public Cachorro(String nome, String cor, int idade, Double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros++;
    }

    // Metodos
    // metodo é uma função equivalente ao Javascript
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int numeroDeCachorros() {
        return this.numeroDeCachorros;
    }

    public void numeroDeCachorros(int numeroDeCachorros) {
        this.numeroDeCachorros = numeroDeCachorros;
    }

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

    @Override
    public String toString() {
        return "Cachorro{" + "nome=" + nome + '\'' + '}';
    }
    public void soar(){
        System.out.println("Au au");
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
