package Reverso;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //int megasena[] = {10,20,30,40,45,55};//o [] marca a variavel como um array
        // para acessar o primeiro item, megasena[0]

        // ArrayList<Integer> megasena = new ArrayList();// o Integer é igual ao int, mas em formato de classe. É necessário utiliza-lo dentro da tag ao invés do int.

        // megasena.add(10);
        // megasena.add(20);
        // megasena.remove(0);//remove o elemento na posição 0

        ArrayList<String> nomes = new ArrayList();

        Scanner teclado = new Scanner(System.in);
        String msg;
        System.out.println("Digite quantos nomes irá inserir");
        int total = teclado.nextInt();

        System.out.println("Digite os nomes:");
        for(int i=0;i<total;i++){
            msg = teclado.next();//Para ler uma string basta digitar next(), mas se fosse um inteiro, teria que ser nextInt(), ou nextFloat() para float
            nomes.add(msg);
        }
        System.out.println("Ordem normal");
        for(String nome : nomes){//para cada nome dentro do array nomes...
            System.out.println(nome);
        }
        System.out.println("Ordem inversa");
        for(int i=total-1;i>=0;i--){
            System.out.println(nomes.get(i));
        }
        // ou 
        //Collections.reverse(nomes);//Esse metodo inverte os elementos do array
        //System.out.println(nomes);

    }
}
