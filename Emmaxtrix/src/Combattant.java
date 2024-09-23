public class Combattant extends Habitant {

    private String specialite;

    public Combattant (NNIG id, String nom, String prenom, Adresse adresse,int poids, String s){
        super();
        this.identifiant = id;
        this.nom=nom;
        this.prenom=prenom;
        this.ad=adresse;
        this.poids=poids;
        this.specialite=s;
    }

    public boolean choisirCombattre() {
        // dans le cas où il n'est pas convoqué
        return true;
    }

    public void recevoirInfosCombat(){

    }

    public void setSpecialite(String spe){
        this.specialite=spe;
    }

    public void partirCombattre(){
        // dans le cas où il est convoqué
        

    }

    

}
