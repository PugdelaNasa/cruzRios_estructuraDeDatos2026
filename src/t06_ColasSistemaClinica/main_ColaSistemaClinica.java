package t06_ColasSistemaClinica;

import t06_Colas.Cola;

public class main_ColaSistemaClinica {
    public static void main(String[] args) {
        SistemaClinica <Object> b1 = new SistemaClinica<>();

        b1.registrarPaciente("Pugberto",7,1.2);
        b1.registrarPaciente("Juan",8,1.2);
        b1.registrarPaciente("Marcelo",95,1.24);
        b1.imprimirColaPaciente();
        b1.eliminarPaciente();
        b1.imprimirColaPaciente();


    }
}
