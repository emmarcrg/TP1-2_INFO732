import java.util.Date;

public class Combat {
    private String nom;
    private String lieu;
    private Date date_debut;
    private Date date_fin;

    public Combat(String n, String l, Date dd, Date df){
        this.nom = n;
        this.lieu=l;
        this.date_debut=dd;
        this.date_fin=df;
    }

}
