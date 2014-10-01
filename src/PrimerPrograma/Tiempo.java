class Tiempo {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " grados Fahrenheit son...");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " grados Celsius\n");
        float cel = 33;
        System.out.println(cel + " grados Celsius son...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " grados Fahrenheit\n");
    }
}