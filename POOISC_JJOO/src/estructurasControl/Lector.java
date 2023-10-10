/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasControl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Leximas
 */
public class Lector {

    private static String inicializar() {
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            buzon = teclado.readLine();

        } catch (Exception e) {
            System.out.append("Entrada incorrecta)");

        }

        return buzon;
    }

    /**
     * Metodo para leer una cadena de caracteres
     *
     * @return String
     */
    public static String cadena() {
        String valor;
        valor = inicializar();
        return valor;
    }

    /**
     * Metodo para leer solo un caracter
     *
     * @return char
     */
    public static char caracter() {
        String valor = inicializar();
        if (valor.length() > 1) {
            System.out.println("Solo muestro la primera letra");
        }
        return valor.charAt(0);
    }

    /**
     * Metodo para leer un valor byte
     *
     * @return byte
     */
    public static byte intByte() {
        boolean flag = false;
        byte valor = 0;
        do {
            try {

                valor = Byte.parseByte(inicializar());
                flag = true;
            } catch (Exception e) {
                System.err.println("No es numero byte");
                System.err.println("Ingresa otro valor");
            }
        } while (!flag);
        return valor;
    }

    /**
     * Metodo para leer un valor short
     *
     * @return short
     */
    public static short intShort() {
        boolean flag = false;
        short valor = 0;
        do {
            try {

                valor = Short.parseShort(inicializar());
                flag = true;
            } catch (Exception e) {
                System.err.println("No es numero short");
                System.err.println("Ingresa otro valor");
            }
        } while (!flag);
        return valor;
    }

    /**
     * Metodo para leer un valor int
     *
     * @return int
     */
    public static int intEntero() {
        boolean flag = false;
        int valor = 0;
        do {
            try {

                valor = Integer.parseInt(inicializar());
                flag = true;
            } catch (Exception e) {
                System.err.println("No es numero entero");
                System.err.println("Ingresa otro valor");
            }
        } while (!flag);
        return valor;
    }

    /**
     * Metodo para leer un valor long
     *
     * @return long
     */
    public static long intLong() {
        boolean flag = false;
        long valor = 0;
        do {
            try {

                valor = Long.parseLong(inicializar());
                flag = true;
            } catch (Exception e) {
                System.err.println("No es numero entero largo");
                System.err.println("Ingresa otro valor");
            }
        } while (!flag);
        return valor;
    }

    /**
     * Metodo para leer un valor float
     *
     * @return float
     */
    public static float decFloat() {
        boolean flag = false;
        float valor = 0;
        do {
            try {

                valor = Float.parseFloat(inicializar());
                flag = true;
            } catch (Exception e) {
                System.err.println("No es numero decimal simple");
                System.err.println("Ingresa otro valor");
            }
        } while (!flag);
        return valor;
    }

    /**
     * Metodo para leer un valor double
     *
     * @return double
     */
    public static double decDouble() {
        boolean flag = false;
        double valor = 0;
        do {
            try {

                valor = Double.parseDouble(inicializar());
                flag = true;
            } catch (Exception e) {
                System.err.println("No es numero doble decimal");
                System.err.println("Ingresa otro valor");
            }
        } while (!flag);
        return valor;
    }

    /**
     * Metodo para leer un valor booleano
     *
     * @return boolean
     */
    public static boolean booleano() {
        boolean flag = false;
        String estado = "";
        boolean valor = false;
        do {
            try {
                System.out.println("Ingresa \n1 para true\t0 para false");
                estado = inicializar();
                switch (estado) {
                    case "1":
                        valor = true;
                        flag = true;
                        break;
                    case "0":
                        flag = true;
                        break;
                    default:
                        System.err.println("Valor no valido");
                }
            } catch (Exception e) {
                System.err.println("No es un valor valido");
                System.err.println("Ingresa un \"1\" o un \"0\"");

            }
        } while (!flag);
        return valor;
    }
    
    public static void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
