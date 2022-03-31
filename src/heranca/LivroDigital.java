package heranca;

public class LivroDigital extends Livro { // todos os atributos da classe Livro estão disponíveis no LivroDigital
  
    // NOVO
    public String linkDownload;
    public int tamanhoMB;

  public LivroDigital(String titulo, String autor, String linkDownload) {
    super(titulo, autor); //a palavra reservada Super invoca o construtor da classe pai
    this.linkDownload = linkDownload;
  }

  // MUDOU
  public float imposto() {
    return super.imposto() + 2;
  }

  // NOVO
  public float tamanhoPorPagina() {
    return tamanhoMB / (float) paginas;
  }

  public void imprimirImposto(){
    System.out.println("Imposto livro fisico: " + super.imposto()); //o super faz uma referência à classe pai
    System.out.println("Imposto livro digital: " + this.imposto()); //o this faz uma referência à classe atual
  }

}
