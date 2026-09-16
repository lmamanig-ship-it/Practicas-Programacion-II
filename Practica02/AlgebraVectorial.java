import java.util.Scanner;

public class AlgebraVectorial {

    private double x;
    private double y;

    // Constructor sin argumentos
    public AlgebraVectorial() {
        x = 0;
        y = 0;
    }

    // Constructor con argumentos
    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // a) Perpendicular: |a+b| = |a-b|
    public boolean perpendicular(AlgebraVectorial b) {

        double sumaX = x + b.x;
        double sumaY = y + b.y;

        double restaX = x - b.x;
        double restaY = y - b.y;

        double suma = Math.sqrt(
            sumaX * sumaX + sumaY * sumaY
        );

        double resta = Math.sqrt(
            restaX * restaX + restaY * restaY
        );

        return Math.abs(suma - resta) < 0.000001;
    }

    // b) Perpendicular: |a-b| = |b-a|
    public boolean perpendicular(double bx, double by) {

        double resta1X = x - bx;
        double resta1Y = y - by;

        double resta2X = bx - x;
        double resta2Y = by - y;

        double r1 = Math.sqrt(
            resta1X * resta1X + resta1Y * resta1Y
        );

        double r2 = Math.sqrt(
            resta2X * resta2X + resta2Y * resta2Y
        );

        return Math.abs(r1 - r2) < 0.000001;
    }

    // c) Perpendicular usando producto escalar
    public boolean perpendicular(AlgebraVectorial b, int opcion) {

        double producto = x * b.x + y * b.y;

        return Math.abs(producto) < 0.000001;
    }

    // e) Paralela usando a = r*b
    public boolean paralela(AlgebraVectorial b) {

        if (b.x != 0) {
            double r = x / b.x;
            return Math.abs(y - r * b.y) < 0.000001;
        }

        if (b.y != 0) {
            double r = y / b.y;
            return Math.abs(x - r * b.x) < 0.000001;
        }

        return x == 0 && y == 0;
    }

    // f) Paralela usando producto
    public boolean paralela(double bx, double by) {

        double resultado = x * by - y * bx;

        return Math.abs(resultado) < 0.000001;
    }

    // g) Proyección de a sobre b
    public AlgebraVectorial proyeccion(AlgebraVectorial b) {

        double producto = x * b.x + y * b.y;

        double longitud = b.x * b.x + b.y * b.y;

        double nuevoX = (producto / longitud) * b.x;
        double nuevoY = (producto / longitud) * b.y;

        return new AlgebraVectorial(nuevoX, nuevoY);
    }

    // h) Componente de a sobre b
    public double componente(AlgebraVectorial b) {

        double producto = x * b.x + y * b.y;

        double longitud = Math.sqrt(
            b.x * b.x + b.y * b.y
        );

        return producto / longitud;
    }

    // Mostrar vector @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Programa principal
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese x del vector A: ");
    double ax = sc.nextDouble();

    System.out.print("Ingrese y del vector A: ");
    double ay = sc.nextDouble();

    System.out.print("Ingrese x del vector B: ");
    double bx = sc.nextDouble();

    System.out.print("Ingrese y del vector B: ");
    double by = sc.nextDouble();

    AlgebraVectorial a = new AlgebraVectorial(ax, ay);
    AlgebraVectorial b = new AlgebraVectorial(bx, by);

    System.out.println("Vector A: " + a);
    System.out.println("Vector B: " + b);

    System.out.println("a) Perpendiculares: "
            + a.perpendicular(b));

    System.out.println("b) Perpendiculares: "
            + a.perpendicular(bx, by));

    System.out.println("c) Perpendiculares por producto escalar: "
            + a.perpendicular(b, 1));

    System.out.println("e) Paralelos: "
            + a.paralela(b));

    System.out.println("f) Paralelos por producto: "
            + a.paralela(bx, by));

    System.out.println("g) Proyección de A sobre B: "
            + a.proyeccion(b));

    System.out.println("h) Componente de A sobre B: "
            + a.componente(b));

    sc.close();
    }
}