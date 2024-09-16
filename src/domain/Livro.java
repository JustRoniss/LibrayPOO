package domain;

public class Livro extends Titulo{
    public Livro(String nome, String autor, String anoPublicacao, boolean status) {
        super(nome, autor, anoPublicacao, status );
    }

    @Override
    public String getTipo(){
        return "Livro";
    }
}
