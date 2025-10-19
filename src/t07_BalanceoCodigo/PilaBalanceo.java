package t07_BalanceoCodigo;

import java.util.ArrayList;

public class PilaBalanceo <T>{

    private ArrayList<T> datos;

    public PilaBalanceo() {
        datos = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.datos.size() == 0;
    }


    public void push(T dato){
        this.datos.add(dato);
    }

    public T pop(){
        return this.datos.remove(this.datos.size()-1);
    }

    @Override
    public String toString() {
        String str ="";
        for(int i=this.datos.size()-1;i>=0;i--){
            str += this.datos.get(i).toString() + "\n";
        }
        return str;
    }

    public boolean verificarBalanceo(String mensaje){
        PilaBalanceo<Character> cadena = new PilaBalanceo<>();
        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);  // obtiene la letra en la posición i
            if(letra == '{'){
                cadena.push('{');
            }else if(letra == '}'){
                cadena.pop();
            }
        }
        if(cadena.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
