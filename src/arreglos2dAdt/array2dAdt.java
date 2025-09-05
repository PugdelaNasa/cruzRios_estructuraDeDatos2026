package arreglos2dAdt;

public class array2dAdt <T>{
    private int ren;
    private int col;
    private T[][] datos;

    public array2dAdt (int filas , int columnas) {
        this.ren = filas;
        this.col = columnas;
        datos = (T[][]) new Object[filas][columnas];
    }

    public T obtenerElemento(int indexFilas,int indexColumnas){
        if(indexFilas < datos.length  && indexFilas >= 0 &&
                indexColumnas < datos[0].length  && indexColumnas > 0){
            return datos[indexFilas][indexColumnas];
        }
        return datos[indexFilas][indexColumnas];
    }

    public void setElemento( int ren, int col , T dato){
        if (ren < datos.length  && ren >= 0 &&
                col < datos[0].length  && col > 0 ){
            datos[ren][col] = dato;
        }else {
            System.out.println("No se puede establecer el elemento");
        }
    }

    public int getRowSize(){
        System.out.println("Longitud filas "+datos.length);
        return datos.length;
    }

    public int getColSize(){
        System.out.println("Longitud columnas "+ datos[0].length);
        return datos[0].length;
    }

    public void limpiar(T dato){
        for(int i=0; i< datos.length;i++){
            for(int j=0; j<datos[0].length;j++){
                datos[i][j] = dato;
            }
        }
    }

    public void imprimir(){
        for(int i=0;i < datos.length;i++){
            System.out.println();
            for(int j=0;j<datos[0].length;j++){
                System.out.print(datos[i][j] + "  ");
            }
        }
        System.out.println();
    }

    public String toString(){
        String res = "";
        for(int i=0; i<datos.length;i++){
            for(int j=0;j<datos[0].length;j++){
                res += datos[i][j] + " --> ";
            }
        }
        return res;
    }

    Character[] piezasNegro = {
            '\u265C', // torre
            '\u265E', // caballo
            '\u265D', // alfil
            '\u265B', // reyna
            '\u265A',// rey
            '\u265D', // alfil
            '\u265E', // caballo
            '\u265C', // torre
            '\u265F',  //peon
            '\u265F',  //peon
            '\u265F',  //peon
            '\u265F',  //peon
            '\u265F',  //peon
            '\u265F',  //peon
            '\u265F',  //peon
            '\u265F',  //peon
    };

    Character[] piezasBlanco = {
            '\u2656', // torre
            '\u2658', // caballo
            '\u2657', // alfil
            '\u2655', // reyna
            '\u2654',// rey
            '\u2657', // alfil
            '\u2658', // caballo
            '\u2656', // torre
            '\u2659',  //peon
            '\u2659',  //peon
            '\u2659',  //peon
            '\u2659',  //peon
            '\u2659',  //peon
            '\u2659',  //peon
            '\u2659',  //peon
            '\u2659',  //peon
    };
    
    

    public void ponerFichasBlanco() {
        int contador = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if (contador < piezasNegro.length) {
                    try {
                        datos[i][j] = (T) piezasNegro[contador]; // cast controlado
                    } catch (ClassCastException e) {
                        System.out.println("Error: el tipo genérico no es Character");
                    }
                    contador++;
                }
            }
        }
    }

    public void ponerFichasNegro() {
        int contador = 0;
        for (int i = datos.length -1 ; i >= datos.length-3; i--) {
            for (int j = 0; j <datos[0].length; j++) {
                if (contador < piezasNegro.length) {
                    try {
                        datos[i][j] = (T) piezasNegro[contador]; // cast controlado
                    } catch (ClassCastException e) {
                        System.out.println("Error: el tipo genérico no es Character");
                    }
                    contador++;
                }
            }
        }
    }

}
