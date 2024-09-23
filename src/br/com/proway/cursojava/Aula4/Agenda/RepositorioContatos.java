package br.com.proway.cursojava.Aula4.Agenda;

import java.util.ArrayList;

public class RepositorioContatos {

    private static int nextInt = 1;
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContatos(Contato contato){

        contato.setCodigo(nextInt++);
        contatos.add(contato);
    }

    public void editarContato(Contato contato){

        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getCodigo().equals(contato.getCodigo())){
                contatos.set(i, contato);
            }
        }
    }
    public ArrayList<Contato> listarContatos(){
        return contatos;
    }

    public void removerContato(Contato contato){

        int index = -1;
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getCodigo().equals(contato.getCodigo())){
                index = i;
                break;
            }
        }
        if(index > -1 && index < contatos.size()){
            contatos.remove(index);
        }
    }

    public Contato buscarPorCodigo(Integer codigo){

        for(int index = 0; index < contatos.size(); index++){
            if(contatos.get(index).getCodigo().equals(codigo)){
                return contatos.get(index);
            }
        }
        return null;
    }

    public ArrayList<Contato>  buscarPorNome(String nome){
        ArrayList<Contato> resultado = new ArrayList<>();
        for(int index = 0; index < contatos.size(); index++){
            if(contatos.get(index).getNome().toLowerCase().startsWith(nome.toLowerCase())){
                resultado.add(contatos.get(index));
            }

        }
        return null;
    }
}
