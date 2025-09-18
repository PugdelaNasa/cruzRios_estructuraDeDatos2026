package t04ListaLigada;

public class main_t04ListaLigada {
    public static void main(String[] args) {
        t04ListaLigada <Integer> beto = new t04ListaLigada<Integer>();

        beto.agregar_al_final(9);
        beto.agregar_al_final(18);
        beto.agregar_al_final(27);
        beto.agregar_al_final(36);
        beto.agregar_al_final(45);
        beto.transversal();

        System.out.println("Lista de Ligadas");
        beto.agregar_al_inicio(1);
        beto.transversal();

        System.out.println("Lista de Ligadas AUUU");
        beto.agregar_despues_de(18,20);
        beto.transversal();

        System.out.println("Lista de Ligadas UTAAA");
        beto.eliminar_el_primero();
        beto.transversal();


    }
}
