package br.com.proway.cursojava.Aula3;

public class ExemploBubbleSort {

    public static void main(String[] args) {

        int[] numeros = {10, -5, 32, -18, 25, -3, 45, -12, 8, -7};

        //algoritimo de ordenação Bubble Sort
        for(int i = 0; i < numeros.length - 1; i++){
            for(int j = 0; j < numeros.length -1 - i; j++){
                if(numeros[j] > numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("Os números ordenados são: ");
        for(int numero : numeros){
            System.out.println(numero + " ");
        }
    }
}
