package MagazinVirtual;

import java.util.ArrayList;

/**
 * Aceasta este clasa pentru utilizator
 * @author Alex Nisulescu
 */

public class utilizator {
    private String NumeUtilizator;
    private int anNastere;
    private ArrayList<produse> prod;
    int bani;

    public utilizator(String nume, int an){

        this.NumeUtilizator=nume;
        this.anNastere=an;
        this.bani=0;
    }

    public cumparareProdus(prod p)
    {
        if (this.bani>=p.getPret())
        {
            this.bani-=p.getPret();
            this.prod.add(p);
        }
        else{
            System.out.println("Utilizatorul nu are suficienti bani");
        }
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
    public ArrayList<prod> getProduse() {
        return prod;
    }

    public void setAnNastere(int anNastere) {
        this.anNastere = anNastere;
    }

    public addProdus(prod p){
        this.prod.add(p);
    }

    public void AdaugareBani(int bani) {
        this.bani += bani;
    }
}
