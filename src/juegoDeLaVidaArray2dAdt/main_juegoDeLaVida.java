package juegoDeLaVidaArray2dAdt;

public class main_juegoDeLaVida {
    public static void main(String[] args) {
        juegoDeLaVida <Integer> d1 = new juegoDeLaVida(40,40);
        d1.limpiar(0);

        // === LWSS que va de izquierda a derecha ===
        d1.establecerElemento(1, 5, 2);
        d1.establecerElemento(1, 5, 5);
        d1.establecerElemento(1, 6, 1);
        d1.establecerElemento(1, 6, 5);
        d1.establecerElemento(1, 7, 5);
        d1.establecerElemento(1, 8, 1);
        d1.establecerElemento(1, 8, 4);

// === LWSS que va de derecha a izquierda ===
        d1.establecerElemento(1, 10, 14);
        d1.establecerElemento(1, 10, 17);
        d1.establecerElemento(1, 11, 17);
        d1.establecerElemento(1, 12, 13);
        d1.establecerElemento(1, 12, 17);
        d1.establecerElemento(1, 13, 16);
        d1.establecerElemento(1, 13, 17);

// === Pentadecathlon en el centro ===
        d1.establecerElemento(1, 8, 9);
        d1.establecerElemento(1, 9, 9);
        d1.establecerElemento(1, 10, 8);
        d1.establecerElemento(1, 10, 10);
        d1.establecerElemento(1, 11, 9);
        d1.establecerElemento(1, 12, 9);
        d1.establecerElemento(1, 13, 9);
        d1.establecerElemento(1, 14, 9);
        d1.establecerElemento(1, 15, 8);
        d1.establecerElemento(1, 15, 10);
        d1.establecerElemento(1, 16, 9);
        d1.establecerElemento(1, 17, 9);

// === Glider desde esquina superior izquierda ===
        d1.establecerElemento(1, 0, 1);
        d1.establecerElemento(1, 1, 2);
        d1.establecerElemento(1, 2, 0);
        d1.establecerElemento(1, 2, 1);
        d1.establecerElemento(1, 2, 2);

// === Glider desde esquina inferior derecha ===
        d1.establecerElemento(1, 18, 18);
        d1.establecerElemento(1, 17, 17);
        d1.establecerElemento(1, 16, 18);
        d1.establecerElemento(1, 16, 16);
        d1.establecerElemento(1, 16, 17);







// === Glider esquina superior izquierda ===
        d1.establecerElemento(1, 0, 1);
        d1.establecerElemento(1, 1, 2);
        d1.establecerElemento(1, 2, 0);
        d1.establecerElemento(1, 2, 1);
        d1.establecerElemento(1, 2, 2);

// === Glider esquina superior derecha ===
        d1.establecerElemento(1, 0, 38);
        d1.establecerElemento(1, 1, 37);
        d1.establecerElemento(1, 2, 36);
        d1.establecerElemento(1, 2, 37);
        d1.establecerElemento(1, 2, 38);

// === Glider esquina inferior izquierda ===
        d1.establecerElemento(1, 38, 1);
        d1.establecerElemento(1, 37, 2);
        d1.establecerElemento(1, 36, 0);
        d1.establecerElemento(1, 36, 1);
        d1.establecerElemento(1, 36, 2);

// === Glider esquina inferior derecha ===
        d1.establecerElemento(1, 38, 38);
        d1.establecerElemento(1, 37, 37);
        d1.establecerElemento(1, 36, 36);
        d1.establecerElemento(1, 36, 37);
        d1.establecerElemento(1, 36, 38);

// === LWSS que va de izquierda a derecha (fila 10) ===
        d1.establecerElemento(1, 10, 5);
        d1.establecerElemento(1, 10, 8);
        d1.establecerElemento(1, 11, 4);
        d1.establecerElemento(1, 11, 8);
        d1.establecerElemento(1, 12, 8);
        d1.establecerElemento(1, 13, 4);
        d1.establecerElemento(1, 13, 7);

// === LWSS que va de derecha a izquierda (fila 30) ===
        d1.establecerElemento(1, 30, 32);
        d1.establecerElemento(1, 30, 35);
        d1.establecerElemento(1, 31, 35);
        d1.establecerElemento(1, 32, 31);
        d1.establecerElemento(1, 32, 35);
        d1.establecerElemento(1, 33, 34);
        d1.establecerElemento(1, 33, 35);

// === Pentadecathlon en el centro (20,20 aprox) ===
        d1.establecerElemento(1, 14, 20);
        d1.establecerElemento(1, 15, 20);
        d1.establecerElemento(1, 16, 19);
        d1.establecerElemento(1, 16, 21);
        d1.establecerElemento(1, 17, 20);
        d1.establecerElemento(1, 18, 20);
        d1.establecerElemento(1, 19, 20);
        d1.establecerElemento(1, 20, 20);
        d1.establecerElemento(1, 21, 19);
        d1.establecerElemento(1, 21, 21);
        d1.establecerElemento(1, 22, 20);
        d1.establecerElemento(1, 23, 20);

// === Blinker cerca del centro ===
        d1.establecerElemento(1, 25, 19);
        d1.establecerElemento(1, 25, 20);
        d1.establecerElemento(1, 25, 21);

// === Toad en la parte inferior central ===
        d1.establecerElemento(1, 34, 18);
        d1.establecerElemento(1, 34, 19);
        d1.establecerElemento(1, 34, 20);
        d1.establecerElemento(1, 35, 19);
        d1.establecerElemento(1, 35, 20);
        d1.establecerElemento(1, 35, 21);



        System.out.print("GENERACION 0");
        d1.imprimir();
        d1.celulas();
        System.out.println();


        d1.generaciones(40);

    }
}
