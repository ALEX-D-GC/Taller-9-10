package problema5;

public class ZonaLateral extends Zona {
    public ZonaLateral() {
        super("Lateral", 100, 15.5, 10.0);
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