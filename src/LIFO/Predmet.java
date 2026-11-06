package LIFO;
import java.util.Scanner;

public class Predmet {
    Scanner sc = new Scanner(System.in);

    private String nazev;
    private String typ;
    private int hodnota;

    public Predmet(String nazev, String typ, int hodnota) {
        this.nazev = nazev;
        this.typ = typ;
        this.hodnota = hodnota;

    }

    public String toString() {
        return " | název:" +nazev+ " | typ:" +typ+ " | hodnota:" +hodnota+ " | ";
    }


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }
}
