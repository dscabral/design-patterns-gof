package factoryMethod;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FactoryPessoa factory = new FactoryPessoa();
         String nome = "Daniel";
         String sexo = "M";
         factory.getPessoa(nome, sexo);
	}

}
