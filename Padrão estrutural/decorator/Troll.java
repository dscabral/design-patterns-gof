package decorator;

public class Troll implements Acao{

	@Override
	public void ataque() {
		System.out.println("O Troll te ataca com um porrete!");
	}

	@Override
	public int getPoderAtaque() {
		return 10;
	}

	@Override
	public void fugirBatalha() {
		System.out.println("O Troll grita de medo e foge!");		
	}

}
