public class types_primitives_in_java{

    public static void main(String[]args){

        // Tipos primitivos
        // byte vai de -128 até 127
        byte variavel_byte_valor_max = 127;
        byte variavel_byte_valor_min_max = -128;
        // short vai de -32768 até 32767
        short variavel_short_valor_max = 32767;
        short variavel_short_valor_min_max = -32768;
        // char 0 a 65535
        char variavel_char_valor_max = 65534;
        // int vai de -2 Bilhoes até 2 Bilhões
        int variavel_int_valor_max = 2000000000;
        int variavel_int_valor_min_max = -2000000000;
        // long vai de -9 trilhões até 9 trilhões / não colocar por ser muito exstenso
        System.out.println(variavel_byte_valor_max);
        System.out.println( variavel_byte_valor_min_max);
        System.out.println(variavel_short_valor_max);
        System.out.println( variavel_short_valor_min_max);
        System.out.println(variavel_char_valor_max);
        System.out.println(variavel_int_valor_max);
        System.out.println( variavel_int_valor_min_max);
    }

}