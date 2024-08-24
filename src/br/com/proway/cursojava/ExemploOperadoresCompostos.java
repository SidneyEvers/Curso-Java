package br.com.proway.cursojava;

public class ExemploOperadoresCompostos {

    //
    // Em Java os principais operadores compostos são:
    // += Adição  igual
    // -= Subtração igual
    // *= Multiplicação igual
    // /* divisão igual
    // %= Resto de divisão igual

    public static void main(String[] args) {

        int numero = 10;
        System.out.println(numero);
        numero += 5; //Equivale a numero = numero + 5
        System.out.println(numero);
        numero -= 5; //Equivale a numero = numero - 5
        System.out.println(numero);
        numero *= 5; //Equivale a numero = numero * 5
        System.out.println(numero);
        numero /= 5; //Equivale a numero = numero / 5
        System.out.println(numero);
        numero %= 3; //Equivale a numero = numero % 3
        System.out.println(numero);
        //CUIDADO
        numero = 5;
        numero *= 2 +1;
        System.out.println(numero);

    }
}
