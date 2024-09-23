import java.sql.Date;

public class Convocation{
    private ArrayList<Combattant> liste_combattants;
    private Date date_combat;

    public Convocation(ArrayList<Combattant> combattants, Date date_combat){
        this.liste_combattants=combattants;
        this.date_combat=date_combat;
    }
    public void convoquer (){
        //Convoquer l'ensemble des combattants de la liste
    }
}