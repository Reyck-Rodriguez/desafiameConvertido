import java.io.IOException;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) throws IOException, InterruptedException {
        conexionApi conetado = new conexionApi();

        System.out.println("bienvenido al mejor conversor de monedas\nBy Junior Rodriguez de Alura Latam");
        System.out.println("*******************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("indicame tu Nombre.");
        String nombre = input.nextLine();
        nombre = nombre.toUpperCase();
        System.out.println("*******************************************");
        System.out.println("Hola " + nombre + ", vamos a comvertir tus divisas!!!");
        boolean salir = false;
        transformerOtimonedas tranformito = new transformerOtimonedas();
        while (!salir) {
            double calcu;
            String metido;
            monedita monedaActual;
            System.out.println("\ndime la Opcion que prefieras utilizar:");
            System.out.println("""
                    
                    1. Convertir de Dolar ($) a Pesos Argetinos ($a)
                    2. Convertir de Pesos Argentinos ($a) a Dolar ($)
                    3. Convertir de Dolar ($) a Real Brazileño (R$)
                    4. Convertir de Real Brazileño (R$) a Dolar ($)
                    5. Convertir de Dolar ($) a Pesos Colombianos ($c)
                    6. Convertir de Pesos Colombianos ($c) a Dolar ($)
                    7. Salir""");
            int opcion = input.nextInt();
            if (opcion < 1 || opcion > 7) {
                System.out.println("Por favor ingrese una opción valida");
            } else {

                switch (opcion) {
                    case 1:
                        metido = conetado.conexionApi("USD");
                        monedaActual = tranformito.trasnformar(metido);
                        System.out.println("******************************************************");
                        System.out.println("el valor de la divisa Peso Argentino es $ " + monedaActual.getConversion("ARS"));
                        System.out.println("******************************************************");
                        System.out.println("ingrese la cantidad de dolares que desea convertir $ ?");
                        opcion = input.nextInt();
                        System.out.println("******************************************************");
                        calcu = opcion * monedaActual.getConversion("ARS");
                        System.out.println("el total convertido es: $" + calcu);
                        System.out.println("*****************************************************");
                        break;
                    case 2:
                        metido = conetado.conexionApi("ARS");
                        monedaActual = tranformito.trasnformar(metido);
                        System.out.println("******************************************************");
                        System.out.println("el valor de la divisa Dolar es " + String.format("%.5f", monedaActual.getConversion("USD")));
                        System.out.println("******************************************************");
                        System.out.println("ingrese la cantidad de dolares que desea convertir $ ?");
                        opcion = input.nextInt();
                        System.out.println("******************************************************");
                        calcu = opcion * monedaActual.getConversion("USD");
                        System.out.println("el total convertido es: " + calcu);
                        System.out.println("*****************************************************");
                        break;
                    case 3:
                        metido = conetado.conexionApi("USD");
                        monedaActual = tranformito.trasnformar(metido);
                        System.out.println("******************************************************");
                        System.out.println("el valor de la divisa Real Brazileño es " + String.format("%.5f", monedaActual.getConversion("BRL")));
                        System.out.println("******************************************************");
                        System.out.println("ingrese la cantidad de dolares que desea convertir $ ?");
                        opcion = input.nextInt();
                        System.out.println("******************************************************");
                        calcu = opcion * monedaActual.getConversion("BRL");
                        System.out.println("el total convertido es: " + calcu);
                        System.out.println("*****************************************************");
                        break;
                    case 4:
                        metido = conetado.conexionApi("BRL");
                        monedaActual = tranformito.trasnformar(metido);
                        System.out.println("******************************************************");
                        System.out.println("el valor de la divisa Dolar es " + String.format("%.5f", monedaActual.getConversion("USD")));
                        System.out.println("******************************************************");
                        System.out.println("ingrese la cantidad de dolares que desea convertir $ ?");
                        opcion = input.nextInt();
                        System.out.println("******************************************************");
                        calcu = opcion * monedaActual.getConversion("USD");
                        System.out.println("el total convertido es: " + calcu);
                        System.out.println("*****************************************************");
                        break;
                    case 5:
                        metido = conetado.conexionApi("USD");
                        monedaActual = tranformito.trasnformar(metido);
                        System.out.println("******************************************************");
                        System.out.println("el valor de la divisa Pesos Colombianos es " + String.format("%.5f", monedaActual.getConversion("COP")));
                        System.out.println("******************************************************");
                        System.out.println("ingrese la cantidad de dolares que desea convertir $ ?");
                        opcion = input.nextInt();
                        System.out.println("******************************************************");
                        calcu = opcion * monedaActual.getConversion("COP");
                        System.out.println("el total convertido es: $" + calcu);
                        System.out.println("*****************************************************");
                        break;
                    case 6:
                        metido = conetado.conexionApi("COP");
                        monedaActual = tranformito.trasnformar(metido);
                        System.out.println("******************************************************");
                        System.out.println("el valor de la divisa Dolar es " + String.format("%.5f", monedaActual.getConversion("USD")));
                        System.out.println("******************************************************");
                        System.out.println("ingrese la cantidad de dolares que desea convertir $ ?");
                        opcion = input.nextInt();
                        System.out.println("******************************************************");
                        calcu = opcion * monedaActual.getConversion("USD");
                        System.out.println("el total convertido es: $" + calcu);
                        System.out.println("*****************************************************");
                        break;
                    case 7:
                        salir = true;

                }
                while (true) {
                    System.out.println("¿Desea realizar otra conversion? (si/no)");
                    metido = input.next();

                    if (metido.equalsIgnoreCase("no")) {
                        System.out.println("Gracias por utilizar nuestro conversor de monedas " + nombre + ", hasta pronto!");
                        salir = true;
                        break;
                    } else if (metido.equalsIgnoreCase("si")) {
                        break;
                    } else {
                        System.out.println("Por favor ingrese una opción valida (si/no)");
                    }
                }
            }
        }
    }
}
