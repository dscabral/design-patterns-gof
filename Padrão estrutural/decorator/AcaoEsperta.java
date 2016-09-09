package decorator;
/**
 * AcaoEsperta é um decorator para o objeto {@link Acao}. Uma chamada para a interface{@link Acao}
 * é interceptada e decorada. Finalmente a chamada é delegada ao objeto {@link Acao}
 */
public class AcaoEsperta implements Acao{
	
	private Acao decorado;
	
	public AcaoEsperta(Acao decorado) {
		this.decorado = decorado;
	}
	
	@Override
	public void ataque() {
		System.out.println("Joga uma rocha em você!");
	    decorado.ataque();
	}

	@Override
	public int getPoderAtaque() {
		// decorated hostile's power + 20 because it is smart
	    return decorado.getPoderAtaque() + 20;
	}

	@Override
	public void fugirBatalha() {
		System.out.println("Chama ajuda!");
	    decorado.fugirBatalha();
	}

}
