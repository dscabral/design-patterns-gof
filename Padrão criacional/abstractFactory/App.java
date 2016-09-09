package abstractFactory;
import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
	    int minuto = calendar.get(Calendar.SECOND);
//	    int minuto = Instant.now().get(ChronoField.MINUTE_OF_HOUR);
	    WidgetFactory factory;
	    if (minuto % 2 == 0){
	    	factory = WidgetFactory.obterFactory(Configuracao.QtWidget);
	    }else{
	    	factory = WidgetFactory.obterFactory(Configuracao.MotifWiget);
	    }
		Botao botao = factory.criarBotao();
		botao.desenhar();

	}

}
