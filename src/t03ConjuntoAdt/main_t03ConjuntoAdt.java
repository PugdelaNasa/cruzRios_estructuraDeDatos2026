package t03ConjuntoAdt;

import arreglos1dAdt.arrayADT;

public class main_t03ConjuntoAdt {
    public static void main(String[] args) {

        t03ConjuntoAdt <Integer> a1 = new t03ConjuntoAdt<Integer>();
        t03ConjuntoAdt <Integer> a2 = new t03ConjuntoAdt<Integer>();

        a1.longitud();
        a1.Agregar(4);
        a1.Agregar(88);
        a1.Agregar(14);
        a1.Agregar(1);
        a1.Agregar(5);
        a1.Agregar(24);
        a1.Agregar(38);
        a1.Agregar(47);

        a2.Agregar(5);
        a2.Agregar(38);
        a2.Agregar(47);
        a2.Agregar(4);
        a2.Agregar(3);
        a2.Agregar(23);
        a2.Agregar(14);
        a2.Agregar(2);
        a2.Agregar(89);

        a1.Diferencia(a2).imprimir();


    }
}
