import java.util.ArrayList;

public class Telecommande {
    ArrayList<Lampe> lampe;

    public Telecommande(){
        this.lampe = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l){
        throw new Error (" code non ecrit ");
    }

    public void activerLampe(int i){
        this.lampe.get(i).allumer();
    }

    public void desactiverLampe(int i){
        throw new Error (" code non ecrit ");
    }

    public void activerTout(){
        for (int i = 0 ; i < this.lampe.size; i++){
            this.lampe.get(i).allumer();
        }
    }

    public String toString(){
        throw new Error(" code non ecrit ");
    }

}
