package PastaConteudos.Exercicos.Curso;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o horário do curso: ");
        String horario = scanner.nextLine();

        System.out.println("Digite o nome do Professor: ");
        String nomeProf = scanner.nextLine();

        System.out.println("Digite o email do Professor: ");
        String emailProf = scanner.nextLine();

        System.out.println("Digite o nome do departamento do Professor: ");
        String depProf = scanner.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("-----Alunos-----");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++){
            
        }
    }
}
