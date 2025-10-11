package t06_Colas;

import n01_Nodo.Nodo;

public class Cola <T>{
    Cola<T> primerNodo;
    Cola<T> ultimoNodo;

    public Cola() {
        primerNodo = null;
        ultimoNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public void encolar (T valor) {
        Cola<T> aux = new Cola<>(valor);
        if(estaVacia()){
            primerNodo = aux;
            ultimoNodo = primerNodo;
        }
        else{
            ultimoNodo.setSiguiente(aux);
        }
        ultimoNodo = aux;
    }

    public T eliminar(){
        if(estaVacia()  ){
            return null;
        }
        T var = primerNodo.getData();
        primerNodo = primerNodo.getSiguiente();
        if(estaVacia()){
            ultimoNodo = null;
        }
        System.out.println("Valor eliminado: " + var);
        return var;
    }

    public void imprimir(){
        Cola<T> actual ;
        actual = primerNodo;

        while(actual != null){
            System.out.println(actual.getData() + " --> ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }




}