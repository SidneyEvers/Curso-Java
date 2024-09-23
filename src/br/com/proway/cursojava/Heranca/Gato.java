package br.com.proway.cursojava.Heranca;

public class Gato extends Animal {

    public Gato(String nome){
        this.nome = nome;
    }

    @Override
    public void comer(){
        System.out.println("Gato " + this.nome + " comendo...");
    }

    public void miar(){
        System.out.println(this.nome + " miando...");
    }

}
