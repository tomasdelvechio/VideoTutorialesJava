import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

class LoopDo {
    public static void main(String args[]) {
        File archivo = new File("~/archivoTest.txt");
        Scanner miScanner = new Scanner(System.in);
        char replica;
        do {
            out.print("¿Borrar Archivo? (s/n) ");
            replica = miScanner.findWithinHorizon(".", 0) . charAt(0);
        } while (replica != 's' && replica != 'n' && replica != 'S' && replica != 'N');
        
        if (replica == 's' || replica == 'S') {
            out.println("De acuerdo, borrando archivo...");
            archivo.delete();
        } else {
            out.println("No se borro el archivo.");
        }
    }
}