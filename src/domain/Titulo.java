package domain;

import java.util.UUID;

public abstract class Titulo implements Emprestavel{
    private String nome;
    private String autor;
    private String anoPublicacao;
    private UUID codigoIdentificacao;
    private Emprestimo emprestimo;
    private boolean status;


    public Titulo(String nome, String autor, String anoPublicacao, boolean status) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.codigoIdentificacao = UUID.randomUUID();
        this.status = status;
    }

    public abstract String getTipo();

    @Override
    public String estaDisponivel(){
        if(status){
            return "Disponível";
        }else{
            return "Indisponível";
        }
    }

    @Override
    public void emprestar(Emprestimo emprestimo){
        if(this.status){
            this.emprestimo = emprestimo;
            this.status = false;
        }else{
            throw new IllegalStateException("Esse título já está emprestado");
        }
    }

    @Override
    public void devolver(){
        if(emprestimo != null){
            this.emprestimo = null;
        }else {
            throw new IllegalStateException("Esse título não está emprestado");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public UUID getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
