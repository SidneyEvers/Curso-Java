package br.com.proway.cursojava.Aula1;

public class OperadoresMatematicos {

    /*
    * Em JAVA os operadores matemáticos são:
    * + (Adição)
    * - (Subtração)
    * * (Multiplicação)
    * / (Divisão)
    * % (Resto de divisão de inteiros)
    * Math.pow() - Podenciação
    *
    * */

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;

        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
        System.out.println(numero1 % numero2);
        System.out.println(Math.pow(numero1, numero2));
    }
}
