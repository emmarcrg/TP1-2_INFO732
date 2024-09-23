public class Chef extends Habitant {
    public Convocation convoc;

    public Chef (NNIG id, String nom, String prenom, Adresse adresse,int poids){
        super();
        this.identifiant = id;
        this.nom=nom;
        this.prenom=prenom;
        this.ad=adresse;
        this.poids=poids;
    }

    @Override
    public boolean choisirCombattre() {
        return true;
    }
    
}
