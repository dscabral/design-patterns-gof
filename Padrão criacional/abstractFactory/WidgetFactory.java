package abstractFactory;

public abstract class WidgetFactory {
     public static WidgetFactory obterFactory(Configuracao config)
     {
          if(config.equals(Configuracao.MotifWiget))
          {
               return new MotifWidgetFactory();
          }
          else
          {
               return new QtWidgetFactory();
          }
     }

     public abstract Botao criarBotao();	
}
