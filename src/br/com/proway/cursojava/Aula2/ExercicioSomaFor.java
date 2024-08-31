package br.com.proway.cursojava.Aula2;

public class ExercicioSomaFor {

    public static void main(String[] args) {

        int soma = 0;
        int numero = 1;

        for(numero = 1; numero <= 10; numero++){
            soma = soma + numero;

        }

        System.out.println("A soma dos 10 primeiros número inteiros é " +soma);
    }
}
