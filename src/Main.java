import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Criando cursos com polimorfismo/herança
        Conteudo curso1 = new Curso("Título 1", "Descrição 1", 20);
        Conteudo curso2 = new Curso("Título 2", "Descrição 2", 30);

        // Criando uma mentoria com polimorfismo/herança
        Conteudo mentoria1 = new Mentoria("Mentoria 1", "Descrição 1", LocalDate.now());
        Conteudo mentoria2 = new Mentoria("Mentoria 2", "Descrição 2", LocalDate.now());

        // Imprimindo cursos
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println();

        // Imprimindo Mentoria
        System.out.println(mentoria1);
        System.out.println(mentoria2);



    }
}