package t07_BalanceoCodigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main_PilaBalanceo {
    public static void main(String[] args) {
        PilaBalanceo<Character> codigo1 = new PilaBalanceo<>();
        StringBuilder contenido = new StringBuilder(); // para acumular texto
        String ruta = "src/t07_BalanceoCodigo/pruebaaa.txt" ;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n"); // lo agrega al StringBuilder
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        String texto = contenido.toString();


        // VERIFICAR EXPRESION
        System.out.println("La expresion esta balanceada?   " + codigo1.verificarBalanceo(texto));

    }
}
