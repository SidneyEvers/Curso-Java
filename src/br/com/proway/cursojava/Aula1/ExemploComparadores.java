package br.com.proway.cursojava.Aula1;

public class ExemploComparadores {

    /*
    * Em Java os operadores de comparação são:
    * > Maior
    * < Menor
    * >= maior ou igual
    * <= menor ou igual
    * != diferente
    * == igual a
    * Todos os operadores de comparação comparam o valor da direita com o valor da esquerda e retorna um resultado boolean(true/false) indicando o resultado da comparação.
    * */
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 7;

        //o % diz para imprimir formatado ou seja um número, isso por conta do printf
        System.out.printf("%d > %d = %b\n", numero1, numero2,(numero1 > numero2));
        System.out.printf("%d >= %d = %b\n", numero1, numero2,(numero1 >= numero2));
        System.out.printf("%d < %d = %b\n", numero1, numero2,(numero1 < numero2));
        System.out.printf("%d <= %d = %b\n", numero1, numero2,(numero1 <= numero2));
        System.out.printf("%d != %d = %b\n", numero1, numero2,(numero1 != numero2));
        System.out.printf("%d == %d = %b\n", numero1, numero2,(numero1 == numero2));

        String nome = new String("João");
        String nome2 = new String("João");
        //O == igual compara o endereço de memória por isso retorna false
        System.out.printf("%s == %s = %b\n",nome,nome2,(nome == nome2));
        //O .equals compara o valor, ou seja retornando true
        System.out.printf("%s equals %s = %b\n",nome,nome2,(nome.equals(nome2)));

    }
}
