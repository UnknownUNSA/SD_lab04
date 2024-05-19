import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoInterface extends Remote {
    public void agregarTarjeta(String numeroTarjeta, double saldoInicial) throws RemoteException;
    public TarjetaInterface obtenerTarjeta(String numeroTarjeta) throws RemoteException;
}

