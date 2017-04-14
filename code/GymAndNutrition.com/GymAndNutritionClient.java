import java.rmi.*;

public class GymAndNutritionClient {
	//Client Code
	public static void main(String args[]) {
		String hostname = "localhost";
		if (args.length>0){
			hostname = args[0];
		}
		try {
			System.setProperty("java.rmi.server.hostname", hostname);
			/*The server is specified by hostname, obtaining a proxy object for the
			implementation which is running on our server*/
			GymAndNutrition gnObject;
			gnObject = (GymAndNutrition) Naming.lookup( "//" + hostname + "/GymAndNutritionServer");
			System.out.println(gnObject.returnURL());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
