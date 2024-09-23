public class Conservateur extends Habitant {

    public Conservateur (NNIG id, String nom, String prenom, Adresse adresse,int poids){
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
        
    public void enregistrerCasque(Habitant hab, Casque c){
        // Méthode permettant de rajouter un casque à un habitant 
    }

    public void demanderInfos(){
        //permet de donner la liste des casque récupérer par un habitant 
    }
}
