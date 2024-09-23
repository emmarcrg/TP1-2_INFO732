public class AncienCombattant extends Habitant{

    public AncienCombattant (NNIG id, String nom, String prenom, Adresse adresse,int poids){
        if(this.combattant){
            this.identifiant = id;
            this.nom=nom;
            this.prenom=prenom;
            this.ad=adresse;
            this.poids=poids;
        }
    }
    @Override
    public boolean choisirCombattre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'choisirCombattre'");
    }
    
}