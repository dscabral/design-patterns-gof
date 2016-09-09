package prototype;

public class Sheep implements Animal{

     public Sheep(){
          System.out.println("sheep is made");
	 }
     
     @Override
     public Animal clone(){

    	 Sheep sheepObject = null;
 		
 		try {
 			sheepObject = (Sheep) super.clone();
 		} catch (CloneNotSupportedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
        return sheepObject;
     }
     
     @Override
     public String toString(){
    	 return "Dolly is my hero...";
     }
}
