import java.util.Date;

public class PrisePotion {
    private int dose_reelle;
    private Date date_prise;
    private Potion potion;
    private Habitant hab;

    public PrisePotion(int dr, Date dp, Potion p, Habitant h){
        dose_reelle=dr;
        date_prise=dp;
        potion=p;
        hab=h;
    }

}
