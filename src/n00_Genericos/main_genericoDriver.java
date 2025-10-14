package n00_Genericos;

public class main_genericoDriver {
    public static void main(String[] args) {
        CajaCarton <String> myBox = new CajaCarton<String>("Hola");
        System.out.println(myBox.getContenido());

        CajaCarton <Libros> myBoxMoving = new CajaCarton<>(new Libros("Don Pug y su Pandilla","Marcelo"));
        System.out.println(myBoxMoving.getContenido());
        System.out.println(myBoxMoving.getContenido().getAutor());
        System.out.println(myBoxMoving.getContenido().getTitulo());
    }
}
