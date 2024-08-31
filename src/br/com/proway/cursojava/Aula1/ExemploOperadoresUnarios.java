package br.com.proway.cursojava.Aula1;

public class ExemploOperadoresUnarios {
    /*
    * Em Java os operadores Unarios são:
    * ++ Operador de incremento
    * -- Operador de decremento
    * eles podem fazer o pré-incremento/decremento quando vem antes da variável  ou
    * eles podem fazer o pós-incremento/decremento quando vem após a variável
    * */

    public static void main(String[] args) {
        int numero1 = 10;
        System.out.println(++numero1);
        System.out.println(--numero1);

        numero1 = 20;
        System.out.println(numero1++);
        System.out.println(numero1);

        numero1 = 20;
        System.out.println(numero1--);
        System.out.println(numero1);
    }
}
