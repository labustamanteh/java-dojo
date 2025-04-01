public class Distribuidora {
    public static void main(String[] args) {
        Producto producto1 = new Perecedero("manzana", 2.5, 3);
        Producto producto2 = new Perecedero("huevos", 5D, 2);
        Producto producto3 = new NoPerecedero("frijoles", 1.2, "despensa");
        Producto producto4 = new NoPerecedero("lentejas", 1D, "despensa");

        System.out.println(producto1.calcular(1));
        System.out.println(producto2.calcular(2));
        System.out.println(producto3.calcular(2));
        System.out.println(producto4.calcular(5));
        
        // clases y objetos
        /*Persona laura = new Persona();
        Persona lucas = new Persona("lucas", 23, "12456321");
        Persona carolina = new Persona("carolina", 24, "12456321", 60, 1.62);

        int imc = carolina.calcularIMC();
        boolean esMayor = carolina.esMayorDeEdad();
        System.out.println(carolina.printPersona());
        carolina.diagnosticarIMC(imc);

        if (esMayor){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }*/

        // excepciones
        /*Integer a = 0;
        Integer b = 300;

        try {
            Integer cociente = b / a;
        } catch (ArithmeticException e) {
            // System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }*/
    }
}