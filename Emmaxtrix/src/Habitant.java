import java.util.ArrayList;

public abstract class Habitant{
    public NNIG identifiant;
    public String nom;
    public String prenom;
    public Adresse ad;
    public boolean combattant;
    public String caracteristique;
    public int poids;
    public ArrayList<Casque> listeCasque;

    public Habitant (){
        super();
        this.combattant=false;
        this.listeCasque=new ArrayList<Casque>();
    }
   
    public abstract boolean choisirCombattre();

    public int getAnneeNaissance(){
        return identifiant.getAnneeNaissance();
    }
}