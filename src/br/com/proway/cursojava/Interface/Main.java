package br.com.proway.cursojava.Interface;

public class Main {

    public static void main(String[] args) {
        usarReprodutorMusical(new SmartPhone());
        usarReprodutorMusical(new Desktop());
    }

    private static void usarReprodutorMusical(ReprodutorMusical reprodutorMusical){
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.tocar();
        reprodutorMusical.parar();
    }
}
