package t03ConjuntoAdt;

import java.sql.SQLOutput;

public class t03ConjuntoAdt <T> {
    private int tamanio = 0;
    private T[] elementos;

    public t03ConjuntoAdt() {
        this.tamanio = tamanio;
        elementos = (T[]) new Object[tamanio];  //por default es un arreglo vacio
    }

    public int longitud() {
        System.out.println("Longitud " + (elementos.length));
        return tamanio;

    }

    public boolean contiene(T elemento) {
        for (int i = 0; i < tamanio; i++) {
            if (elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }


    //Para aumentar el tamaño de nuestro array de vacio a --> [null]
    public void Agregar(T elemento) {
        if(contiene(elemento) == false) {
            T[] copia = (T[]) new Object[tamanio + 1];  //se vuelve a inicializar como un arreglos con puros null
            // Copiar elementos anteriores
            for (int i = 0; i < tamanio; i++) {
                copia[i] = elementos[i];   //se copian la matriz anterior con actual
            }
            copia[tamanio] = elemento;
            elementos = copia; // reemplazar el arreglo viejo
            tamanio++;
        }else {
            System.out.println("El elemento ya existe");
        }
    }

    public void Eliminar(T elemento) {
        for (int i = 0; i < tamanio; i++) {
            if (elementos[i] == elemento) {
                elementos[i] = elementos[tamanio - 1];
                tamanio--;
                break;
            }
        }
        }








    //METODO EXTRA
    public void imprimir(){
        for (int i = 0; i < tamanio; i++) {
            System.out.print(elementos[i] + " --> ");
        }
        System.out.println();
    }


    }

