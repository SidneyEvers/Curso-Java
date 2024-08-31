package br.com.proway.cursojava.Aula2;

public class ExemploWhileBreak {

    public static void main(String[] args) {

        int numero = 1;
        while(numero <= 10){
            System.out.println(numero++);
            if(numero == 5){
                break;
            }
        }

    }
}
