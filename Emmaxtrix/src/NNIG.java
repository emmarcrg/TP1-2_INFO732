public class NNIG {
    private String sexe;
    private int annee_naissance;
    private int mois_naissance;
    private int region;
    private String village;
    private int ordre_inscription;

    public void NNING(String s, int an, int mn, int r, String v, int oi){

        if (s!="F" || s!="M"){
            System.out.println("Veuillez choisir un seul charactère entre F et M pour définir le sexe du villageois.");
        }
        else {this.sexe = s;}
        
        if (String.valueOf(an).length()!=2){
            System.out.println("Veuillez indiquer seulement les deux derniers chiffres de l'année de naissance.");
        }
        else {this.annee_naissance = an;}
        
        if (String.valueOf(mn).length()!=2){
            System.out.println("Veuillez indiquer deux chiffres pour désigner le mois de naissance (exemple 01 pour Janvier).");
        }
        else if (mn>12){
            System.out.println("Le mois que vous avez sélectionné n'est pas valide.");
        }
        else{this.mois_naissance = mn;}
        
        if (String.valueOf(r).length()!=2){
            System.out.println("Veuillez indiquer seulement deux chiffres pour représenter la région. (exemple 74)");
        }
        else{this.region = r;}
        
        if (v.length() !=3){
            System.out.println("Veuillez indiquer un code de trois charactères pour représenter le village");
        }
        else{this.village = v;}

        if (String.valueOf(oi).length()!=3){
            System.out.println("Veuillez indiquer un code de trois charactères pour représenter l'ordre de naissance");
        }
        else{this.ordre_inscription = oi;}        
    }

    public int getAnneeNaissance(){
        return this.annee_naissance;
    }


}
