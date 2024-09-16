package domain;

import java.time.LocalDate;

public class Emprestimo {
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;


    public Emprestimo(String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }


    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

}

