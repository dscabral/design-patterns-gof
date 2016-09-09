package decorator;

public class App {
	
	public static void main(String[] args){
		// simple troll
	    System.out.println("A simple looking troll approaches.");
	    Acao troll = new Troll();
	    troll.ataque();
	    troll.fugirBatalha();
	    System.out.printf("Poder de um Troll Simples %d pontos.\n", troll.getPoderAtaque());

	    // change the behavior of the simple troll by adding a decorator
	    System.out.println("\nA smart looking troll surprises you.");
	    Acao smart = new AcaoEsperta(troll);
	    smart.ataque();
	    smart.fugirBatalha();
	    System.out.printf("Poder de um Troll esperto (decorado) %d pontos.\n", smart.getPoderAtaque());
	}

}
