import static java.lang.System.out;

class Contador {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++) {
            out.print("El valor del contador es: " + contador + ".\n");
        }
        out.println("Hecho!");
    }
}