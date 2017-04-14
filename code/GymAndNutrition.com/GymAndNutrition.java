import java.rmi.*;

public interface GymAndNutrition extends java.rmi.Remote {
  //method must throw remote exception
	public String returnURL() throws RemoteException;

}
