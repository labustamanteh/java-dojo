public class Persona {
    String nombre;
    int edad;
    String dni;
    int peso;
    double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <=25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public String printPersona(){
        return "Nombre: "+ nombre + ", Edad: " + edad + ", DNI: " + dni +
                ", Peso: " + peso + ", Altura: " + altura;
    }
}
