package t07_BalanceoCodigo;

import n07_Pilas.PilaADT;
import n07_Pilas.Tortillas;

public class main_PilaBalanceo {
    public static void main(String[] args) {
        PilaBalanceo<Object> codigo1 = new PilaBalanceo<>();

        String codigoFuente =" if(condicion true){hola=1}"
                ;

        System.out.println("La expresion esta balanceada?   " + codigo1.verificarBalanceo(codigoFuente));

    }
}
