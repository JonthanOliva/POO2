/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasControl;

/**
 *
 * @author SGEQ177
 */
public class Selectivas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mesDia();
       // diasP();
       menuCafe();
    }

    private static void mesDia() {
        byte numeroMes;
        System.out.println("Dame numero del mes:");
        numeroMes = Lector.intByte();
        switch (numeroMes) {
            case 2 ->
                System.out.println("El mes tiene 28 o 29 dias");
            case 1, 3, 5, 7, 8, 10, 12 ->
                System.out.println("El mes tiene 31 dias");
            case 4, 6, 9, 11 ->
                System.out.println("El mes tiene 30 dias");
            default ->
                System.out.println("El mes no valido");
        }
    }

    private static void diasP() {
        String nombreMes;
        System.out.println("Dame del mes:");
        nombreMes = Lector.cadena();

        switch (nombreMes.toLowerCase()) {
            case "febreo" ->
                System.out.println("El mes " + nombreMes + " tiene 28 dias");
            case "enero","marzo","mayo","julio","agosto","octubre","diciembre" ->
                System.out.println("El mes tiene " + nombreMes + " 31 dias");
            case "abrl","junio","septiembre","noviembre" ->
                System.out.println("El mes " + nombreMes + " tiene 30 dias");
            default ->
                System.out.println("El mes " + nombreMes + " no es valido");
        }

    }

    private static void menuCafe() {
        //se tienen 3 tamaños de cafe diferentes precios
        //en la compra de 4 cafes o mas una dona gratis
        //mostar total con iva
        char opc;
        byte numCafes;
        float total = 0;

        System.out.println("a) Chico\nb) Mediano\nc) Grande");
        System.out.println("Tamaño a elegir:");
        opc = Lector.caracter();

        System.out.println("Cuantos va a llevar:");
        numCafes = Lector.intByte();
        switch (Character.toLowerCase(opc)) {
            case 'a':
                total = numCafes * 20f;

                break;
            case 'b':
                total = numCafes * 25f;
                break;
            case 'c':
                total = numCafes * 30f;
                break;

            default:
                System.out.println("Opcion no valida: " + opc);
        }

        total *= 1.16;

        if (numCafes >= 4&&total>0) {
            System.out.println("Dona gratis");
        }

        System.out.println("Su total es:" + total);

    }

}
