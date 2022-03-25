package estudodeclasses.aluno;
public class Aluno { //a classe dita como será a estrutura dos objetos
  int matricula;
  String nome;
  String cpf;

  Aluno(){
    System.out.println("Aluno vazio criado");
  }

  Aluno(int matricula, String nome, String cpf){ //construtor para automatizar a população de dados na criação de novas instâncias
    this.matricula = matricula; //o this faz referência à estância atual da classe
    this.nome = nome;
    this.cpf = cpf;
  }

  void info(){ //criação de um metodo para a classe aluno
    System.out.println("Matricula: " + matricula);
    System.out.println("Nome: " + nome);
    System.out.println("cpf: " + cpf);
    System.out.println();
  }


}
