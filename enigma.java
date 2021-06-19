
package enigma;

import java.util.Base64;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class enigma {
    public static void main(String[] args) {
        String texto;
        texto = JOptionPane.showInputDialog("Pon el texto");
        int opcion;
        Scanner consola = new Scanner(System.in);
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Dime que acción quieres hacer:\n1.Cálculos con Bytes\n2.Mover Char\n3.Base 64"));
        
        if(opcion == 1){
            System.out.println("C - Codificar\nD-Descodificar");
            String opc = consola.next();
            if(opc.equals("C")){
                CodificarCadena(texto);
            }
            if(opc.equals("D")){
                DecodificarCadena(texto);
            }
        }
        if(opcion == 2){
            System.out.println("C - Codificar\nD-Descodificar");
            String opc = consola.next();
            if(opc.equals("C")){
                MoverCaracter(texto);
            }
            if(opc.equals("D")){
                RecuperarCaracter(texto);
            }
        
        }
        if(opcion == 3){
            System.out.println("C - Codificar\nD-Descodificar");
            String opc = consola.next();
            if(opc.equals("C")){
                CodificarBase64(texto);
            }
            if(opc.equals("D")){
                DecodificarBase64(texto);
            }
        
        }
        
    }
    private static void CodificarCadena(String cadena){
        byte[] codificacion = cadena.getBytes();
        for (int i = 0; i <codificacion.length; i++) {
            byte cadbyte = codificacion[i];
            System.out.print(cadbyte + "-" );
        }
    }
    private static void DecodificarCadena(String cadena){
        String [] numeros = cadena.split("-");
        for (int i = 0; i <numeros.length; i++) {
            int letra = Integer.parseInt(numeros[i]);
            System.out.print((char) letra);
        }
    }
    private static void MoverCaracter(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            System.out.print(letra +4+" ");
        }
    }
    private static void RecuperarCaracter(String cadena){
        String [] numeros = cadena.split(" ");
        for (int i = 0; i < numeros.length; i++) {
            int letra = Integer.parseInt(numeros[i])-4;
            System.out.print((char) letra);
        }
    }
    private static void CodificarBase64(String cadena){
        byte[] codificacion = cadena.getBytes();
        String codificado = Base64.getEncoder().encodeToString(codificacion);
        System.out.print(codificado);
    } //Q2FzYQ==
    private static void DecodificarBase64(String cadena){
        byte[] decodificacion = Base64.getDecoder().decode(cadena);
        String salida = new String (decodificacion);
        System.out.print(salida );
    }
}
