import java.util.Scanner;

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
        String reponse;
        Scanner scanner = new Scanner(System.in);
        
        // Poser une question
        System.out.println("Voulez-vous combattre (Y/N) ?");
        
        // Lire la réponse de l'utilisateur
        reponse = scanner.nextLine();

        scanner.close();
        
        if (reponse=="Y"){
            return true;
        }else {
            return false;
        }
        
        
    }
        
    public void enregistrerCasque(Habitant hab, Casque c){
        // Méthode permettant de rajouter un casque à un habitant 
        hab.listeCasque.add(c);
    }

    public String demanderInfos(Habitant hab){
        //permet de donner la liste des casque récupérer par un habitant 
        String res = "Liste des casques que " + hab.nom + hab.prenom + " a récupéré : ";
        for (Casque casque : hab.listeCasque){
            res += casque.toString();
        }

        return res;
    }
}
