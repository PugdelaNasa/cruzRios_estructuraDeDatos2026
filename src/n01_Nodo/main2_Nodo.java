package n01_Nodo;

public class main2_Nodo {
    public static void main(String[] args) {
        System.out.println("Nombre del Nodo");
        Nodo<Integer> cabeza = new Nodo<>(10,new Nodo<>(20,new Nodo<>(30 , new Nodo<>(40))));
        Nodo<Integer> currNode = cabeza;

        //PA IMPRIMIR LISTA COMPLETA
        System.out.println("Imprimiendo lista completa");
        while(currNode != null){
            System.out.print(currNode);
            currNode= currNode.getSiguiente();
        }

        //VERSION 2
        System.out.println();
        System.out.println("---- version dos.exe -------");
        Nodo <Integer> cabezaDos= new Nodo<>(10);
        currNode = cabezaDos;

        System.out.println("Imprimiendo lista completa"); //imprimir
        while(currNode != null){
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }

        //VERSION 2 - AGREGAR EL 20
        System.out.println();
        System.out.println("Agregar el 20");
        cabezaDos.setSiguiente(new Nodo<>(20));
        currNode = cabezaDos;
        while(currNode != null){
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }

        //VERSION 2 - AGREGAR EL 30 Y 40
        System.out.println();
        System.out.println("Agregar el 30 y 40");
        cabezaDos.getSiguiente().setSiguiente(new Nodo<>(30));
        cabezaDos.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(40));
        cabezaDos.getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(50));
        cabezaDos.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(60));

        currNode = cabezaDos;  //imprimir
        while (currNode != null) {
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }


        //VERSION 2 - INSERTAR EL 25 ENTRE EL 20 Y EL 30
        System.out.println();
        System.out.println("Insertar el 25 entre el 20 y 30");
        currNode = cabezaDos;
        while (currNode.getData() != 20) {
            currNode = currNode.getSiguiente();
        }
        Nodo<Integer> aux = currNode.getSiguiente().getSiguiente();  //variable
        currNode.setSiguiente(new Nodo<>(aux.getData(),aux.getSiguiente()));

        currNode = cabezaDos;  //imprimir
        while (currNode != null) {
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }


    }
}
