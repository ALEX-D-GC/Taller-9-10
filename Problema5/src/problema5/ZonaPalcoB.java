package problema5;

public class ZonaPalcoB extends Zona {
    public ZonaPalcoB() {
        super("PalcoB", 40, 70.0, 40.0);
    }

    @Override
    public double calcularPrecio(String tipoEntrada) {
        switch (tipoEntrada.toLowerCase()) {
            case "normal":
                return precioNormal;
            case "abonado":
                return precioAbonado;
            case "reducido":
                return precioNormal * 0.85;
            default:
                throw new IllegalArgumentException("Tipo de entrada desconocido");
        }
    }
}
