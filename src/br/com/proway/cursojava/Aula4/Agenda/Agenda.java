package br.com.proway.cursojava.Aula4.Agenda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private RepositorioContatos repositorio;
    private Scanner scanner = new Scanner(System.in);

    public Agenda(RepositorioContatos repositorio, Scanner leitor) {
        this.repositorio = repositorio;
        this.scanner = leitor;
    }

    public void apresentarMenu() {
        int opcao = -1;

        while (opcao != 6) {
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Editar contato");
            System.out.println("5 - Excluir contato");
            System.out.println("6 - Sair");
            opcao = Integer.parseInt(scanner.nextLine());
            tratarOpcao(opcao);
        }

    }

    private void tratarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarContato();
                break;
            case 2:
                listarContato();
                break;
            case 3:
                buscarContato();
                break;
            case 4:
                editarContato();
                break;
            case 5:
                removerContato();
                break;
            case 6:
                System.out.println("Aplicação finalizada");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void cadastrarContato() {

        System.out.println("### CADASTRAR NOVO CONTATO ###");
        System.out.println("Digite o nome do contato");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do contato");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone do contato");
        String telefone = scanner.nextLine();
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);
        repositorio.adicionarContatos(contato);
    }

    private void listarContato() {

        System.out.println("### LISTAGEM DE CONTATOS ###");
        ArrayList<Contato> contatos = repositorio.listarContatos();
        for (Contato contato : contatos) {
            System.out.println(String.format("%s - %s - %s - %s",
                    contato.getCodigo(),
                    contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone()));
        }
    }

    private void buscarContato(){
        System.out.println("### BUSCAR CONTATO ###");
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        ArrayList<Contato> contatos = repositorio.buscarPorNome(nome);
        if(contatos.isEmpty()){
            System.out.println("Não foi possível encontrar um contato com o nome informado");
        }
        else{
            for(Contato contato: contatos){
                System.out.println(String.format("%s - %s - %s - %s,",
                        contato.getCodigo(),
                        contato.getNome(),
                        contato.getEmail(),
                        contato.getTelefone()));
            }
        }
    }

    private void editarContato(){
        System.out.println("### EDITAR CONTATO ###");
        System.out.println("Digite o código do contato: ");
        Integer codigo = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do contato: ");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
    }

    private void removerContato(){
        System.out.println("### REMOVER CONTATO ###");
        System.out.println("Digite o código do contato");
        Integer codigo = Integer.parseInt(scanner.nextLine());
        Contato contato = repositorio.buscarPorCodigo(codigo);
        if(contato == null){
            System.out.println("Contato não encontrado");
        }else{
            repositorio.removerContato(contato);
        }
    }

}



