package prototype;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneFactory animalMaker = new CloneFactory();
		Sheep sally = new Sheep();
		
		Sheep clonedSally = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally.hashCode());
        System.out.println(clonedSally.hashCode());	
        
	}

}
