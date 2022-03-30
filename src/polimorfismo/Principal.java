package polimorfismo;

public class Principal {
    public static void main(String[] args) {
    //     Funcionario f1 = new Funcionario("Mario");
    //     Funcionario f2 = f1; //2 instâncias com referência ao mesmo espaço de memória

    //     // Funcionario f1 = new Funcionario("Mario");
    //     // Funcionario f2 = new Funcionario("Mario");//Nesse caso, as instâncias possuem referência à espaços de memória diferentes.



    //     System.out.println("Nome f1:"+ f1.nome);
    //     System.out.println("Nome f2:"+ f2.nome);

    //     f2.nome="Luigi";

    //     System.out.println("Nome f1:"+ f1.nome);// as 2 instâncias de Funcionario são modificados, e não apenas o f2. Isso ocorre porque as 2 instâncias fazem referência ao mesmo espaço de memória.
    //     System.out.println("Nome f2:"+ f2.nome);
    // }

    Funcionario funcionarios[] ={new Assalariado("Mario", 3500),new Horista("Luigi", 100, 40.5f)};

    Funcionario f;
    float total=0;
    for(int i=0;i<funcionarios.length;i++){
        f=funcionarios[i];
        System.out.println(f.nome+" salario: "+ f.pagamento());//essa estrutura polimorfica serve para objetos de classes diferentes
        total += f.pagamento();
    }
}
