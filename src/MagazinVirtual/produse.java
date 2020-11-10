package MagazinVirtual;

public class produse {
    private String numeProdus;
    private  String Producator;
    private int Pret;

    public produse(String numeProdus ,String producator, int pret) {
        this.numeProdus = numeProdus;
        this.Producator=producator;
        this.Pret=pret;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public String getProducator() {
        return Producator;
    }

    public void setProducator(String producator) {
        Producator = producator;
    }

    public int getPret() {
        return Pret;
    }

    public void setPret(int pret) {
        Pret = pret;
    }
}
