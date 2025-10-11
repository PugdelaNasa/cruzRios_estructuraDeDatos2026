package t06_ColasSistemaClinica;

public class SistemaClinica <T>{
    NodoSistemaClinica<T> primerPaciente;
    NodoSistemaClinica<T> ultimoPaciente;

    public SistemaClinica() {
        primerPaciente = null;
        ultimoPaciente = null;
    }

    public boolean estaVacia() {
        return primerPaciente == null;

    }

    public void registrarPaciente(T nombre,T edad ,T estatura) {
        NodoSistemaClinica<T> aux = new NodoSistemaClinica(nombre,edad,estatura);
        if (estaVacia()) {
            primerPaciente = aux;
            ultimoPaciente = primerPaciente;
        }
        else {
            ultimoPaciente.setSiguiente(aux);
        }
        ultimoPaciente = aux;
        System.out.println("PACIENTE: " +ultimoPaciente.getNombre());
        System.out.println("REGISTRADO CON EXITO");
        System.out.println();
    }

    public void atenderPaciente() {
        if (estaVacia()) {
            return ;
        }
        System.out.println(this.primerPaciente.toString());
        primerPaciente = primerPaciente.getSiguiente();
        if (estaVacia()) {
            ultimoPaciente = null;
        }
        System.out.println();
    }

    public void imprimirColaPaciente() {
        NodoSistemaClinica<T> apoyo ;
        apoyo = primerPaciente;
        if (estaVacia()) {
            System.out.println("No hay paciente");
            return;
        }
        System.out.println("ESTADO DE LA COLA");
        while (apoyo != null) {
            System.out.println(apoyo.getNombre() + " --> ");
            apoyo = apoyo.getSiguiente();
        }
        System.out.println();
    }
}

