package t01Array2dAdt;

public class main_t01Array2dAdt {
    public static void main(String[] args) {
        System.out.println("Hola");
        t01Array2dAdt <Integer> b1 = new t01Array2dAdt(8,8);
        b1.establececerElemento(65 , 5,6);
        b1.imprimir();
        b1.limpiar(7);
        System.out.println();
        b1.imprimir();
        b1.longitudColumnas();
        b1.imprimir();
        System.out.println("2 pug loqueando wasaa");
    }
}
