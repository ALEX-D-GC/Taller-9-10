package problema3;

public class Mensaje {

    //Creamos los atributos 
    protected String remitente;
    protected String destinatario;

    //Creamos el constructor 
    public Mensaje(String remitente, String destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }
    //Creamos los getter y setter

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    //Creamos un metodo para enciar un mensaje 
    public void enviarMensaje() {

        System.out.println(" Mensaje enviado de " + remitente + " a " + destinatario);
    }

    //Creamos otro metodo para visualizar el mensaje 
    public void visualizarMensaje() {

        System.out.println("Mensaje de " + remitente + ": Hola Como estas");
    }

}
