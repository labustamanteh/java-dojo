public class Main {
    public static void main(String[] args) {
        Persona laura = new Persona();
        Persona lucas = new Persona("lucas", 23, "12456321");
        Persona carolina = new Persona("carolina", 24, "12456321", 60, 1.62);

        int imc = carolina.calcularIMC();
        boolean esMayor = carolina.esMayorDeEdad();
        System.out.println(carolina.printPersona());

        switch (imc){
            case -1:
                System.out.println("Con bajo de peso");
                break;
            case 0:
                System.out.println("Con peso saludable");
                break;
            case 1:
                System.out.println("Con sobrepeso");
                break;
            default:
                break;
        }

        if (esMayor){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}