package n01_Nodo;

public class main_listaLigada {
    public static void main(String[] args) {
        listaLigada <Integer> l1 = new listaLigada<>();
        l1.agregar(10);
        l1.agregar(20);
        l1.agregar(30);
        l1.agregar(40);
        l1.agregar(50);
        l1.agregar(60);


        l1.transversal();
        System.out.println(l1.tamanio);
        l1.eliminar(5);
        l1.transversal();
        System.out.println(l1.tamanio);





    }
}
