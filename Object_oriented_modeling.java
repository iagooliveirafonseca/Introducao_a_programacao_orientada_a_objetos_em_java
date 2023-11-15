import Animals.Cachorro;

public class Object_oriented_modeling {
     public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Alex","preto",4,2.7, null);
        System.out.println(cachorro1.numeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Jorge","preto",4,2.7, null);
        System.out.println(cachorro2.numeroDeCachorros());

        // System.out.println(cachorro1.toString());
        // System.out.println(cachorro2.toString());

        // System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        // System.out.println("O cachorro está " + cachorro2.interagir("carinho"));
    }
}
