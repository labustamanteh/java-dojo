public class Main {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int minTemp = temperaturas[0][0];
        int maxTemp = temperaturas[0][1];
        String ciudadMinTemp = ciudades[0];
        String ciudadMaxTemp = ciudades[0];

        for (int i = 0; i < ciudades.length -1; i++) {
            if (temperaturas[i+1][0] < minTemp) {
                minTemp = temperaturas[i+1][0];
                ciudadMinTemp = ciudades[i+1];
            }

            if (temperaturas[i+1][1] > maxTemp) {
                maxTemp = temperaturas[i+1][1];
                ciudadMaxTemp = ciudades[i+1];
            }
        }

        System.out.println("La menor temperatura la tuvo "+ciudadMinTemp+", con "+minTemp+"°C");
        System.out.println("La mayor temperatura la tuvo "+ciudadMaxTemp+", con "+maxTemp+"°C");
    }
}