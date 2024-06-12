package problema3;

public class EjecutorMensaje {

    public static void main(String[] args) {

        // Creamos un SMS
        SMS sms = new SMS("Hola Como estas", "123456789", "987654321");

        // Enviar y visualizar el SMS
        System.out.println("Para el SMS:");
        System.out.println("El remitente \"" + sms.getRemitente() + "\" envia el mensaje al destinatario \"" + sms.getDestinatario() + "\" que dice \"" + sms.getTexto() + "\".");
        System.out.println("El destinatario \"" + sms.getDestinatario() + "\" recibe el mensaje: \"" + sms.getTexto() + "\".");

        System.out.println();

        // Creamos un MMS
        MMS mms = new MMS("imagen.jpg", "987654321", "123456789");

        // Enviar y visualizar el MMS
        System.out.println("Para el MMS:");
        System.out.println("El remitente \"" + mms.getRemitente() + "\" envia la imagen al destinatario \"" + mms.getDestinatario() + "\".");
        System.out.println("El destinatario \"" + mms.getDestinatario() + "\" recibe el mensaje: \"" + mms.getNombreArchivoImagen() + "\".");
    }
}