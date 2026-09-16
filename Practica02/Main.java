import java.util.Scanner;

public class Main {

    static class Vector3D {

        double a1, a2, a3;

        // Constructor
        Vector3D(double a1, double a2, double a3) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
        }

        // a) Suma de vectores
        Vector3D sumar(Vector3D b) {
            return new Vector3D(
                a1 + b.a1,
                a2 + b.a2,
                a3 + b.a3
            );
        }

        // b) Multiplicacion por escalar
        Vector3D multiplicar(double r) {
            return new Vector3D(
                r * a1,
                r * a2,
                r * a3
            );
        }

        // c) Longitud del vector
        double longitud() {
            return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
        }

        // d) Normal del vector
        Vector3D normal() {
            double l = longitud();

            return new Vector3D(
                a1 / l,
                a2 / l,
                a3 / l
            );
        }

        // e) Producto escalar
        double productoEscalar(Vector3D b) {
            return a1 * b.a1 +
                   a2 * b.a2 +
                   a3 * b.a3;
        }

        // f) Producto vectorial
        Vector3D productoVectorial(Vector3D b) {
            return new Vector3D(
                a2 * b.a3 - a3 * b.a2,
                a3 * b.a1 - a1 * b.a3,
                a1 * b.a2 - a2 * b.a1
            );
        }

        void mostrar() {
            System.out.println("(" + a1 + ", " + a2 + ", " + a3 + ")");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ingresar vector A
        System.out.println("Ingrese el vector A:");
        System.out.print("a1: ");
        double a1 = sc.nextDouble();

        System.out.print("a2: ");
        double a2 = sc.nextDouble();

        System.out.print("a3: ");
        double a3 = sc.nextDouble();

        // Ingresar vector B
        System.out.println("\nIngrese el vector B:");
        System.out.print("b1: ");
        double b1 = sc.nextDouble();

        System.out.print("b2: ");
        double b2 = sc.nextDouble();

        System.out.print("b3: ");
        double b3 = sc.nextDouble();

        Vector3D a = new Vector3D(a1, a2, a3);
        Vector3D b = new Vector3D(b1, b2, b3);

        // Escalar
        System.out.print("\nIngrese el escalar r: ");
        double r = sc.nextDouble();

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");

        System.out.print("a) Suma A + B = ");
        a.sumar(b).mostrar();

        System.out.print("b) r * A = ");
        a.multiplicar(r).mostrar();

        System.out.println("c) Longitud de A = " + a.longitud());

        System.out.print("d) Normal de A = ");
        a.normal().mostrar();

        System.out.println("e) Producto escalar A . B = "
                + a.productoEscalar(b));

        System.out.print("f) Producto vectorial A x B = ");
        a.productoVectorial(b).mostrar();

        sc.close();
    }
}
