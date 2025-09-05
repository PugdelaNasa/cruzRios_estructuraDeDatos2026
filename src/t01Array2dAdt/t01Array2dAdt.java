package t01Array2dAdt;

public class t01Array2dAdt <T> {

    private int filas;
    private int columnas;
    private T[][] datos;

    public t01Array2dAdt (int filas , int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        datos = (T[][]) new Object[filas][columnas];
    }

    public T obtenerElemento(int indexFilas,int indexColumnas){
        if(indexFilas < datos.length  && indexFilas >= 0 &&
                indexColumnas < datos[0].length  && indexColumnas > 0){
            return datos[indexFilas][indexColumnas];
        }
        return datos[indexFilas][indexColumnas];
    }

    public void establececerElemento(T dato, int indexFilas,int indexColumnas){
        if (indexFilas < datos.length  && indexFilas >= 0 &&
                indexColumnas < datos[0].length  && indexColumnas > 0 ){
            datos[indexFilas][indexColumnas] = dato;
        }else {
            System.out.println("No se puede establecer el elemento");
        }
    }

    public int longitudFilas(){
        System.out.println("Longitud filas "+datos.length);
        return datos.length;
    }

    public int longitudColumnas(){
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
}
