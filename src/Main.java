
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		Lampe l2=new Lampe("Lampe2");
		t.ajouterAppareil(l2);
		Lampe l3=new Lampe("Lampe3");
		t.ajouterAppareil(l3);
		Lampe l4=new Lampe("Lampe4");
		t.ajouterAppareil(l4);
		Lampe l5=new Lampe("Lampe5");
		t.ajouterAppareil(l5);
		Lampe l6=new Lampe("Lampe6");
		t.ajouterAppareil(l6);
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
