package builder;

public class CarBuildDirector {
	
     private CarBuilder builder;
     
     public CarBuildDirector(CarBuilder builder){
	      this.builder = builder;
     }
     
     public Car construct(){
    	 builder.buildView();
    	 return builder.getResult();
     }
}
