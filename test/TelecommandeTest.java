import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {
    @Test
    public void ajoutTelecommandeVide(){
        Lampe l =new Lampe("Led");
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l);
        assertEquals(l.toString(),t.getAppareil(0).toString(),"n'est pas la bonne lampe");
    }

    @Test
    public void ajout1Element(){
        Lampe l =new Lampe("Led");
        Lampe l2 = new Lampe("chaud");
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

    }

    @Test
    public void activerLampe_position_1(){
        // On prepare les donnees
        Lampe l = new Lampe("L1");
        Lampe l2 = new Lampe("L2");
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

        // On execute la methode de test
        t.activerAppareil(1);

        // On verifie
        assertEquals(false,((Lampe)t.getAppareil(0)).isAllume(),"La lempe n°1 n'est pas allumer");
        assertEquals(true,((Lampe)t.getAppareil(1)).isAllume(),"La lempe n°1 n'est pas allumer");
    }
}
