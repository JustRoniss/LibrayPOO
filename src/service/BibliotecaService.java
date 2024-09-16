package service;

import domain.Emprestimo;
import domain.Titulo;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Titulo> titulos = new ArrayList<>();

    public void emprestarTitulo(Titulo titulo, Emprestimo emprestimo) {
        if(titulo.getStatus()){
            titulo.emprestar(emprestimo);
            System.out.println("Emprestado com sucesso!");
        } else {
            System.out.println("Esse título não está disponível");
        }
    }

    public void devolverTitulo(Titulo titulo){
        titulo.devolver();
        System.out.println("Título devolvido com sucesso!");
    }

    public void adicionarTitulo(Titulo titulo){
       titulos.add(titulo);
       System.out.println("O Titulo" + titulo.getNome() + " foi adicionado com sucesso na categoria" + titulo.getTipo());
    }

    public void listarTitulos(){
        for(Titulo titulo : titulos){
            System.out.println("Titulo: " + titulo.getNome() + " categoria " + titulo.getTipo() + " Status: " + titulo.estaDisponivel());
        }
    }
}
