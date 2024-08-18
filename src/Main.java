import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();

        //ADD
        adicionarItem(lista, "Alonso");
        adicionarItem(lista, "Ryan");
        adicionarItem(lista, "Pedro");

        //READ
        System.out.println("Itens Adicionados: ");
        lerItem(lista);

        //UPDATE
        atualizarItem(lista, 2, "João");
        System.out.println("Atualização dos itens: ");
        lerItem(lista);

        //DELETE
        deletarItem(lista, 1);
        System.out.println("Após deletar: ");
        lerItem(lista);


    }

    //Métodos
    public static void adicionarItem(ArrayList lista, String item) {
        lista.add(item);
    }

    public static void atualizarItem(ArrayList lista, int indice, String item){
        lista.set(indice, item);
    }

    public static void deletarItem(ArrayList lista, int indice){
        lista.remove(indice);
    }

    public static void lerItem(ArrayList lista){
        System.out.println("A lista é: " + lista);
    }

}