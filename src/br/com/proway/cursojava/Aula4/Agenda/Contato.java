package br.com.proway.cursojava.Aula4.Agenda;

public class Contato {

    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;

    public Contato(){
        super();
    }

    public Contato(Integer codigo, String nome, String email, String telefone){
        this(nome,email,telefone);
        this.codigo = codigo;
    }

    public Contato(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
