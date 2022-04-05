import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TelecommandeTest {
    @Test
    public void ajoutTelecommandeVide(){
        Lampe l =new Lampe("Led");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);
        assertEquals(l.toString(),t.toString(),"n'est pas la bonne lampe");
    }

    @Test
    public void ajout1Element(){
        Lampe l =new Lampe("Led");
        Lampe l2 = new Lampe("chaud")
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

    }
}
