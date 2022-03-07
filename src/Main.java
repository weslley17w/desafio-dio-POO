import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev weslley = new Dev();
        weslley.setNome("Weslley");
        weslley.inscreverBootcamp(bootcamp);
        weslley.progredir();
        weslley.progredir();

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        joao.progredir();

        System.out.println("Conteúdos Inscritros: ");
        System.out.println("Weslley - " +weslley.calcularTotalXP() + ": " + weslley.getConteudosInscritos());
        System.out.println("João - " +joao.calcularTotalXP() + ": " + joao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: ");
        System.out.println("Weslley - " +weslley.calcularTotalXP() + ": " + weslley.getConteudosConcluidos());
        System.out.println("João - " +joao.calcularTotalXP() + ": " + joao.getConteudosConcluidos());



    }
}
