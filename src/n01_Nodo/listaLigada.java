package n01_Nodo;

public class listaLigada <T>{
    Nodo<T> head;
    Nodo<T> currNode;
    int tamanio;

    public listaLigada(){    //Contructor vacio
        head = null;
    }

    public boolean estaVacia(){
        return head == null;
    }

    public void agregar(T valor){
        if (this.head == null){
            this.head = new Nodo<>(valor);
            this.tamanio++;
        }else{
            currNode = this.head;
            while (currNode.getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new Nodo<>(valor));
        }
    }
    //nota:el recast de datos no es proporcional al dado
    public int buscar(T valor){
        currNode = this.head;
        int contador = 0;
        while(currNode != null){
            if (currNode.getData() == valor){
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    public boolean actualizar(T valor , T nuevo){
        currNode = this.head;
        while (currNode != null){
            if (currNode.getData() == valor){
                currNode.setData(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }

    public void transversal(){
        currNode = this.head;
        while (currNode != null){
            System.out.println(currNode.getData());
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
}
