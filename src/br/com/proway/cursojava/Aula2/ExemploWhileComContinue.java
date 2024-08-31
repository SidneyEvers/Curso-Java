package br.com.proway.cursojava.Aula2;

public class ExemploWhileComContinue {

    public static void main(String[] args) {

        int numero = 1;
        while(numero <= 10){
            if(numero % 2 == 0){
                numero++;
                continue;
            }
            System.out.println(numero++);
        }
    }
}
