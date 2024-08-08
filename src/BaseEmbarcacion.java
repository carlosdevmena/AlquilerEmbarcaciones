public abstract class BaseEmbarcacion implements Embarcacion {
    private Capitan capitan;
    private double precioBaseAlquiler;
    private double valorRecargo;
    private int añoFabricacion;
    private float eslora;
    private Usuario usuario;

    public BaseEmbarcacion(Capitan capitan, double precioBaseAlquiler, double valorRecargo, int añoFabricacion, float eslora) {
        this.capitan = capitan;
        this.precioBaseAlquiler = precioBaseAlquiler;
        this.valorRecargo = valorRecargo;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
        usuario = null;
    }

    @Override
    public double calcularMonto(){
        if (añoFabricacion > 2020) {
            return precioBaseAlquiler + 20_000;
        }
        return precioBaseAlquiler;
    }

    @Override
    public void asignarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void liberarUsuario(){
        this.usuario = null;
    }

    public double getPrecioBaseAlquiler() {
        return precioBaseAlquiler;
    }

    public void setValorRecargo(double valorRecargo) {
        this.valorRecargo = valorRecargo;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getValorRecargo() {
        return valorRecargo;
    }

    public float getEslora() {
        return eslora;
    }
}
