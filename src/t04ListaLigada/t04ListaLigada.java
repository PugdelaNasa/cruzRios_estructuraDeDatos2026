package t04ListaLigada;

import n01_Nodo.Nodo;

public class t04ListaLigada <T>{
    nodo<T> head;
    nodo<T> currNode;
    int size;

    public t04ListaLigada() {
        head = null;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public void agregar_al_final(T valor){
        if (estaVacia()) {
            this.head = new nodo<>(valor);
            size++;
            System.out.println(size + " elementos");
            return;
        }
        currNode = this.head;
        while(currNode.getSiguiente() != null){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new nodo<>(valor));
        size++;
        System.out.println(size + " elementos");
    }

    public void agregar_al_inicio(T valor){
        nodo<T> inicio = new nodo<>((T)(Integer)valor);
        inicio.setSiguiente(head);
        head = inicio;
        size++;
        System.out.println(size + " elementos");
    }

    public void agregar_despues_de(T referencia, T valor){
        currNode = head;
        while(currNode.getDato() != referencia){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new nodo<>(valor,currNode.getSiguiente()));
        size++;
        System.out.println(size + " elementos");
    }

    public void eliminar_el_primero(){
        head = head.getSiguiente().getSiguiente();

    }

    public void eliminar_el_ultimo(){
        nodo<T> prev = head;
        nodo<T> curr = head.getSiguiente();
        while (curr.getSiguiente() != null) {
            prev = curr;
            curr = curr.getSiguiente();
        }
        // 'curr' es el último, 'prev' es el penúltimo
        prev.setSiguiente(null);
        size--;
    }

    public void eliminar(T posicion){
        nodo<T> prev = head;
        nodo<T> curr = head.getSiguiente();
        int pos = 0;
        while (pos < (Integer)posicion) {
            prev = curr;
            curr = curr.getSiguiente();
            pos++;
        }
        // 'curr' es el último, 'prev' es el penúltimo
        prev.setSiguiente(null);
        size--;
    }

    public void transversal(){
        currNode = this.head;
        while (currNode != null){
            System.out.print(currNode.getDato() + " -> " );
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }


}
