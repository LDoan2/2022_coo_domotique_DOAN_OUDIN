import java.util.ArrayList;

public class Telecommande {
    ArrayList<Lampe> lampe;

    public Telecommande(){
        this.lampe = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l){
        this.lampe.add(l);
    }

    public void activerLampe(int i){
        throw new Error (" code non ecrit ");
    }

    public void desactiverLampe(int i){
        this.lampe.get(i).eteindre();
    }

    public void activerTout(){
        throw new Error(" code non ecrit ");
    }

    public String toString(){
        String ch = "";
        for (int i = 0; i < this.lampe.size();i++){
            ch += this.lampe.get(i).toString()+"\n";
        }
        return ch;
    }

}
