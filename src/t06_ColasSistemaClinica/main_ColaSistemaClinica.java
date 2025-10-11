package t06_ColasSistemaClinica;

import t06_Colas.Cola;

public class main_ColaSistemaClinica {
    public static void main(String[] args) {
        SistemaClinica <Object> b1 = new SistemaClinica<>();

        b1.registrarPaciente("Lionel",36,1.70);
        b1.registrarPaciente("Cristiano",38,1.87);
        b1.registrarPaciente("Neymar",31,1.75);
        b1.registrarPaciente("Kylian",25,1.78);
        b1.registrarPaciente("Karim",34,1.85);
        b1.registrarPaciente("Sergio",37,1.84);
        b1.registrarPaciente("Kevin",30,1.81);
        b1.registrarPaciente("Robert",35,1.84);
        b1.registrarPaciente("Virgil",32,1.93);
        b1.registrarPaciente("Mohamed",31,1.75);

        b1.imprimirColaPaciente();

        b1.atenderPaciente();


        b1.imprimirColaPaciente();


        b1.atenderPaciente();
        b1.atenderPaciente();
        b1.atenderPaciente();
        b1.atenderPaciente();
        b1.atenderPaciente();

        b1.imprimirColaPaciente();

        b1.atenderPaciente();
        b1.atenderPaciente();
        b1.atenderPaciente();
        b1.atenderPaciente();

        b1.imprimirColaPaciente();

        b1.estaVacia();




    }
}
