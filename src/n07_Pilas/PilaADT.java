package n07_Pilas;

import java.util.ArrayList;

public class PilaADT <T>{
    private ArrayList<T> datos;

    public PilaADT() {
        datos = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.datos.size() == 0;
    }

    public int longitud (){
        return this.datos.size();
    }

    public void push(T dato){
        this.datos.add(dato);
    }

    public T pop(){
        return this.datos.remove(this.datos.size()-1);
    }

    public T peek(){
        return this.datos.get(this.datos.size()-1);
    }

    @Override
    public String toString() {
        String str ="";
        for(int i=this.datos.size()-1;i>=0;i--){
            str += this.datos.get(i).toString() + "\n";
        }
        return str;
    }
}
