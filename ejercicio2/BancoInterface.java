import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoInterface extends Remote {
    void agregarTarjeta(String numeroTarjeta, double saldoInicial) throws RemoteException;
    TarjetaInterface obtenerTarjeta(String numeroTarjeta) throws RemoteException;
}
