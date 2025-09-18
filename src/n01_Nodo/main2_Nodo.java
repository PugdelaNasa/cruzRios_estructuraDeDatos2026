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
        Nodo<Integer> aux = currNode.getSiguiente();
        currNode.setSiguiente(new Nodo<>(25));
        currNode.getSiguiente().setSiguiente(aux);

        currNode = cabezaDos;  //imprimir
        while (currNode != null) {
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }

        //VERSION 2 - INSERTAR EL 35 ENTRE EL 30 Y 40
        System.out.println();
        System.out.println("Insertar el 35 entre el 30 y 40");
        currNode = cabezaDos;
        while(currNode.getData() != 30) {
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new Nodo<>(35,currNode.getSiguiente()));

        currNode = cabezaDos;  //imprimir
        while (currNode != null) {
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }

        //VERSION 3 -- JUNTAR NODO NUEVO CON CABEZA DOS
        System.out.println();
        System.out.println("Juntar nodo nuevo + cabeza dos");
        Nodo<Integer> nuevo = new Nodo<>(5);
        nuevo.setSiguiente(cabezaDos);

        currNode = nuevo;  //imprimir
        while (currNode != null) {
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }

        //VERSION 3 -- AÑADIR 100 AL FINAL
        System.out.println();
        System.out.println("Añadir 100 al final");
        currNode = nuevo;
        while(currNode.getSiguiente() != null){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new Nodo<>(100));

        currNode = nuevo;  //imprimir
        while (currNode != null) {
            System.out.print(currNode.getData() + " -->");
            currNode= currNode.getSiguiente();
        }

    }
}
