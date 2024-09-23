import java.util.ArrayList;
import java.util.Date;

public abstract class Habitant{
    public NNIG identifiant;
    public String nom;
    public String prenom;
    public Adresse ad;
    public boolean combattant;
    public String caracteristique;
    public int poids;
    public Date derniere_prise;
    public ArrayList<Casque> listeCasque;

    public abstract boolean choisirCombattre();

    public int getAnneeNaissance(){
        return identifiant.getAnneeNaissance();
    }

    public void setCaracteristiques(String nouveau_car){
        this.caracteristique=nouveau_car;
    }
}