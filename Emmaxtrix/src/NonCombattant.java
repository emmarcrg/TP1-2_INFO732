import java.util.Scanner;

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
}
