package abstractFactory;

public class MotifWidgetFactory extends WidgetFactory{
	public Botao criarBotao(){
		return new BotaoMotif();
	}
}
