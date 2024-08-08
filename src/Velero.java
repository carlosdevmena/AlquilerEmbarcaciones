public class Velero extends BaseEmbarcacion{
    private int mastiles;

    public Velero(Capitan capitan, double precioBaseAlquiler, double valorRecargo, int añoFabricacion, float eslora, int mastiles) {
        super(capitan, precioBaseAlquiler, valorRecargo, añoFabricacion, eslora);
        this.mastiles = mastiles;
    }

    @Override
    public double calcularMonto() {
        double monto = super.calcularMonto();
        if (esGrande()) {
            monto += this.getPrecioBaseAlquiler() * 0.10;
        }
        return monto;
    }

    public boolean esGrande() {
        return mastiles > 4;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "capitan=" + getCapitan().getNombre() + " " + getCapitan().getApellido() +
                ", precioBaseAlquiler=" + getPrecioBaseAlquiler() +
                ", valorRecargo=" + getValorRecargo() +
                ", añoFabricacion=" + getAñoFabricacion() +
                ", eslora=" + getEslora() + " metros" +
                ", mastiles=" + mastiles +
                '}';
    }
}

