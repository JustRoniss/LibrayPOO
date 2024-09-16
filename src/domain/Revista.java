package domain;

public class Revista extends Titulo{
    public Revista(String nome, String autor, String anoPublicacao, boolean status) {
        super(nome, autor, anoPublicacao, status);
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
