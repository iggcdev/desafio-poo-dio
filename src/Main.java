import br.com.dio.desafio.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de introdução ao java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Curso de introdução ao python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Kotlin");
        mentoria1.setDescricao("Mentoria sobre kotlin");
        mentoria1.setData(LocalDate.of(2024,05,30));

        Conteudo curso3 = new Curso();
        curso3.setTitulo("Curso de Kotlin");
        curso3.setDescricao("Curso de introducao a kotlin");

        Conteudo mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Rest");
        mentoria2.setDescricao("Mentoria sobre aplicasao arquitetura rest");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java IA Aws");
        bootcamp1.setDescricao("Bootcamp focado em ia com java e aws");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriel");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos: "+ dev1.getConteudosInscritos());
        System.out.println("XP: "+ dev1.calcularXpTotal());
        dev1.progredir();
        System.out.println("---");
        System.out.println("XP: "+ dev1.calcularXpTotal());
        System.out.println("Conteudos inscritos: "+ dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+ dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Ivo");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos: "+ dev2.getConteudosInscritos());
        System.out.println("XP: "+ dev2.calcularXpTotal());
        dev2.progredir();
        System.out.println("---");
        System.out.println("XP: "+ dev2.calcularXpTotal());
        System.out.println("Conteudos inscritos: "+ dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+ dev2.getConteudosConcluidos());





    }
}