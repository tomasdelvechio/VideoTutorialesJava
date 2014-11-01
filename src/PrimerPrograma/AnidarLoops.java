package PrimerPrograma;

class AnidarLoops {
    public static void main(String args[]) {
        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) {
            for (int i=0; i < target; i++) {
                if (points > 50) {
                    System.out.println("points = " + points);
                    System.out.println("Saliendo de ambos loops");
                    break targetLoop;
                }
                points += i;
            }
        }
    }
}