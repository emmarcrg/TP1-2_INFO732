public class Combattant extends Habitant {

    private String specialite;
    private Combat comb;

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
        if(this.comb!=null){
            System.out.println(this.comb.toString());
        }else{
            System.out.println("Pas de combat en cours");
        }
    }

    public void setSpecialite(String spe){
        this.specialite=spe;
    }

    public void partirCombattre(Combat comb){
        // dans le cas où il est convoqué
        System.out.println("Le combattant " + this.nom + "est parti au combat");
        this.comb=comb;

    }


}
