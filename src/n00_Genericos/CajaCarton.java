package n00_Genericos;

public class CajaCarton <T>{
    public T contenido;

    public CajaCarton(T contenido){
        this.contenido = contenido;
    }

    public T getContenido(){
        return contenido;
    }

    public void setContenido(T contenido){
        this.contenido = contenido;
    }
}
