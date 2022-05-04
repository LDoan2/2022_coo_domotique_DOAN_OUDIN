public class ChemineeAdaptAssoc implements Appareil{

    private Cheminee cheminee;

    public ChemineeAdaptAssoc(Cheminee c){
        this.cheminee = c;
    }

    @Override
    public void allumer() {
        this.cheminee.changerIntensite(100);
    }

    @Override
    public void eteindre() {
        this.cheminee.changerIntensite(0);
    }
}
