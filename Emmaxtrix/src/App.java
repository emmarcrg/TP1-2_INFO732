import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("INFO732 - TP Villageois");

        Quartier q1= new Quartier("Bonlieu", "livre");
        Quartier q2 = new Quartier("Gare", "train");

        Adresse a1 = new Adresse(q1, "rue roman", "24");
        Adresse a2 = new Adresse(q2, "rue de la gare", "12");

        NNIG id_chef = new NNIG("M", 02, 07, 06, "NIC", 001);
        Chef chef = new Chef(id_chef, "Chefix", "abrabix", a1, 78);

        NNIG id_c1 = new NNIG("M", 06, 03, 74, "ANN", 002);
        Combattant c1 = new Combattant(id_c1, "Combatix", "blablatix", a2, 45, "tir à l'arc");

        ArrayList<Combattant> liste_combattant= new ArrayList<>();
        liste_combattant.add(c1);

        Combat cbt = new Combat("guerre de ouf", "entrée de la gare", new Date(), new Date() );
        chef.convoc= new Convocation(liste_combattant, cbt);




    }
}
