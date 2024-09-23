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

    public abstract boolean choisirCombattre();
}