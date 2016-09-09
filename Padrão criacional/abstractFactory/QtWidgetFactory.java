package abstractFactory;

public class QtWidgetFactory extends WidgetFactory{
	public Botao criarBotao(){
		return new BotaoQt();
	}
}
