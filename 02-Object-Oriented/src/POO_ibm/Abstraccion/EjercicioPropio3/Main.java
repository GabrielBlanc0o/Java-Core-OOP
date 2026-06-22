
import java.util.ArrayList;

interface OperacionBancaria
{
    void depositar(double monto);
    double consultarSaldo();
}

abstract class CuentaBancaria implements OperacionBancaria{

    protected String titular;
    protected double saldo;

    public CuentaBancaria (String titular) 
    {
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public void depositar(double monto)
    {
        saldo += monto;
        System.out.println("Depósito realizado. Saldo actual: " + saldo); 
    }
}

class CuentaAhorros extends CuentaBancaria
{
    public CuentaAhorros(String titular)
    {
        super(titular);
    }

    protected double tasaInteres = 0.05;

    @Override
    public double consultarSaldo() {
        return saldo + (saldo * tasaInteres);
    }
}


class CuentaCorriente extends CuentaBancaria
{
    protected double cuotaManejo;

    public CuentaCorriente(String titular,double cuotaManejo)
    {
        super(titular);
        this.cuotaManejo = cuotaManejo;
    }
    @Override
    public double consultarSaldo() {
        return saldo - cuotaManejo;
    }
}

public class Main
{
    public static void main(String []args)
    {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(new CuentaAhorros("Gabito"));
        cuentas.add(new CuentaCorriente("Juan",1500.0));

        for (CuentaBancaria user : cuentas)
        {
            user.depositar(1500.0);
            System.out.println("Titular: " + user.titular);
            System.out.println(user.consultarSaldo());
        }
    }
}

