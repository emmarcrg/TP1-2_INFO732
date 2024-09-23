import java.sql.Date;
import java.util.ArrayList;

public class Convocation {
    private ArrayList<Combattant> liste_combattants;
    private Combat comb;

    public Convocation(ArrayList<Combattant> combattants, Combat combat){
        this.liste_combattants=combattants;
        this.comb=combat;
    }

    public void convoquer (){
        //Convoquer l'ensemble des combattants de la liste
        for (Combattant combattant : liste_combattants) {
            combattant.partirCombattre(this.comb);
        }
    }
}