import Animals.Cachorro;

public class non_executables_classes {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.idade = 2;
        cachorro1.cor = "Preto";
        cachorro1.peso = 2.3;

        cachorro1.latir();
        System.out.println("O cachorro pegou a " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
       
    }

}