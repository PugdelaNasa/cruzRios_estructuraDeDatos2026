package t03ConjuntoAdt;

import arreglos1dAdt.arrayADT;

public class main_t03ConjuntoAdt {
    public static void main(String[] args) {

        t03ConjuntoAdt <Integer> a1 = new t03ConjuntoAdt<Integer>();
        a1.longitud();
        a1.Agregar(2);
        a1.Agregar(3);
        a1.Agregar(7);
        a1.Agregar(8);
        a1.Agregar(39);
        a1.Agregar(40);
        a1.imprimir();
        a1.Agregar(7);
        a1.Eliminar(7);
        a1.Eliminar(2);
        a1.imprimir();



    }
}
