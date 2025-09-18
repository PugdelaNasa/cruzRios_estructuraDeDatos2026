package n01_Nodo;

public class main_Nodo <T>{
    public static void main(String[] args){
        Nodo<Integer> head = new Nodo<>(30);
        head.setSiguiente(new Nodo<>(50));
        head.getSiguiente().setSiguiente(new Nodo<>(25));
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(17));
        Nodo<Integer> currNode = head ;
        System.out.println(currNode);

        //Pa imprimir un determinado
        System.out.println("Imprimiendo desde un head determinado");
        System.out.println(head); //30
        System.out.println(head.getSiguiente()); //50
        System.out.println(head.getSiguiente().getSiguiente());  //25
        System.out.println(head.getSiguiente().getSiguiente().getSiguiente()); //17




        //Pa imprimir toda la lista completa
        System.out.println("Imprimiendo lista completa");
        while(currNode != null){
            System.out.print(currNode);
            currNode= currNode.getSiguiente();
        }

        //Agregar un numero al final
        System.out.println();
        currNode = head;
        while(currNode.getSiguiente() != null){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new Nodo<>(88));


        //imprimir
        currNode = head;
        System.out.println("Imprimiendo lista completa , 88 al final");
        while(currNode != null){
            System.out.print(currNode);
            currNode= currNode.getSiguiente();
        }

        //INSERTAR 77 DESPUES DE 50
        System.out.println();
        System.out.println("Insertar 77 despues de 50");
        currNode = head;
        while(currNode.getData() != 50){
            currNode = currNode.getSiguiente();
        }
        System.out.println(currNode);

        Nodo<Integer> tmp = currNode.getSiguiente(); //MODO XD
        currNode.setSiguiente(new Nodo<>(77));
        currNode.getSiguiente().setSiguiente(tmp);


        currNode = head;   //imprimir
        System.out.println();
        System.out.println("Imprimiendo lista PRUEBA");
        while(currNode != null){
            System.out.print(currNode);
            currNode= currNode.getSiguiente();
        }


    }
}
