import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
                
        Curso curso = new Curso();

        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição curso de Java");
        curso.setCargaHoraria(8);
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de JavaScript");
        curso1.setDescricao("Descrição curso de JavaScript");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println(devGabriel.getNome() + "\nConteudos Inscritos \n" +  " " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println(devGabriel.getNome() + "\nConteudos Inscritos \n" +  " " + devGabriel.getConteudosInscritos());
        System.out.println(devGabriel.getNome() + "\nConteudos Concluidos \n" +  " " + devGabriel.getConteudosConcluidos());
        System.out.println("XP " + devGabriel.calcularTotalXp());

        System.out.println("---------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getNome() + "\nConteudos Inscritos \n" + " " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println(devCamila.getNome() + "\nConteudos Inscritos \n" + " " + devCamila.getConteudosInscritos());
        System.out.println(devCamila.getNome() + "\nConteudos Concluidos \n" +  " " + devCamila.getConteudosConcluidos());
        System.out.println("XP " + devCamila.calcularTotalXp());

    }
}
