package builder;

public class App {

	public static void main(String[] args){
		
        CarBuilder builder = new RedCarBuilder();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        
        System.out.println(carBuildDirector.construct());
   }

}
