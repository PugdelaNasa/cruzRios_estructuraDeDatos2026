package t06_Colas;

public class main_Cola {
    public static void main(String[] args) {
        Cola <Integer> a1 = new Cola<>();

        a1.encolar(10);
        a1.encolar(20);
        a1.encolar(30);
        a1.imprimir();
        a1.eliminar();
        a1.imprimir();



    }
}
