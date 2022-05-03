public class ChemineeAdaptHerite extends Cheminee implements Appareil {

    public void eteindre(){
        this.changerIntensite(0);
    }

    public void allumer(){
        this.changerIntensite(this.getLumiere()+10);
    }
}
