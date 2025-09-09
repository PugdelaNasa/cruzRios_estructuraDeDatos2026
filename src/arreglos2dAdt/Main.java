package arreglos2dAdt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola");
        array2dAdt <Integer> b1 = new array2dAdt<>(8,8);
        b1.setElemento(65 , 5,6);
        b1.imprimir();  //IMPRIMIR
        b1.limpiar(0);
        System.out.println();
        b1.imprimir();  //IMPRIMIR
        b1.getColSize();
        b1.getRowSize();
        b1.setElemento(4,4,8);
        b1.ponerFichasBlanco();
        b1.imprimir(); //IMPRIMIR
        b1.ponerFichasNegro();
        b1.imprimir();
    }

}
