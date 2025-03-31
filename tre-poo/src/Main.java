public class Main {
    public static void main(String[] args) {
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
    }
}