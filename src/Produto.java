import java.util.Scanner;

public class Produto {
    private String nome;
    private int qtd;
    private double Value;

    Scanner sc = new Scanner(System.in);

    public void NomearItem(){
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
    }

    public void Quantificar(){
        System.out.println("Quantidade: ");
        qtd = sc.nextInt();
    }
    public void Valuetion(){
        System.out.println("Valor: ");
        Value = sc.nextDouble();
    }
    public void Impri(){
        System.out.println("Nome: "+nome);
        System.out.println("Quantidade: "+qtd);
        System.out.println("Valor: "+Value);
    }
    public String getNome(){
        return nome;
    }
}


