package heranca;

public class Livro {
  public String autor;
  public float custoProducao;
  public float precoVenda;
  public String titulo;
  public int paginas;

  // public Livro(){//construtor vazio

  // }

  public Livro(String titulo, String autor){ //Esse bloco vazio é um construtor e ele exige que os filhos dessa classe tenham o titulo e o autor definidos como strings
    this.titulo = titulo;
    this.autor = autor;
    
  }//cada um de seus filhos precisa atender ao menos um dos construtores da classe pai

  public float lucro(){
    return precoVenda - custoProducao;
  }

  public void imprimirTitulo(){
    System.out.println("O tituo: " + titulo);
  }

  public float imposto(){
    return 0.2f * lucro();
  }
}