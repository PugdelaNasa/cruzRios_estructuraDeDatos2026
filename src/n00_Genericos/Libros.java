package n00_Genericos;

public class Libros {
    public String titulo;
    public String autor;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor= autor;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + ", Autor: " + autor;
    }

}
