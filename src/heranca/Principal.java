package heranca;

public class Principal {
  public static void main(String args[]) {
    Livro l1 = new Livro("sherlock", "hearthfeller");
    l1.imposto();
    LivroDigital l2 = new LivroDigital("sherlock", "hearthfeller", "www.qualquercoisa.com.br");
    l2.imposto();

    System.out.println(l1 instanceof Livro);//true
    System.out.println(l2 instanceof Livro);//true
    System.out.println(l1 instanceof LivroDigital);//false
    System.out.println(l2 instanceof LivroDigital);//true
    
  }
}
