import java.util.Date;

public class PrisePotion {
    private int dose_reelle;
    private Date date_prise;
    private Potion potion;
    private Habitant hab;

    public PrisePotion(int dr, Date dp, Potion p, Habitant h){
        dose_reelle=dr;
        date_prise=dp;
        potion=p;
        hab=h;
    }

    public void lancerEffet(){
        // lorsqu'une potion est prise, l'effet s'applique sur l'habitant.
        // l'effet va dépendre de l'intervalle entre la prise de la potion et la dernière qui avait été avalée
        if (hab.derniere_prise.getTime()+potion.getIntervalle()>date_prise.getTime()){
            hab.derniere_prise=date_prise;
            System.out.println("Les temps entre deux prises n'ont pas été respecté, les effets risquent d'être aléatoire");
            hab.setCaracteristiques("hasard"); // effet au hasard
        }

        else{
            hab.derniere_prise=date_prise;
            hab.setCaracteristiques(potion.getEffet());
            System.out.println("Temps entre les prises respecté, effet de la potion sur l'habitant");
        }
    }

}
