import Animals.Cachorro;

public class encapsulation_in_java{

    public static void main(String[] args) {

  
        Cachorro cachorro2 = new Cachorro("Alex","preto",4,2.7);

        System.out.println(cachorro2.getNome());

    
        System.out.println("O cachorro está " + cachorro2.interagir("carinho"));
    }

}