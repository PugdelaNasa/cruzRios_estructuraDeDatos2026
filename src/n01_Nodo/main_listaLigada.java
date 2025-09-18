package n01_Nodo;

public class main_listaLigada {
    public static void main(String[] args) {
        listaLigada <Integer> l1 = new listaLigada<>();

        System.out.println("Esta vacia? " + l1.estaVacia());
        l1.agregar(10);
        l1.agregar(20);
        l1.agregar(30);
        l1.agregar(40);
        l1.agregar(50);
        l1.agregar(60);

        System.out.println(l1.buscar(20));
        System.out.println(l1.actualizar(30,35));

        l1.transversal();




    }
}
