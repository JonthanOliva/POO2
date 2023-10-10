/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasControl;

/**
 *
 * @author chuch
 */
public class CondicionIF {

    /**
     * @param args the command line arguments Jonathan Jesus Oliva Ocampo
     * 2127784
     */
    public static void main(String[] args) {

        // decNumero();
        // calificacion();
        // raizPerfecta();
        //descuento();
        maestroContratacion();

    }

    public static void decNumero() {
        int num;
        System.out.println("Ingrese numero:");
        num = Lector.intEntero();

        if (num == 0) {
            System.out.println("El numero es cero.");
        } else if (num % 2 == 0) {
            System.out.println("El numero es par.");
            if (num > 0) {
                System.out.println("Es positivo.");
            } else {
                System.out.println("Es negativo.");
            }
        } else {
            System.out.println("El numero es impar.");
            if (num > 0) {
                System.out.println("Es positivo.");
            } else {
                System.out.println("Es negativo.");
            }

        }
    }

    public static void calificacion() {
        float c1, c2, c3;
        System.out.println("Ingrese calificacion 1:");
        c1 = Lector.decFloat();
        System.out.println("Ingrese calificacion 2:");
        c2 = Lector.decFloat();
        System.out.println("Ingrese calificacion 3:");
        c3 = Lector.decFloat();
        float calif = (c1 + c2 + c3) / 3;
        String respuesta;
        System.out.println("Su calificacion es: " + calif);
        respuesta = (calif > 6) ? "Aprobado" : "Reprobado";
        System.out.println(respuesta);

    }

    public static void raizPerfecta() {
        int num;
        System.out.println("Ingrese numero: ");
        num = Lector.intByte();
        double resultado = Math.sqrt(num);
        if (resultado == (int) resultado) {
            System.out.println("El numero: " + num + " tiene raiz perfecta y es: " + (int) resultado);
        } else {
            System.out.println("No tiene raiz perfecta");
        }

    }

    public static void descuento() {
        System.out.println("Edad del pasajero");
        int edad = Lector.intEntero();

        float tarifa = 25; //

        if (edad >= 12 && edad <= 18) {
            System.out.println("Eres un adolescente, no hay descuento aplicable.");
        } else if (edad >= 14 && edad <= 26) {
            tarifa *= 0.9;
            System.out.println("Eres un joven, se aplica un 10% de descuento.");
        } else if (edad >= 27 && edad <= 59) {
            tarifa *= 0.8;
            System.out.println("Eres un adulto, se aplica un 20% de descuento.");
        } else if (edad >= 60) {
            tarifa *= 0.7;
            System.out.println("Eres una persona mayor, se aplica un 30% de descuento.");
        } else {
            System.out.println("Eres un niño, no hay pasaje a pagar.");

        }

        System.out.println("El pasaje cuesta $" + tarifa);

    }

    public static void maestroContratacion() {

        boolean titulo;
        byte maes, dip, tiempo;

        System.out.println("Tiene titulo:");
        titulo = Lector.booleano();

        System.out.println("No maestrias:");
        maes = Lector.intByte();

        System.out.println("No diplomados:");
        dip = Lector.intByte();

        System.out.println("No horas:");
        tiempo = Lector.intByte();

        if (titulo == true) {
            if (maes >= 1 || dip >= 3) {
                if (tiempo >= 4) {

                } else {

                    System.out.println("No cumples las horas");
                }
                System.out.println("Contratado");
            } else {
                System.out.println("No tienes los requerimientos");
            }
        } else {
            System.out.println("Se requiere titulo");
        }

        if ((titulo == true) && (maes >= 1 || dip >= 3) && (tiempo >= 4)) {
            System.out.println("Contratado");
        } else {
            System.out.println("No nontratad");
        }

    }

    private static void comparaDinero() {

        float juan, roberto, luis;
        System.out.println("Dinero Juan");
        juan = Lector.decFloat();
        System.out.println("Dinero Roberto");
        roberto = Lector.decFloat();
        System.out.println("Dinero Luis");
        luis = Lector.decFloat();

        
        
        
    }

}
