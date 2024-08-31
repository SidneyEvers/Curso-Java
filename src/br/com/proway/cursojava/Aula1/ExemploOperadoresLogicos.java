package br.com.proway.cursojava.Aula1;

public class ExemploOperadoresLogicos {

        /*
        * Em java utilizamos os seguintes operadores lógicos:
        * && (E) Compara duas posições lógicas e retorna verdadeiro se ambas forem verdadeiras
        * || (OU) Compara duas posições lógicas e retorna verdadeiro se ao menos um for verdadeiras
        * ^ (Ou condicional) Compara duas posições lógicas e retorna verdadeiro se apenas um for verdadeiras
        * ! (Não) inverte o sinal do operador true => false, false => true
        * */
    public static void main(String[] args) {

        boolean v1 = true;
        boolean v2 = false;

        System.out.println("Operador &&");
        System.out.printf("%b && %b = %b\n", v1,v1,(v1 && v1));
        System.out.printf("%b && %b = %b\n", v1,v2,(v1 && v2));
        System.out.printf("%b && %b = %b\n", v2,v1,(v2 && v1));
        System.out.printf("%b && %b = %b\n", v2,v2,(v2 && v2));

        System.out.println("Operador ||");
        System.out.printf("%b || %b = %b\n", v1,v1,(v1 || v1));
        System.out.printf("%b || %b = %b\n", v1,v2,(v1 || v2));
        System.out.printf("%b || %b = %b\n", v2,v1,(v2 || v1));
        System.out.printf("%b || %b = %b\n", v2,v2,(v2 || v2));

        System.out.println("Operador ^");
        System.out.printf("%b ^ %b = %b\n", v1,v1,(v1 ^ v1));
        System.out.printf("%b ^ %b = %b\n", v1,v2,(v1 ^ v2));
        System.out.printf("%b ^ %b = %b\n", v2,v1,(v2 ^ v1));
        System.out.printf("%b ^ %b = %b\n", v2,v2,(v2 ^ v2));

        System.out.println("Operador !");
        System.out.printf("!%b ^ %b = %b\n", v1,!v1);
        System.out.printf("!%b ^ %b = %b\n", v1,!v2);
    }
}
