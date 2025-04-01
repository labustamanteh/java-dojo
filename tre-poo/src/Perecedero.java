public class Perecedero extends Producto{
    private Integer diasPorCaducar;

    public Perecedero(String nombre, Double precio, Integer diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public Integer getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(Integer diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    public String toString() {
        return super.toString() + "DiasPorCaducar: " + diasPorCaducar;
    }

    @Override
    public Double calcular(Integer cantidadDeProductos) {
        Double precio = super.calcular(cantidadDeProductos);

        switch (diasPorCaducar) {
            case 1:
                precio -= precio * 0.4;
                break;
            case 2:
                precio -= precio  * 0.3;
                break;
            case 3:
                precio -= precio * 0.5;
        }
        return precio;
    }
}
