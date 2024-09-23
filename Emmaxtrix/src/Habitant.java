public abstract class Habitant{
    private NNIG identifiant;
    private String nom;
    private String prenom;
    private Adresse ad;
    private boolean combattant;
    private String caracteristique;
    private int annee_naissance;
    private int poids;
    private ArrayList<Casque> listeCasque;

    public abstract boolean choisirCombattre();
}