package t04ConjuntoAdt;

public class main_t03ConjuntoAdt {
    public static void main(String[] args) {

        t03ConjuntoAdt <Integer> a1 = new t03ConjuntoAdt<Integer>();
        t03ConjuntoAdt <Integer> a2 = new t03ConjuntoAdt<Integer>();

        a1.longitud();
        a1.Agregar(5);
        a1.Agregar(38);
        a1.Agregar(47);
        a1.Agregar(3);
        a1.Agregar(4);
        a1.Agregar(23);
        a1.Agregar(2);

        a2.Agregar(5);
        a2.Agregar(38);
        a2.Agregar(47);
        a2.Agregar(4);
        a2.Agregar(3);
        a2.Agregar(23);
        a2.Agregar(14);
        a2.Agregar(2);
        a2.Agregar(89);

        a1.imprimir();
        a2.imprimir();

        a1.longitud();
        a2.longitud();
        System.out.println("CONJUNTO A1");
        a1.imprimir();
        System.out.println("CONJUNTO A2");
        a2.imprimir();


        System.out.println("A1 UNION A A2");
        a1.Interseccion(a2).imprimir();
        System.out.println("A1 INTERSECCION A A2");
        a1.Union(a2).imprimir();
        System.out.println("A2 DIFERENCIA A1");
        a2.Diferencia(a1).imprimir();












    }
}
