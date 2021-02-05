import java.rmi.*;

public interface SortArray extends Remote {
	public String arraySort(int a, int [] b) throws RemoteException;
}