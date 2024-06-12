package problema3;

public class SMS extends Mensaje {

    protected String texto;

    public SMS(String texto, String remitente, String destinatario) {
        super(remitente, destinatario);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void enviarSMS() {
        System.out.println("Mensaje enviado de " + remitente + " a " + destinatario + ": " + texto);
    }

    @Override
    public void enviarMensaje() {
        enviarSMS(); // Llamamos al método específico de SMS
    }

    @Override
    public void visualizarMensaje() {
        System.out.println("Mensaje de " + destinatario + ": " + texto);
    }
}
