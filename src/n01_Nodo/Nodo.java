package n01_Nodo;

public class Nodo<T> {
    private T data;     //guarda el valor del nodo (puede ser de cualquier tipo gracias al <T>).
    private Nodo<T> siguiente;   //es una referencia a otro objeto Nodo<T>
                            //permite encadenar nodo y formar ED-listas enlazadas

    public Nodo() {   //Constructor vacío: crea un nodo sin valor inicial.
    }

    public Nodo(T data) {    //Constructor con parámetro: crea un nodo con un valor inicial
        this.data = data;
    }

    public Nodo(T data, Nodo<T> siguiente) {   //Constructor que crea nodo y referencia al siguiente nodo de una vez
        this.data = data;
        this.siguiente = siguiente;
    }

    //Puro encapsulamiento
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }

    //METODO OVERRIDE
    @Override
    public String toString() {
        return "|" + this.data + "|->";
    }





}
