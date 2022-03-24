package estudodeclasses.carro;

public class Carro {
  String nome;
  String modelo;
  float velocidade;
  static final double PI = 3.1415;  // a palavra final indica que o valor não pode ser mudado por outras instâncias
  static float milhasParaMetros(float milhas){
    return milhas*1600;
  }
}



