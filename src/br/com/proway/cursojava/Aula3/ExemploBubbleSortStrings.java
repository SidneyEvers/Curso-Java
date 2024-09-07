package br.com.proway.cursojava.Aula3;

public class ExemploBubbleSortStrings {

    public static void main(String[] args) {

        String[] cidades = {"São Paulo","Rio de Janeiro","Salvador","Fortaleza","Brasília","Curitiba","Manaus","Recife","Porto Alegre","Belén"};

        for(int i = 0; i < cidades.length -1; i++){
            for(int j = 0; j < cidades.length -1 - i; j++){
                //compareTo vai comparar se a cidade na posição j é maior que a cidade na posição j+1
                if(cidades[j].compareTo(cidades[j + 1]) > 0){
                    String temp = cidades[j];
                    cidades[j] = cidades[j + 1];
                    cidades[j + 1] = temp;
                }
            }
        }

        System.out.println("Cidades ordenadas:");
        for(String cidade : cidades){
            System.out.println(cidade);
        }
    }
}
