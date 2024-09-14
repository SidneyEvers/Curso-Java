package br.com.proway.cursojava.Aula4;

public class Produto {

    String nome;
    private double preco;

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }
    }
}
