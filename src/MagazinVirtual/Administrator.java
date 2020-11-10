package MagazinVirtual;

import java.util.ArrayList;

public class Administrator {

    private ArrayList <Magazin> Magazine;
    private String NumeAdmin;

    public Administrator(String nume){
        NumeAdmin=nume;
    }

    public void setNumeAdmin(String numeAdmin) {
        NumeAdmin = numeAdmin;
    }

    public String getNumeAdmin() {
        return NumeAdmin;
    }

    public void addMagazin(Magazin M){
        this.Magazine.add(M);
    }

    public Magazin getMagazin(int x){
        return this.Magazine.get(x);
    }

    public int getData(int x)
    {
        return Magazine.get(x).getSold();
    }

}
