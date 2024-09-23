public class NonCombattant extends Habitant{
    public NonCombattant (NNIG id, String nom, String prenom, Adresse adresse,int poids){
        super();
        this.identifiant = id;
        this.nom=nom;
        this.prenom=prenom;
        this.ad=adresse;
        this.poids=poids;
    }

    @Override
    public boolean choisirCombattre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'choisirCombattre'");
    }
}
