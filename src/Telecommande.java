import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareil> appareil;

    public Telecommande(){
        this.appareil = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Lampe l){
        this.appareil.add(l);
    }

    public void activerAppareil(int i){
        this.appareil.get(i).allumer();
    }

    public void desactiverAppareil(int i){
        this.appareil.get(i).eteindre();
    }

    public void activerTout(){
        for (int i = 0 ; i < this.appareil.size(); i++){
            this.appareil.get(i).allumer();
        }
    }

    public String toString(){
        String ch = "";
        for (int i = 0; i < this.appareil.size();i++){
            ch += this.appareil.get(i).toString()+"\n";
        }
        return ch;
    }

}
