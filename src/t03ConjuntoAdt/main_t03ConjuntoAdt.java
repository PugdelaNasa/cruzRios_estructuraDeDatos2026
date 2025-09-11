package t03ConjuntoAdt;

import arreglos1dAdt.arrayADT;

public class main_t03ConjuntoAdt {
    public static void main(String[] args) {

        t03ConjuntoAdt <Integer> a1 = new t03ConjuntoAdt<Integer>();
        t03ConjuntoAdt <Integer> a2 = new t03ConjuntoAdt<Integer>();

        a1.longitud();
        a1.Agregar(2);
        a1.Agregar(3);
        a1.Agregar(7);
        a1.Agregar(8);
        a1.Agregar(39);
        a1.Agregar(40);

        a2.Agregar(1);
        a2.Agregar(4);
        a2.Agregar(5);
        a2.Agregar(8);
        a2.Agregar(9);
        a2.Agregar(10);


        a1.Union(a2).imprimir();
        a2.Union(a1).imprimir();



    }
}
