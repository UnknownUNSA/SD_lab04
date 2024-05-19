import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Tarjeta extends UnicastRemoteObject implements TarjetaInterface {
    private String numeroTarjeta;
    private double saldo;

    public Tarjeta(String numeroTarjeta, double saldoInicial) throws RemoteException {
        super();
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldoInicial;
    }

    @Override
    public boolean retirar(double monto) throws RemoteException {  // Cambiado de cargar a retirar
        if (monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    @Override
    public boolean depositar(double monto) throws RemoteException {  // Cambiado de abonar a depositar
        saldo += monto;
        return true;
    }

    @Override
    public double obtenerSaldo() throws RemoteException {
        return saldo;
    }

    @Override
    public String obtenerDetalles() throws RemoteException {
        return "Número de Tarjeta: " + numeroTarjeta + "\nSaldo: " + saldo;
    }
}

