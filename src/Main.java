import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Criando cursos com polimorfismo/herança
        Conteudo curso1 = new Curso("Título 1", "Descrição 1", 20);
        Conteudo curso2 = new Curso("Título 2", "Descrição 2", 30);

        // Criando uma mentoria com polimorfismo/herança
        Conteudo mentoria1 = new Mentoria("Mentoria 1", "Descrição 1", LocalDate.now());
        Conteudo mentoria2 = new Mentoria("Mentoria 2", "Descrição 2", LocalDate.of(2024, 4, 15));

        // Imprimindo cursos
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println();
//
//        // Imprimindo Mentoria
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        // Criar um Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descrição Bootcamp Java");

        // Criar Devs
        Dev devJhonny = new Dev("Jhonny Azevedo");
        Dev devMylena = new Dev("Mylena Moraes");

        // Adicionar Conteúdos no Bootcamp
        bootcamp.getConteudosSetSet().add(curso1);
        bootcamp.getConteudosSetSet().add(curso2);
        bootcamp.getConteudosSetSet().add(mentoria1);
        bootcamp.getConteudosSetSet().add(mentoria2);

        // Imprimir conteúdo Bootcamp
        System.out.println("Conteúdo Bootcamp: "+ bootcamp.getConteudosSetSet());
        System.out.println("Devs incritos no Bootcamp: "+ bootcamp.getDevsInscritosSet());
        System.out.println();

        // Increver Devs no BootCamp
        devJhonny.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Jhonny: "+ devJhonny.getConteudosInscritosSet());
        devMylena.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Mylena: "+ devMylena.getConteudosInscritosSet());
        System.out.println();

        // Imprimir conteúdo concluidos dos Devs
        devJhonny.progredir();
        devJhonny.progredir();
        devJhonny.progredir();
        System.out.println("Conteúdos concluídos Jhonny: "+ devJhonny.getConteudosConcluidosSet());
        devMylena.progredir();
        System.out.println("Conteúdos concluídos Mylena: "+ devMylena.getConteudosConcluidosSet());
        System.out.println();

        // Conteúdos que os devs ainda estão inscritos
        System.out.println("Conteúdos Incritos Jhonny: "+ devJhonny.getConteudosInscritosSet());
        System.out.println("Conteúdos Incritos Mylena: "+ devMylena.getConteudosInscritosSet());
        System.out.println();

        // Calcular XP dos Devs
        System.out.println("Total XP Jhonny: "+ devJhonny.calcularTotalXP());
        System.out.println("Total XP Mylena: "+ devMylena.calcularTotalXP());
        System.out.println();
    }
}