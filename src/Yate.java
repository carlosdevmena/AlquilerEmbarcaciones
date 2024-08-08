public class Yate extends BaseEmbarcacion{
    private int camarotes;
    private int vecesAlquilado;
    private double precioCompra;

    public Yate(Capitan capitan, double precioBaseAlquiler, double valorRecargo, int añoFabricacion, float eslora, int camarotes, double precioCompra) {
        super(capitan, precioBaseAlquiler, valorRecargo, añoFabricacion, eslora);
        this.camarotes = camarotes;
        this.precioCompra = precioCompra;
        vecesAlquilado = 0;
    }

    @Override
    public void asignarUsuario(Usuario usuario) {
        super.asignarUsuario(usuario);
        registrarAlquiler();
    }

    // Metodo para registrara las veces que ha sido alquilado un Yate
    public void registrarAlquiler() {
        vecesAlquilado++;
    }

    // Metodo para comprar un Yate que calcula el precio del mismo segun las condiciones.
    public double comprar() {
        double precioFinal = precioCompra;
        if (vecesAlquilado > 20 && vecesAlquilado < 50) {
            precioFinal *= 0.90;
        } else if (vecesAlquilado >= 50) {
            if (camarotes > 8 && vecesAlquilado > 80) {
                precioFinal *= 0.95;
            } else if (camarotes > 5) {
                precioFinal *= 0.90;
            } else {
                precioFinal *= 0.80;
            }
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "capitan=" + getCapitan().getNombre() + " " + getCapitan().getApellido() +
                ", precioBaseAlquiler=" + getPrecioBaseAlquiler() +
                ", valorRecargo=" + getValorRecargo() +
                ", añoFabricacion=" + getAñoFabricacion() +
                ", eslora=" + getEslora() + " metros" +
                ", camarotes=" + camarotes +
                '}';
    }


}
