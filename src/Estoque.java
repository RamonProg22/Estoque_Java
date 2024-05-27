import java.util.Scanner;
import java.util.ArrayList;

public class Estoque {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Produto> listEstoque = new ArrayList<>();


    void adiciona_Prod_Estoque(){
        Produto item = new Produto();
        item.NomearItem();
        item.Quantificar();
        item.Valuetion();
        listEstoque.add(item);
    }

    void RemoverEstoque(){
        String Nam_Rem;
        System.out.println("Qual nome do Item a ser removido: ");
        Nam_Rem = sc.nextLine();
        listEstoque.removeIf(listEstoque -> listEstoque.getNome().equalsIgnoreCase(Nam_Rem));
    }
    void addQuantProd(){
        String Nam_Prod;
        System.out.println("Qual nome do Item a ser adicionado: ");
        Nam_Prod = sc.nextLine();
        for(Produto item : listEstoque){
            if(item.getNome().equalsIgnoreCase(Nam_Prod)){
                item.Quantificar();
            }
        }
    }
    void ExibirEstoque(){
        for(Produto item : listEstoque){
            item.Impri();
        }
    }
    void Search_Name(){
        String Nam_Search;
        System.out.println("Qual nome do Item a ser encontrado: ");
        Nam_Search = sc.nextLine();
        for(Produto item : listEstoque){
            if(item.getNome().equalsIgnoreCase(Nam_Search)){
                item.Impri();
            }
        }
    }

}
