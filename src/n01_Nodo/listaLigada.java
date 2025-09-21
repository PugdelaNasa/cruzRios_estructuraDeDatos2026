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

    public void agregar_despues_de(T referencia, T valor) {
        if (head == null) {
            System.out.println("La lista está vacía, no se puede insertar después de " + referencia);
            return;
        }

        Nodo<T> currNode = head;

        while (currNode != null && !currNode.getData().equals(referencia)) {
            currNode = currNode.getSiguiente();
        }

        if (currNode == null) {
            System.out.println("No se encontró el elemento " + referencia + " en la lista.");
            return;
        }

        currNode.setSiguiente(new Nodo<>(valor, currNode.getSiguiente()));
        this.tamanio++;
    }



    public void eliminar_el_ultimo(){
        currNode = this.head;  //siguiente
        Nodo<T> naja = null;  //anterior
        while (currNode.getSiguiente() != null){
            naja = currNode;
            currNode = currNode.getSiguiente();
        }
        naja.setSiguiente(null);
        this.tamanio--;
    }

    public void eliminar_el_primero(){
        head = this.head.getSiguiente();
        this.tamanio--;
    }

    public void eliminar(int posicion) {
        if (posicion < 0 || posicion >= this.tamanio) {
            return; // posición inválida
        }

        if (posicion == 0) {
            eliminar_el_primero(); // ya lo tienes implementado
            this.tamanio--;
            return;
        }

        Nodo<T> currNode = head;
        // avanzar hasta el nodo anterior al que quieres eliminar
        for (int i = 0; i < posicion - 1; i++) {
            currNode = currNode.getSiguiente();
        }

        // "salta" el nodo que quieres eliminar
        Nodo<T> nodoEliminar = currNode.getSiguiente();
        currNode.setSiguiente(nodoEliminar.getSiguiente());
        this.tamanio--;
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
