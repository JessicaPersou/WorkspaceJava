package model;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private boolean compraFeita = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone(){ return telefone; }
    public boolean getCompraFeita(){ return compraFeita; }
    public void comprou() {
        this.compraFeita = true;
    }
}