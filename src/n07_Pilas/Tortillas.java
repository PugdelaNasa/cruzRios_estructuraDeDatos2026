package n07_Pilas;

public class Tortillas {
    private String ingrediente;
    private float radios;
    private float grosor;

    public Tortillas(String ingrediente, float radios, float grosor) {
        this.ingrediente = ingrediente;
        this.radios = radios;
        this.grosor = grosor;
    }

    public Tortillas() {
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setRadios(float radios) {
        this.radios = radios;
    }

    public float getRadios(){
        return radios;
    }

    public void setGrosor(float grosor) {
        this.grosor = grosor;
    }

    public float getGrosor(){
        return grosor;
    }

    @Override
    public String toString() {
        return "Tortilla{" +
                "ingrediente='" + ingrediente + '\'' +
                ", radio=" + radios +
                ", grosor=" + grosor +
                '}';
    }


}
