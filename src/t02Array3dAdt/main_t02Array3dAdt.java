package t02Array3dAdt;

public class main_t02Array3dAdt {
    public static void main(String[] args) {
        System.out.println("Hello 3D");
        t02Array3dAdt <Integer> c1 = new t02Array3dAdt(3,6,7);
        c1.obtenerLongitudX();
        c1.establecerElemento(45,2,5,6);
        c1.obtenerElemento(2,5,6);
    }
}
