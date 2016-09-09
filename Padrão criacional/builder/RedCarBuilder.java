package builder;

public class RedCarBuilder implements CarBuilder{

	private Car car;
	
	public RedCarBuilder(){
		car = new Car();
	}
	
	@Override
	public void buildView() {
		// TODO Auto-generated method stub
		car.setColor("Red");
		car.setWheels(4);
	}

	@Override
	public Car getResult() {
		// TODO Auto-generated method stub
		return car;
	}

}
