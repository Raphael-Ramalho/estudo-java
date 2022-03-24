package estudodeclasses.aluno;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) { //o metodo main é responsavel pela execução do arquivo. ele indica que este é o arquivo principal
    System.out.println("Alo mamae!");
    // Aluno a = new Aluno(); //criação de nova estância da classe aluno
    // a.matricula = 1001;
    // a.nome = "Super Mario";
    // a.cpf = "111222333";


    Aluno b = new Aluno(1002, "Yoshi", "777222333"); //criação de nova estância da classe aluno com uso do construtor

    // a.info();

    // a.nome = "Super Luigi";

    // a.info();

    b.info();

    // Turma nova = new Turma();
    // nova.prof = new Professor();
    // nova.prof.nome = "Leonardo";
    // nova.alunos = new ArrayList();
    // nova.alunos.add(new Aluno());
    // nova.alunos.get(0).nome="Super Mario";


  }
}
