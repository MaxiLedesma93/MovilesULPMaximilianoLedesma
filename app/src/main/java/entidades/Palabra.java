package entidades;

public class Palabra {
    private String palabraEsp;
    private String palabraIng;
    private int imagen;

    public Palabra(String palabraEsp, String palabraIng, int imagen) {
        this.palabraEsp = palabraEsp;
        this.palabraIng = palabraIng;
        this.imagen = imagen;
    }

    public String getPalabraEsp() {
        return palabraEsp;
    }

    public void setPalabraEsp(String palabraEsp) {
        this.palabraEsp = palabraEsp;
    }

    public String getPalabraIng() {
        return palabraIng;
    }

    public void setPalabraIng(String palabraIng) {
        this.palabraIng = palabraIng;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
