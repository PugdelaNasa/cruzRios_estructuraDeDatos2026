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
            this.tamanio++;
        }
    }

    public void agregar_al_final(T valor){
        if(estaVacia()){
            this.head = new Nodo<>(valor);
            this.tamanio++;
            return;
        }
        currNode = this.head;
        while (currNode.getSiguiente() != null){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new Nodo<>(valor));
        this.tamanio++;
    }

    public void agregar_al_inicio(T valor){
        Nodo<T> inicio = new Nodo<>(valor);
        inicio.setSiguiente(head);
        head = inicio;
        this.tamanio++;
    }

    public void agregar_despues_de(T referencia,T valor){
        currNode = head;
        while (currNode.getSiguiente() != referencia){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new Nodo<>(valor,currNode.getSiguiente()));
        this.tamanio++;
    }

    public void eliminar(T posicion){

    }

    public void eliminar_el_ultimo(){

    }

    public void eliminar_el_primero(){

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
            System.out.print(currNode.getData() + " -> " );
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
}
