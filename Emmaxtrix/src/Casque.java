public class Casque {
    private String forme;
    private String ennemi;
    private String etat;
    private boolean musee;
    private Habitant hab;
    private Combat combat;

    public Casque(String f, String en, String et, boolean m, Habitant h, Combat c){
        this.forme = f;
        this.ennemi = en;
        this.etat = et;
        this.musee=m;
        this.hab=h;
        this.combat=c;
    }

    public String toString() {
        return "Le casque de " + this.ennemi + " a été récupéré à " + this.combat.toString();
    }

}
