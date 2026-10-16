public class Uchazec {

    private String pozice;
    private String jmeno;
    private String vzdelani;
    private int vek;

    public Uchazec(String pozice, String jmeno, String vzdelani, int vek) {
        this.pozice = pozice;
        this.jmeno = jmeno;
        this.vzdelani = vzdelani;
        this.vek = vek;
    }

    public String toString() {
        return "Jméno: " +jmeno+ ", vzdělání: " +vzdelani+ ", vek: " +vek+ " | ucházená poice: " +pozice;
    }


    public String getPozice() {
        return pozice;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getVzdelani() {
        return vzdelani;
    }

    public void setVzdelani(String vzdelani) {
        this.vzdelani = vzdelani;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }
}
