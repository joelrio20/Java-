package practica2if;

import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;

public class Practica2if {

    public static void main(String[] args) {
        Practica2if jr = new Practica2if();
        //jr.if_structura();
        // jr.if_anidado();
        //jr.if_ternario();
        //jr.switch_m();
        //jr.pideDato();
        jr.password();

    }

    public void if_structura() {

        int a = 200;
        int b = 35;

        if (a > b) {
            System.out.println(a + " es mayor que " + b);

        } else {
            System.out.println(a + " es menor que " + b);

        }

    }

    public void if_anidado() {

        int a = 2008;
        String b = ("tsuru");

        if (a < 2008) {

        }
        if (b.equals("tsuru")) {
            System.out.println("NO pasa");

        } else {
            System.out.println("Si pasa");
        }

    }

    public void if_ternario() {

        int a = 100, b = 25;

        int ternario = a < b ? a : b;

        System.out.println(ternario);

    }

    public void switch_m() {

        int a = 5;

        switch (a) {

            case 5:

                System.out.println("El valor es 5");

                break;

            default:

                System.out.println("El dato es incorrecto");

        }

    }

    public void pideDato() {

        //putros mensajes
        System.out.println("selecciona una opcion");
        System.out.println("1.- cuadrado");
        System.out.println("2.- triangulo");
        System.out.println("3.- Salir");

        //obtener datos
        Scanner nombre_objeto = new Scanner(System.in); // a huevo para iniciar
        //es donde se guarda el dato del cliente
        int valor = nombre_objeto.nextInt();

        switch (valor) {

            case 1:

                System.out.println("cuadrado");

                break;

            case 2:

                System.out.println("triangulo");

                break;

            case 3:

                break;

            default:

                System.out.println("No existe el numero");

                break;

        }

    }

    public void password() {

        int pass = 123456;

        System.out.println("Ingresa tu contraseña");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a == pass) {

            Practica2if nombre_objeto = new Practica2if();
            nombre_objeto.entra();

        } else {

            Practica2if nombre_objeto = new Practica2if();
            nombre_objeto.error();

        }

    }


    private void error() {

        System.out.println("Error intente de nuevo");
        Practica2if set = new Practica2if();
        set.password();

    }

    private void entra() {
        System.out.println("Bienvenido");
    }

}
