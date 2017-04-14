import java.rmi.*;

//Implementing the Remote Interface in this case GymAndNutrition class
public class GymAndNutritionImpl extends UnicastRemoteObject implements GymAndNutrition {
  //Server Code
	public GymAndNutritionImpl() throws RemoteException {
	}
	public String returnURL(){
		return "Visit my website here, URL: http://gymandnutrition.com";
	}

	public static void main(String args[]){
		try {
			GymAndNutritionImpl gnObject = new GymAndNutritionImpl(); //gn stands for GymAndNutrition
			// Binding this object instance to the name "GymAndNutritionServer"
			Naming.rebind("GymAndNutritionServer", gnObject);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
