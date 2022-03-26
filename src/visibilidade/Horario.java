package visibilidade;

public class Horario { //utilizando essa estrutura de classes privadas com set e get, o desenvolvedor consegue controlar quando a variavel poderá ser utilizada/modificada
  private int hora;
  private int minuto;
  private int segundo;

  public int getHora(){
    return hora;
  }

  public void setHora(int hora){ // validação para impedir desenvolvedores de atribuir valores errados na variável hora.
    if(hora >=0 && hora <= 23){
      this.hora = hora;
    } else{
      System.out.println("Hora inválida");
    }
  }
  
}
