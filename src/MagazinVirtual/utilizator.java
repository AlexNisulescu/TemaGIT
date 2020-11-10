package MagazinVirtual;

import java.util.ArrayList;

/**
 * Aceasta este clasa pentru utilizator
 * @author Alex Nisulescu
 */

public class utilizator {
    private String NumeUtilizator;
    private int anNastere;
    private ArrayList<produse> produse;
    int bani;

    public utilizator(String nume, int an){

        this.NumeUtilizator=nume;
        this.anNastere=an;
        this.bani=0;
    }

    /**
     *
     * @return Numele Utilizatorului
     */
    public String getNumeUtilizator() {
        return NumeUtilizator;
    }

    /**
     *
     * @return arraylist produse
     */
    public ArrayList<produse> getProduse() {
        return produse;
    }

    public void setAnNastere(int anNastere) {
        this.anNastere = anNastere;
    }

    public addProdus(produse p){
        this.produse.add(p);
    }

    public void AdaugareBani(int bani) {
        this.bani += bani;
    }
}
