import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TelecommandeTest {
    @Test
    public void constructeurVide(){
        Lampe l =new Lampe("Led");
        Telecommande t = new Telecommande();
        t.ajouterLampe();
    }
}
