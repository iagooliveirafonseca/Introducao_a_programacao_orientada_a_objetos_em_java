import Animals.Cachorro;

public class Methods_in_java{

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

 
        cachorro1.setNome("Puppy"); 
        cachorro1.setIdade(2); 
        cachorro1.setCor("Preto"); 
        cachorro1.setPeso(2.3); 

        cachorro1.latir();
        System.out.println("O cachorro pegou a " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
       
    }

}