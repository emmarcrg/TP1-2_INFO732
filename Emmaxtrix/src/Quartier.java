import java.util.ArrayList;

public class Quartier {
    private String nom_quartier;
    private String drapeau;
    private ArrayList<Combattant> liste_combattant;
    
    public Quartier(String nom_quartier, String drapeau){
        this.nom_quartier = nom_quartier;
        this.drapeau = drapeau;
    }

    private void addCombattant(Combattant c){
        this.liste_combattant.add(c);
    }

}
