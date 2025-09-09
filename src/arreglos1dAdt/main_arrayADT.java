package arreglos1dAdt;

public class main_arrayADT {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        arrayADT<Integer> a1 = new arrayADT<>(5);
        System.out.println(a1.obtenerElemento(2));
        a1.establecerElemento(33,2);
        System.out.println(a1.obtenerElemento(2));
        a1.imprimir();
        a1.limpiar(0);
        a1.imprimir();
        System.out.println("El tam del arre: " + a1.longitud());
        System.out.println(a1.toString());

    }






}
