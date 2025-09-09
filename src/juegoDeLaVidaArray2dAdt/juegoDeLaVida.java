package juegoDeLaVidaArray2dAdt;

import java.awt.event.ContainerAdapter;

public class juegoDeLaVida <T>{
    private int filas;
    private int columnas;
    private T[][] datos;

    public juegoDeLaVida(int filas,int columnas){
        this.filas = filas;
        this.columnas = columnas;
        datos = (T[][])new Object[filas][columnas];
    }

    public T obtenerElemento(int indexFila, int indexColumna){
        return datos[indexFila][indexColumna];
    }

    public void establecerElemento(T dato , int indexFila, int indexColumna) {
        datos[indexFila][indexColumna] = dato;
    }

    public int longitudFilas(){
        return filas;
    }

    public int longitudColumnas(){
        return columnas;
    }

    public void limpiar(T dato){
        for(int i=0;i < datos.length;i++){
            for(int j=0;j < datos.length;j++){
                datos[i][j] = dato;
            }
        }
    }

    public void imprimir(){
        for(int i=0;i < datos.length;i++){
            System.out.println();
            for(int j=0;j < datos[0].length;j++){
                System.out.print(datos[i][j] + " ");
            }
        }
        System.out.println();
    }

    public String toString(){
        String res = "";
        for(int i=0;i < datos.length;i++){
                for(int j=0;j < datos[0].length;j++){
                    res += datos[i][j];
                }
        }
        return res;
    }

    public void celulas(){
        int celulasVivas=0;
        int celulasMuertas=0;
        for(int i=0;i < datos.length;i++){
            for(int j=0;j < datos[0].length;j++){
                if(datos[i][j]==(Integer)1){
                    celulasVivas++;
                    celulasMuertas =celulasVivas-(filas*columnas);
                }
            }
        }
        System.out.println("Celulas vivas: "+celulasVivas);
        System.out.println("Celulas Muertas: "+celulasMuertas);
    }

    public int vecinos(int fila,int columna){
        int vecinosVivos = 0;
        int vecinosMuertos = 0;
        for(int i=fila-1;i <= fila+1;i++){  //i fila
            for(int j=columna-1;j <= columna+1;j++){
                if (i >= 0 && i<datos.length && j >= 0  && j < datos[0].length){
                    double distancia = (int)(Math.sqrt(Math.pow(columna - j, 2) + Math.pow(fila - i, 2)));
                    if(distancia == 1.0 && datos[i][j] == (Integer)1){
                        vecinosVivos++;
                    }if(distancia == 1.0 && datos[i][j] == (Integer)0){
                        vecinosMuertos++;
                    }
                }

            }
        }
        return vecinosVivos;
    }

    public void generaciones(int numeroGeneraciones){
        for(int contador= 1;contador <=numeroGeneraciones; contador++){

            //copia de objeto array2dADT ,es el arreglo donde se meten los datos y se restablece con cada generacion [i][j]=new
            T[][] copia = (T[][]) new Object[filas][columnas];

            for(int i=0;i < datos.length;i++){
                for(int j=0;j < datos[0].length;j++){
                    //limpiar dejarlos en 0
                    int generacionElemento=1;
                    if(datos[i][j] == (Integer)1 && (vecinos(i,j) == 2 ||  vecinos(i,j) == 3)){
                        generacionElemento = 1;
                    }else if(datos[i][j] == (Integer)0 && (vecinos(i,j) == 3 )){
                        generacionElemento = 1;
                    }else{
                        generacionElemento = 0;
                    }
                    copia[i][j] = (T)(Integer)generacionElemento;
                }
            }
            datos = copia;
            System.out.println();
            System.out.print("Generacion " + (contador) );
            imprimir();
            celulas();
            System.out.println();

        }
    }
    }





