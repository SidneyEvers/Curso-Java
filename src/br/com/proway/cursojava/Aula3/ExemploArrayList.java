package br.com.proway.cursojava.Aula3;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {

        //Criando o Array List de Strings
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionando elementos
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Ana");

        System.out.println(nomes);//Saída: [Maria, José, Ana]
        nomes.add(1, "Carlos");
        System.out.println(nomes);//Saída: [Maria, Carlos, José, Ana]

        //Buscar elementos na lista
        System.out.println(nomes.get(0));//Saída: Maria
        System.out.println(nomes.get(1));//Saída: Carlos
        System.out.println(nomes.get(2));//Saída: José
        System.out.println(nomes.get(3));//Saída: Ana

        //Trocar elemento na lista
        nomes.set(1,"Paulo");//Troca Carlos por Paulo
        System.out.println(nomes);//Saída: [Maria, Paulo, José, Ana]

        //Remover elemento da lista
        nomes.remove(2);//Remove José
        System.out.println(nomes);//Saída: [Maria, Carlos, Ana]
        //Remove pelo valor
        nomes.remove("Ana");
        System.out.println(nomes);//Saída: [Maria, Carlos, José]

        //Informar qual tamanho da lista
        System.out.println("A lista possui "+ nomes.size()+" nome(s)");

        //Verificar se possui um elemento na lista
        nomes.contains("Maria");


        //foreach
        for(String nome : nomes){
            System.out.println(nome);
        }



    }
}
