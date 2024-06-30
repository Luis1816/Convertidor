import java.util.Scanner;

public class Conversor {

    public static void convertir (String moneda, String monedaCambio, ConsultaCambio consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Cambio cambio = consulta.busquedaCambio(moneda, monedaCambio);
        System.out.println( "ingrese la cantidad de monedas a convertir de "+ moneda + " a " + monedaCambio);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * cambio.conversion_rate();
        System.out.println("la cantidad de " + cantidad + " " + moneda + " es = " +  cantidadConvertida + monedaCambio);


    }
}
