package t06_ColasSistemaClinica;

public class NodoSistemaClinica <T> {
    private T nombre;
    private T edad;
    private T estatura;
    NodoSistemaClinica<T> siguiente;

    public NodoSistemaClinica() {
    }

    public NodoSistemaClinica(T nombre){
        this.nombre = nombre;
    }

    public NodoSistemaClinica(T nombre, T edad, T estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public NodoSistemaClinica<T> getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoSistemaClinica<T> siguiente){
        this.siguiente = siguiente;
    }

    //METODO OVERRIDE
    @Override
    public String toString() {
        return "ATENDIENDO -->  NOMBRE:" + this.nombre +
                " /  EDAD:" + this.edad +
                " /  ESTATURA:" + this.estatura;
    }
}

