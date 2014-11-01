package PrimerPrograma;

class If {
    public static void main(String[] args) {
        int puntuacion=6;
        if (puntuacion > 5) {
            System.out.println("Aprobado");
        } else if (puntuacion <= 5) {
            System.out.println("Desaprobado");
        } else {
            System.out.println("Bleh");
        }
        
        char grupo = 'C';
        
        switch (grupo) {
            case 'A':
                System.out.println("aleh");
                break;
            case 'B':
                System.out.println("Bleh");
                break;
            case 'C':
                System.out.println("cleh");
                break;
            default:
                System.out.println("Nada");
        }
        
        int num = 6;
        String msje;
        
        //Ternario
        //      Condicion ? valor True : valor False
        msje = (num > 5) ? "Bla bla" : "ble ble";
        System.out.println(msje);
    }
}