package n02_ListaDobleLigadas;

public class NodoDoble<T> {
    T dato;
    NodoDoble<T> siguiente;
    NodoDoble<T> anterior;

    public NodoDoble() {
    }

    public NodoDoble(T dato) {
        this.dato = dato;
    }


    public NodoDoble(T dato, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public NodoDoble (T dato, NodoDoble<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoDoble (NodoDoble<T> anterior , T dato){
        this.dato = dato;
        this.anterior = anterior;
    }

    public T getDato(){
        return dato;
    }

    public void setDato(T dato){
        this.dato = dato;
    }

    public NodoDoble<T> getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente){
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior(){
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior){
        this.anterior = anterior;
    }

    public String toString(){
        return "<-- "+ dato+ " -->";
    }
}
