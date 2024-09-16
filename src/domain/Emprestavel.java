package domain;

public interface Emprestavel {
    String estaDisponivel();

    void emprestar(Emprestimo emprestimo);

    void devolver();
}
