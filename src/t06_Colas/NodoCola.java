package t06_Colas;

import n01_Nodo.Nodo;

public class NodoCola<T>{
    public T data;
    public NodoCola<T> siguiente;

    public NodoCola(){
    }

    public NodoCola(T data){
        this.data = data;
    }

    public NodoCola(T data , NodoCola<T> siguiente){
        this.data = data;
        this.siguiente = siguiente;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoCola<T> getSiguiente(NodoCola<T> siguiente) {
        return siguiente;
    }

    public NodoCola<T> getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoCola<T> siguiente){
        this.siguiente = siguiente;
    }

    //METODO OVERRIDE
    @Override
    public String toString() {
        return "|" + this.data + "|->";
    }
}