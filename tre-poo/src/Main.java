public class Main {
    public static void main(String[] args) {
        // clases y objetos
        Persona laura = new Persona();
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
        }

        // excepciones
        Integer a = 0;
        Integer b = 300;

        try {
            Integer cociente = b / a;
        } catch (ArithmeticException e) {
            // System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por cero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}