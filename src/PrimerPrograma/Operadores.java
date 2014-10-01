package PrimerPrograma;

class Operadores {
    public static void main(String[] args) {
        float altura = 123;
        altura = altura / 10; // + - * / % (modulo)
        System.out.println(altura
        );
        
        // Uso de operador ++ como prefijo y como sufijo
        
        int x = 3;
        int valor = x++ * 10;
        System.out.println(valor);
        
        x = 3;
        valor = ++x * 10;
        System.out.println(valor);
    }
}