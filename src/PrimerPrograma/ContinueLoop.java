package PrimerPrograma;

class ContinueLoop {
    public static void main(String args[]) {
        int index = 0;
        while (index <= 1000) {
            index += 5;
            if (index >= 800)
                continue;
            System.out.println("Index " + index);
        }
    }
}