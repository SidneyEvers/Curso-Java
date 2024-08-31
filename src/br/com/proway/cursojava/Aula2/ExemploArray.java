package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExemploArray {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];
        double media = 0;

        for(int index = 0; index < nomes.length; index++){
            System.out.println("Digite o nome do aluno: ");
            nomes[index] = leitor.nextLine();
            System.out.println("Digite a nota do aluno:");
            notas[index] = Double.parseDouble(leitor.nextLine());
            media = media + notas[index];
        }
        media = media / notas.length;
        System.out.println("Os alunos que tiraram nota acima da média são: ");
        for(int index = 0; index < notas.length; index++){
            if(notas[index] > media){
                System.out.println("A média da sala foi: "+media);
                System.out.println(nomes[index]);
            }
        }
        leitor.close();
    }
}
