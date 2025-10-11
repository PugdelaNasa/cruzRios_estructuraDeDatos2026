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
        NodoSistemaClinica<T> aux = new NodoSistemaClinica(nombre);
        if (estaVacia()) {
            primerPaciente = new NodoSistemaClinica(nombre);
            ultimoPaciente = primerPaciente;
        }
        else {
            ultimoPaciente.setSiguiente(aux);
        }
        ultimoPaciente = aux;
    }

    public String eliminarPaciente() {
        if (estaVacia()) {
            return null;
        }
        String info = primerPaciente.toString();
        primerPaciente = primerPaciente.getSiguiente();
        if (estaVacia()) {
            ultimoPaciente = null;
        }
        return info;
    }

    public void imprimirPaciente() {
        NodoSistemaClinica<T> apoyo ;
        apoyo = primerPaciente;
        if (estaVacia()) {
            System.out.println("No hay paciente");
            return;
        }

        while (apoyo != null) {
            System.out.println(apoyo + " --> ");
            apoyo.setSiguiente(primerPaciente.getSiguiente());

        }


    }
}

