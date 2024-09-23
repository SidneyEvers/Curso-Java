package br.com.proway.cursojava.Heranca;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        this.nome = nome;
    }

    @Override
    public void comer(){
        System.out.println(this.nome + " Comendo ração!!!!");
    }

    public void latir(){
        System.out.println(this.nome + " latindo!!!");
    }

}
