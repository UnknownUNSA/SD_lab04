import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TarjetaInterface extends Remote {
    public boolean cargar(double monto) throws RemoteException;
    public boolean abonar(double monto) throws RemoteException;
    public double obtenerSaldo() throws RemoteException;
    public String obtenerDetalles() throws RemoteException;
}
