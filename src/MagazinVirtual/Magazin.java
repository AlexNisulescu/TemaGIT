package MagazinVirtual;
import java.util.ArrayList;
public class Magazin {

    private String NumeMagazin;
    private int sold;
    private ArrayList <produse> Produse;

    public Magazin(String nume){
        NumeMagazin=nume;
    }

    public String getMagazin(){
        return NumeMagazin;
    }

    public void setMagazin(String Nume){
        this.NumeMagazin=Nume;
    }

    public String getProdus(produse Prod){
        return Prod.nume+" "+Prod.producator;
    }
    public void add_Produs(produse Prod){
        this.Produse.add((Prod));
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
