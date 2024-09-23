package br.com.proway.cursojava.Interface;

public class Desktop implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Desktop tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Desktop pausou a musica");
    }

    @Override
    public void parar() {
        System.out.println("Desktop parou a musica");
    }
}
