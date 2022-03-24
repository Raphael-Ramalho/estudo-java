package empresa;

import java.util.Scanner;

public class Principal { 
  public static void main(String[] args){
    int num=10;
    String nome = "Mario";
    int tamalho = nome.length();
    nome = "Super " + nome;
    System.out.println("Hello world");
    System.out.println(nome); //o print ln printa a linha. Ja o print, printa uma coisa do lado da outra 
    Scanner teclado = new Scanner(System.in); //serve para o usuário inserir um valor via input
    float peso = teclado.nextFloat();// o nextfloat permite ler um float
    double pi = 3.1415; // o double é similar ao float, mas ele ocupa o dobro de espaço de memória
    float pi2 = (float)3.1415;//dessa forma, o codigo entende que o numero é um float
    float altura = teclado.nextFloat();// como o teclado ja foi declarado, ele pode ser chamado novamente para a inserção de outro valor
    System.out.printf("A altura digitada foi: %.2f", altura); //o printf e o %.2f fazem com que o valor o valor seja printado com 2 casas decimais.
  }
}