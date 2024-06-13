package problema5;

public class ZonaCentral extends Zona {
    public ZonaCentral() {
        super("Central", 400, 20.0, 14.0);
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