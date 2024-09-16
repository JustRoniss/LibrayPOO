import domain.Emprestimo;
import domain.Livro;
import domain.Revista;
import domain.Titulo;
import service.BibliotecaService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();

        Titulo livro = new Livro("Design Patters", "Ronaldao", "2010", true);
        Titulo revista = new Revista("Revista Tech", "Ronaldao bolado", "2018", true);

        bibliotecaService.adicionarTitulo(livro);
        bibliotecaService.adicionarTitulo(revista);

        bibliotecaService.listarTitulos();


        bibliotecaService.emprestarTitulo(livro, new Emprestimo("Framengo", LocalDate.now(), LocalDate.now().plusDays(3)));

        bibliotecaService.listarTitulos();
    }
}