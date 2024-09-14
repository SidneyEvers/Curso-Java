package br.com.proway.cursojava.Aula4;

public class UsoConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.tipo = "PF";

        System.out.println(conta.getTipo());

    }
}
