package problema3;

public class MMS extends Mensaje {

    protected String nombreArchivoImagen;

    public MMS(String nombreArchivoImagen, String remitente, String destinatario) {
        super(remitente, destinatario);
        this.nombreArchivoImagen = nombreArchivoImagen;
    }

    public String getNombreArchivoImagen() {
        return nombreArchivoImagen;
    }

    public void setNombreArchivoImagen(String nombreArchivoImagen) {
        this.nombreArchivoImagen = nombreArchivoImagen;
    }

    public void enviarMMS() {
        System.out.println("Mensaje enviado de " + remitente + " a " + destinatario + " con imagen: " + nombreArchivoImagen);
    }

    @Override
    public void enviarMensaje() {
        enviarMMS(); // Llamamos al método específico de MMS
    }

    @Override
    public void visualizarMensaje() {
        System.out.println("Mensaje de " + destinatario + ": " + nombreArchivoImagen);
    }
}
