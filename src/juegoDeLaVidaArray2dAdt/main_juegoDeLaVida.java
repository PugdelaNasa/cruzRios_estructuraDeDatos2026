package juegoDeLaVidaArray2dAdt;

public class main_juegoDeLaVida {
    public static void main(String[] args) {
        juegoDeLaVida <Integer> d1 = new juegoDeLaVida(20,20);
        d1.limpiar(0);

        // Glider
        d1.establecerElemento(1, 0, 1);
        d1.establecerElemento(1, 1, 2);
        d1.establecerElemento(1, 2, 0);
        d1.establecerElemento(1, 2, 1);
        d1.establecerElemento(1, 2, 2);

// Lightweight Spaceship (LWSS)
        d1.establecerElemento(1, 5, 2);
        d1.establecerElemento(1, 5, 5);
        d1.establecerElemento(1, 6, 1);
        d1.establecerElemento(1, 6, 5);
        d1.establecerElemento(1, 7, 5);
        d1.establecerElemento(1, 8, 1);
        d1.establecerElemento(1, 8, 4);

// Blinker
        d1.establecerElemento(1, 10, 10);
        d1.establecerElemento(1, 10, 11);
        d1.establecerElemento(1, 10, 12);

// Toad
        d1.establecerElemento(1, 15, 5);
        d1.establecerElemento(1, 15, 6);
        d1.establecerElemento(1, 15, 7);
        d1.establecerElemento(1, 16, 6);
        d1.establecerElemento(1, 16, 7);
        d1.establecerElemento(1, 16, 8);

// Beacon
        d1.establecerElemento(1, 15, 15);
        d1.establecerElemento(1, 15, 16);
        d1.establecerElemento(1, 16, 15);
        d1.establecerElemento(1, 17, 18);
        d1.establecerElemento(1, 18, 17);
        d1.establecerElemento(1, 18, 18);

// Bloque (Still life)
        d1.establecerElemento(1, 3, 10);
        d1.establecerElemento(1, 3, 11);
        d1.establecerElemento(1, 4, 10);
        d1.establecerElemento(1, 4, 11);

// Pentadecathlon
        d1.establecerElemento(1, 2, 10);
        d1.establecerElemento(1, 3, 10);
        d1.establecerElemento(1, 4, 9);
        d1.establecerElemento(1, 4, 11);
        d1.establecerElemento(1, 5, 10);
        d1.establecerElemento(1, 6, 10);
        d1.establecerElemento(1, 7, 10);
        d1.establecerElemento(1, 8, 10);
        d1.establecerElemento(1, 9, 9);
        d1.establecerElemento(1, 9, 11);
        d1.establecerElemento(1, 10, 10);
        d1.establecerElemento(1, 11, 10);

        System.out.print("Generacion 0");
        d1.imprimir();
        d1.celulas();
        System.out.println();


        d1.generaciones(1000);

    }
}
