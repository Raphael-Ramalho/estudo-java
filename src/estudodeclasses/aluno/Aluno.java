package estudodeclasses.aluno;
public class Aluno { //a classe dita como será a estrutura dos objetos
  int matricula;
  String nome;
  String cpf;

  Aluno(int pMatricula, String pNome, String pCpf){ //construtor para automatizar a população de dados na criação de novas instâncias
    matricula = pMatricula;
    nome = pNome;
    cpf = pCpf;
  }

  void info(){ //criação de um metodo para a classe aluno
    System.out.println("Matricula: " + matricula);
    System.out.println("Nome: " + nome);
    System.out.println("cpf: " + cpf);
    System.out.println();
  }


}
