package n02_ListaDobleLigadas;

import java.sql.SQLOutput;
public class main_listaDobleLigadas {
    public static void main(String[] args) {
        listaDobleLigadas<Integer> l1 = new listaDobleLigadas<>();




        l1.agregarAlInicio(40);
        l1.agregarAlInicio(30);
        l1.agregarAlInicio(20);
        l1.agregarAlInicio(10);

        l1.transversal(1);

        l1.agregar_despues_de(30,35);

        l1.transversal(1);



        System.out.println();
        System.out.println("PRUEBA 4");
        l1.actualizar(20,21);
        l1.transversal(1);
        System.out.println();
        l1.pruebas();










    }

}
