package juegoDeLaVidaArray2dAdt;

public class main_juegoDeLaVida {
    public static void main(String[] args) {
        juegoDeLaVida <Integer> d1 = new juegoDeLaVida(9,9);
        d1.limpiar(1);

        d1.establecerElemento(1,0,0);
        d1.establecerElemento(0,0,1);
        d1.establecerElemento(1,1,1);
        d1.establecerElemento(1,6,4);
        d1.establecerElemento(1,5,6);
        d1.establecerElemento(1,2,1);
        d1.establecerElemento(1,5,5);
        d1.establecerElemento(1,4,6);
        d1.establecerElemento(1,6,5);
        d1.establecerElemento(0,1,0);
        d1.establecerElemento(0,1,8);
        System.out.print("Generacion 0");
        d1.imprimir();
        d1.celulas();
        System.out.println();



        d1.generaciones(3);




    }
}
