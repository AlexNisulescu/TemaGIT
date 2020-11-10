package MagazinVirtual;

import java.util.ArrayList;

public class Administrator {

    private ArrayList <Magazin> magazine;
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
        this.magazine.add(M);
    }

    public Magazin getMagazin(int x){
        return this.magazine.get(x);
    }

    public int getData(int x)
    {
        return magazine.get(x).getSold();
    }

}
