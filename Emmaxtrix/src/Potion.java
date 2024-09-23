public class Potion {
    private String nom;
    private String effet;
    private int intervalle_prise;
    private int dose_age;

    public Potion(String n, String e, int ip, int da){
        this.nom=n;
        this.effet=e;
        this.intervalle_prise=ip;
        this.dose_age=da;
    }

    public int getIntervalle(){
        return this.intervalle_prise;
    }

    public String getEffet(){
        return this.effet;
    }

}
