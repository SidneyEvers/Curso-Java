package br.com.proway.cursojava.Heranca;

import br.com.proway.cursojava.Aula4.Agenda.Contato;

public class Main {

    public static void main(String[] args) {

        Contato contato = new Contato(null, "Joao", "joao@teste.com", "33221100");
        System.out.println(contato.getNome());


        showReport(new Gato("Mitze"));
        showReport(new Cachorro("Totó"));
    }

    private static void showReport(Animal animal){
        animal.comer();
        System.out.println(animal.getClass());
    }
}
