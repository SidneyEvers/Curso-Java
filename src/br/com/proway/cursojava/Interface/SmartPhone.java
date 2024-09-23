package br.com.proway.cursojava.Interface;

public class SmartPhone implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando smarphone");
    }

    @Override
    public void pausar() {
        System.out.println("smartphone pausou o audio");

    }

    @Override
    public void parar() {
        System.out.println("smartphone parou a musica");
    }
}
