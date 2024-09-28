package br.com.proway.cursojava.app.cmd;

import br.com.proway.cursojava.app.infra.view.ViewRenderer;

public class Main {

    public static void main(String[] args) {

        //inicializar a aplicação
        ViewRenderer renderer = new ViewRenderer();
        renderer.init();
    }
}
