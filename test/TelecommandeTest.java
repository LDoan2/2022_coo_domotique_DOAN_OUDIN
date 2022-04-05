import org.junit.jupiter.api.Test;
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

    @Test
    public void activerLampe_position_1(){
        // On prepare les donnees
        Lampe l = new Lampe("L1");
        Lampe l2 = new Lampe("L2");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        // On execute la methode de test
        t.activerLampe(1);

        // On verifie
        //assertEquals();



    }
}
