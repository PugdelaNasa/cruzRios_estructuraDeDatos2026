package n06_Colas;

import java.util.ArrayList;

public class ColaADT <T> {
    private ArrayList<T> datos;

    public ColaADT() {
        datos = new ArrayList<>();
    }

    public boolean estaVacia() {
        return datos.size() == 0;
    }

    public T frente(){
        return datos.get(0);
    }

    public void encolar (T elemento){
        datos.add(elemento);
    }

    public T desencolar(){
        return datos.remove(0);
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < datos.size(); i++){
            str = str + datos.get(i).toString() + "\n --- \n" ;
        }
        return str;
    }
}
