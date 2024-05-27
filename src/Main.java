import java.util.Scanner;

public class Main extends Estoque{
    public static void main(String[] args) {
        int saida = 0, Run_Program=0;
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Menu menu = new Menu();
        menu.imprime_Menu();

        while(Run_Program == 0){
            saida = entrada.nextInt();
            if(saida == 1) estoque.adiciona_Prod_Estoque();
            if(saida == 2) estoque.RemoverEstoque();
            if(saida == 3) estoque.addQuantProd();
            if(saida == 4) estoque.ExibirEstoque();
            if(saida == 5) estoque.Search_Name();
            if(saida == 6) menu.imprime_Menu();
            if(saida == 7) Run_Program = 2;
        }
    }
}