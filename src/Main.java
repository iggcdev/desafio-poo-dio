import br.com.dio.desafio.domain.Conteudo;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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



    }
}