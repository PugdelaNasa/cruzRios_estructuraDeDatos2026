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

        l1.agregar_al_final(70);
        l1.agregar_al_inicio(0);
        l1.agregar_despues_de(30,35);

        System.out.println("ORIGINAL");
        l1.transversal();
        l1.eliminar(5);
        l1.eliminar_el_ultimo();
        l1.eliminar_el_primero();
        System.out.println("POST ELIMINAR");
        l1.transversal();







    }
}
