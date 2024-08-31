package br.com.proway.cursojava.Aula2;

public class ExercicioSomaWhile {

    public static void main(String[] args) {

        int soma = 0;
        int numero = 1;

        while(numero <= 10){
            soma = soma + numero;
            numero++;
        }
        System.out.println("A soma dos 10 primeiros número inteiros é " +soma);
    }
}
