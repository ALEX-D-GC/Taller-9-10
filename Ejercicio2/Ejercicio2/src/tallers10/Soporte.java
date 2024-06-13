package tallers10;
public class Soporte {
    private String id;
    private String tipoCinta;

    public Soporte(String id, String tipoCinta) {
        this.id = id;
        this.tipoCinta = tipoCinta;
    }

    public Soporte(String id) {
        this.id = id;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    public void setTipoCinta(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }
}