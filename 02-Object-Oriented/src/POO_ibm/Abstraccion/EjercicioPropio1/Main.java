interface Despanchante 
{
    void calcularRuta(String origen, String destino);
    void procesarEnvio(double peso);
}

abstract class EmpresaLogistica implements Despanchante
{
    protected String nombreEmpresa;
    protected double tarifaBase;

    public EmpresaLogistica(String nombreEmpresa, double tarifaBase)
    {
        this.nombreEmpresa = nombreEmpresa;
        this.tarifaBase = tarifaBase;

    }
    @Override
    public void calcularRuta(String origen, String destino)
    {
        System.out.println(nombreEmpresa+" Trazando ruta optima desde " + 
                            origen + " hasta " + destino);
    }
    @Override
    public abstract void procesarEnvio(double peso);
}

class EnviosLocales extends EmpresaLogistica 
{
    public EnviosLocales() 
    {    
        super("EnviosLocales", 5000.0);
    }   

    @Override
    public void procesarEnvio (double peso)
    {
        double costoTotal = tarifaBase + ( peso * 2000.0);
        System.out.println("Costo : "+ costoTotal);
    }
}

class CargaAereaGlobal extends  EmpresaLogistica
{
    public CargaAereaGlobal()
    {
        super("CargaAereaGlobal", 50000.0);
    }

    @Override
    public void procesarEnvio(double peso)
    {
        double costoTotal ;
        if (peso > 20)
        {
            costoTotal = tarifaBase + ( peso * 8000.0 );
            System.out.println("Costo : "+ costoTotal);
        } 
        else if (peso <= 20)
        {
            costoTotal = tarifaBase + ( peso * 4000.0 );
            System.out.println("Costo : "+ costoTotal);
        }
    }
}

public class Main 
{
    public static void main(String []args)
    {
        EmpresaLogistica envio = new EnviosLocales();
        envio.calcularRuta("Bogota", "Medellin");
        envio.procesarEnvio(15);

        EmpresaLogistica envio2 = new CargaAereaGlobal();
        envio2.calcularRuta("Bogota", "Miami");
        envio2.procesarEnvio(35);
        
    }
}