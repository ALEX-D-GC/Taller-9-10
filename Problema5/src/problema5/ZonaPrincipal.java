package problema5;

public class ZonaPrincipal extends Zona {
    public ZonaPrincipal() {
        super("Principal", 200, 25.0, 17.5);
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
