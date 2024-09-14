package br.com.proway.cursojava.Aula4;

import java.util.Locale;

public class usoProduto {

    public static void main(String[] args) {

        Produto prod1 = new Produto();
        prod1.nome = "Suco Laranja";
        prod1.setPreco(7.80);

        System.out.println(prod1.nome);
        System.out.println(prod1.getPreco());
    }
}
