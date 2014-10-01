class Equals {
    public static void main(String[] args) {
        String respuesta = "Amarillo";
        String resultado = "Amarillo";
        
        System.out.println("La rta es " + respuesta);
        System.out.println("Es correcta? " + respuesta.equals(resultado));
        
        int tam = respuesta.length();
        System.out.println(tam);
        
        System.out.println(respuesta.toUpperCase());
        System.out.println(respuesta.toLowerCase());
    }
}