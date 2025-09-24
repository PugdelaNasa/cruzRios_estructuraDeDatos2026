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
            currNode = this.head;

            while(currNode.getDato() != referencia ){

                currNode = currNode.getSiguiente();
            }
            System.out.println();
            System.out.println(currNode.getDato());
            System.out.println(currNode.getSiguiente().getDato());
            currNode.setSiguiente(new NodoDoble<>(elemento,currNode.getSiguiente(),currNode));
            System.out.println(currNode.getSiguiente().getDato());

            currNode.getSiguiente().getSiguiente().setAnterior(currNode.getSiguiente());
            this.tamanio++;
    }


    public int obtener(int posicion){
        if(posicion <= tamanio)
        {
            NodoDoble<T> currNode;
            currNode = this.head;
            int contador = 1;
            while(contador != posicion){
                currNode = currNode.getSiguiente();
                contador++;
            }
            System.out.println();
            System.out.println(currNode.getDato());
            System.out.println(this.tamanio);
            return 0;
        }else{
            return -1;
        }
    }

    public void eliminar_el_primero(){
        this.head = this.head.getSiguiente();
        this.tamanio--;
    }



    public void eliminar_el_ultimo(){
        this.tail = this.tail.getAnterior();
        this.tail.setSiguiente(null);
        this.tamanio--;
    }

    public void eliminar(int posicion){
        if(posicion < 0 || posicion >= this.tamanio){
            return;
        }
        if(posicion == 1){
            this.head = this.head.getSiguiente();
            this.tamanio--;
        }else{
            NodoDoble<T> currNode;
            currNode = this.head;
            for(int i = 1; i < posicion-1; i++){
                currNode = currNode.getSiguiente();
            }
            NodoDoble<T> elimNode = currNode.getSiguiente();
            currNode.setSiguiente(elimNode.getSiguiente());
            currNode.getSiguiente().setAnterior(currNode);
            this.tamanio--;
        }
    }

    public int buscar(T valor){
        NodoDoble<T> currNode;
        currNode = this.head;
        int lugar = 1;
        while(currNode.getDato() != valor){
            currNode = currNode.getSiguiente();
            lugar++;
        }
        return lugar;
    }

    public void actualizar(T a_buscar, T valor){
        NodoDoble<T> currNode;
        currNode = this.head;
        int posicion = (Integer) buscar(a_buscar);
        for(int i = 1; i < posicion; i++){
            currNode = currNode.getSiguiente();
        }
        currNode.setDato(valor);
    }



    //CLASE PARA  PRUEBAS CONCRETASSSSS
    public void pruebas(){
        System.out.println(this.tail.getAnterior());
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
