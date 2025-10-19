package n07_Pilas;

public class pruebaPilas {
    public static void main(String[] args) {
        PilaADT <Tortillas> tortillas = new PilaADT<>();
        System.out.println("Esta vacia?  " + tortillas.isEmpty());
        tortillas.push(new Tortillas());
        tortillas.push(new Tortillas("Maiz",5.0f, 0.02f));
        tortillas.push(new Tortillas("Maiz",5.0f, 0.03f));
        tortillas.push(new Tortillas("Maiz",5.0f, 0.04f));
        tortillas.push(new Tortillas("Maiz",5.0f, 0.05f));
        tortillas.push(new Tortillas("Maiz",5.0f, 0.06f));
        System.out.println(tortillas);
        System.out.println("-- sacar una tortilla --");
        System.out.println(tortillas.pop());
        System.out.println("Estado actual");
        System.out.println(tortillas);
        System.out.println("El valor en el tope es:");
        System.out.println(tortillas.peek());
        System.out.println("Estado actual");
        System.out.println(tortillas);
        System.out.println("Esta vacia? " + tortillas.isEmpty() );
        System.out.println("Longitud: " + tortillas.longitud());


    }
}
