package n02_ListaDobleLigadas;

public class main_listaDobleLigadas {
    public static void main(String[] args) {
        listaDobleLigadas<Integer> l1 = new listaDobleLigadas<>();




        l1.agregarAlInicio(50);
        l1.agregarAlInicio(40);
        l1.agregarAlInicio(30);
        l1.agregarAlInicio(20);
        l1.agregarAlInicio(10);

        l1.transversal(1);

        System.out.println("HOLA AMIKSO");
        l1.agregar_despues_de(10,45);
        l1.transversal(1);





    }

}
