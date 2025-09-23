package n02_ListaDobleLigadas;

public class listaDobleLigadas <T>{
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    private int tamanio;

    public listaDobleLigadas() {
    }

    public int get_tamanio() {
        return tamanio;
    }

    public void agregarAlInicio(T elemento){
        if(this.head == null){
            this.head = new NodoDoble<>(elemento);
            this.tail = this.head;
            this.tamanio++;
        }else {
            this.head = new NodoDoble<>(elemento, this.head,null);
            this.head.getSiguiente().setAnterior(this.head);
            this.tamanio++;
        }
    }

    public void agregarAlFinal(T elemento){
        if(this.tail == null){
            this.tail = new NodoDoble<>(elemento);
            this.head = this.tail;
            this.tamanio++;
        }else{
            this.tail = new NodoDoble<>(elemento, this.tail,null);
            this.tail.getAnterior().setSiguiente(this.tail);
            this.tamanio++;
        }
    }

    public void agregar_despues_de(T referencia ,T elemento){
        NodoDoble<T> currNode;
        NodoDoble<T> auxNode;
        currNode = this.head;
        auxNode = currNode.anterior;
        while(currNode.getDato() != referencia ){
            auxNode = currNode;
            currNode = currNode.getSiguiente();
        }
        System.out.println(currNode.getDato());
        System.out.println(auxNode.getDato());

        currNode.setAnterior(auxNode.getAnterior());
        currNode.setSiguiente(new NodoDoble<>(elemento,currNode.getSiguiente(),auxNode));
        auxNode.setSiguiente(currNode);
        currNode.getSiguiente().setAnterior(currNode);




    }

    public void transversal(int direccion){
        NodoDoble<T> currNode;
        if (direccion == 1){
            currNode = this.head;
            while(currNode != null){
                System.out.print(currNode);
                currNode = currNode.getSiguiente();
            }
        }
        if (direccion == 2){
            currNode = this.tail;
            while(currNode != null){
                System.out.print(currNode);
                currNode = currNode.getAnterior();
            }
        }
    }


}
