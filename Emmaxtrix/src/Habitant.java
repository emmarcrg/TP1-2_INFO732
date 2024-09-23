import java.util.ArrayList;

public abstract class Habitant{
    public NNIG identifiant;
    public String nom;
    public String prenom;
    public Adresse ad;
    public boolean combattant;
    public String caracteristique;
    public int annee_naissance;
    public int poids;
    public ArrayList<Casque> listeCasque;

    public Habitant (){
        super();
        this.combattant=false;
        this.listeCasque=new ArrayList<Casque>();
    }
    public int getAnnee(){
        //définir l'année de naissance d'un habitant
        return 0;        
    }
    public abstract boolean choisirCombattre();
}