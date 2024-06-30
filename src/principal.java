import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        ConsultaCambio consulta = new ConsultaCambio();
            int option = 0;
            while (option !=7) {

            System.out.println("*******************************************" +
                    "Bienvenido al convertidor de moneda =)" +
                    " seleccione una opcion" +
                    "1) Dolar => Peso Mexicano" +
                    "2) Peso Mexicano => Dolar" +
                    "3) Dolar => Real Brasileño" +
                    "4) Real brazileño => Dolar" +
                    "5) Dolar => Euro" +
                    "6) Euro => Dolar" +
                    "7) Salir" +
                    "*******************************************");

            option = lectura.nextInt();
            lectura.nextLine();

            switch (option) {

                case 1:
                Conversor.convertir("USD",  "MXN",consulta, lectura);
                break;
                case 2:
                    Conversor.convertir("MXN",  "USD",consulta, lectura);
                    break;
                case 3:
                    Conversor.convertir("USD",  "BRL",consulta, lectura);
                    break;
                case 4:
                    Conversor.convertir("BRL",  "USD",consulta, lectura);
                    break;
                case 5:
                    Conversor.convertir("USD",  "MXN",consulta, lectura);
                    break;
                case 6:
                    Conversor.convertir("USD",  "EUR",consulta, lectura);
                    break;
                case 7:
                    System.out.println("saliendo de la aplicacion...");;
                    break;
            }
        }
    }
}
