package n06_Colas;

import n00_Genericos.Libros;

public class ProbarColas {
    public static void main(String[] args) {
        ColaADT <Libros> cola = new ColaADT<>();

        cola.encolar(new Libros("Pocoyo","Steven"));
        cola.encolar(new Libros("Don Pug y su pandilla","Marcelo"));
        cola.encolar(new Libros("El perfume","Peso Pluma"));
        cola.encolar(new Libros("Donda","Kayne West"));
        System.out.println(cola);
        System.out.println();
        System.out.println(cola.desencolar());
        System.out.println("El estado despues es:");
        System.out.println(cola);

    }
}
