import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Map<String, String>> categorias = new HashMap<>();
        Map<Integer, Map<String, String>> participantes = new HashMap<>();
        Map<Integer, Map<String, Integer>> inscripciones = new HashMap<>();

        Map<String, String> chico = Map.of("nombre","Circuito chico", "descripcion","2 km por selva y arroyos");
        Map<String, String> medio = Map.of("nombre","Circuito medio", "descripcion","5 km por selva, arroyos y barro.");
        Map<String, String> avanzado = Map.of("nombre","Circuito avanzado", "descripcion","10 km por selva, arroyos, barro y escalada en piedra.");

        Map<String, String> laura = Map.of("dni", "1234567890", "nombre", "Laura", "apellido", "Bustamante",
                "edad", "24", "celular", "3029876578", "numEmergencia", "9876554323", "grupoSanguineo", "O+");
        Map<String, String> juan = Map.of("dni", "1014309954", "nombre", "Juan David", "apellido", "Montes",
                "edad", "25", "celular", "3138197634", "numEmergencia", "3108708696", "grupoSanguineo", "O+");
        Map<String, String> jose = Map.of("dni", "1234566790", "nombre", "Josefina", "apellido", "Beltran",
                "edad", "24", "celular", "3512345632", "numEmergencia", "3513456723", "grupoSanguineo", "AB-");
        Map<String, String> sara = Map.of("dni", "1227867890", "nombre", "Sara", "apellido", "Salas",
                "edad", "25", "celular", "3162386323", "numEmergencia", "3162346323", "grupoSanguineo", "O+");

        // añadir circuitos
        categorias.put(1, chico);
        categorias.put(2, medio);
        categorias.put(3, avanzado);

        System.out.println("-------");
        System.out.println("Categorías");
        printMap(categorias);

        // añadir participantes
        participantes.put(1, laura);
        participantes.put(2, juan);
        participantes.put(3, jose);
        participantes.put(4, sara);

        System.out.println("-------");
        System.out.println("Participantes");
        printMap(participantes);

        // crear inscripciones
        for(Map.Entry<Integer, Map<String, String>> item: participantes.entrySet()) {
            Integer id = item.getKey();
            Map<String, String> datos = item.getValue();

            int categoria = (int)(Math.random() * 3) + 1;
            int edad = Integer.parseInt(datos.get("edad"));

            calculateAmountPerRegistration(categoria, id, edad, inscripciones);
        }

        System.out.println("-------");
        System.out.println("Inscripciones");
        printMap(inscripciones);

        printAmountsPerCategory(inscripciones);
    }

    private static void calculateAmountPerRegistration(int categoria, Integer id, int edad, Map<Integer, Map<String, Integer>> inscripciones) {
        Map<String, Integer> inscripcion = new HashMap<>();
        inscripcion.put("categoria", categoria);
        inscripcion.put("participante", id);

        switch (categoria) {
            case 1:
                if(edad < 18) {
                    inscripcion.put("abono", 1300);
                } else {
                    inscripcion.put("abono", 1500);
                }
                break;
            case 2:
                if(edad < 18) {
                    inscripcion.put("abono", 2000);
                } else {
                    inscripcion.put("abono", 2300);
                }
                break;
            case 3:
                if(edad < 18) {
                    inscripcion = new HashMap<>();
                    System.out.println("Solo se permiten mayores de 18 años");
                } else {
                    inscripcion.put("abono", 2800);
                }
                break;
            default:
                System.out.println("No es una categoría válida");
        }

        if (!inscripcion.isEmpty()) {
            inscripciones.put(id, inscripcion);
        }
    }

    private static <T> void printMap(Map<Integer, Map<String, T>> map) {
        map.forEach((id, insideMap) -> {
            System.out.println();
            System.out.println("No.: " + id);
            insideMap.forEach((k, v) -> {
                System.out.println(k + ": " + v);
            });
        });
        System.out.println();
    }

    private static void printAmountsPerCategory(Map<Integer, Map<String, Integer>> inscripciones) {
        int abonoChico = 0, abonoMedio = 0, abonoAvanzado = 0;
        for (Map.Entry<Integer, Map<String, Integer>> item: inscripciones.entrySet()) {
            Integer id = item.getKey();
            Map<String, Integer> datos = item.getValue();

            if (datos.get("categoria") == 1) {
                abonoChico += datos.get("abono");
            } else if (datos.get("categoria") == 2) {
                abonoMedio += datos.get("abono");
            } else if (datos.get("categoria") == 3) {
                abonoAvanzado += datos.get("abono");
            } else {}
        }

        System.out.println("-------");
        System.out.println("Abonos Categoria 1: " + abonoChico);
        System.out.println("Abonos Categoria 2: " + abonoMedio);
        System.out.println("Abonos Categoria 3: " + abonoAvanzado);
        System.out.println("-------");
        System.out.println("Monto Total: " + (abonoChico + abonoMedio + abonoAvanzado));
    }
}