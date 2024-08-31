package br.com.proway.cursojava.Aula2;

public class ExemploWhile {

    public static void main(String[] args) {

        int numero = 10;

        while (numero >0){
            System.out.println(numero--);
            //numero--;
            //numero = numero -1;
        }
        System.out.println("Fim");
    }
}
