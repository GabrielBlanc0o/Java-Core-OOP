
import java.util.ArrayList;

interface Suscripcion
{
    void activar();
    double calcularMensualidad();
}

abstract class Plan implements Suscripcion
{
    protected String nombreUsuario;
    protected double precioBase;
    protected boolean isActivo;

    public Plan(String nombreUsuario, double precioBase)
    {
        this.nombreUsuario = nombreUsuario;
        this.precioBase = precioBase; 
        this.isActivo = false;
    }

    @Override
    public void activar()
    {
        isActivo = true;
        System.out.println("Estado activado.");
    }
}

class PlanEstudiante extends Plan
{
    protected String nombreUniversidad;

    public PlanEstudiante(String nombreUsuario, double precioBase, String nombreUniversidad) {
        super(nombreUsuario, precioBase); 
        this.nombreUniversidad = nombreUniversidad;
    }

    @Override
    public double calcularMensualidad() 
    {
        return precioBase * 0.60;
    }
}

class PlanPremium extends Plan 
{
    protected int pantallasSimultaneas;
     PlanPremium(String nombreUsuario, double precioBase, int pantallasSimultaneas) {
        super(nombreUsuario, precioBase);
        this.pantallasSimultaneas = pantallasSimultaneas;
    }

    int recargo = 5000;
    @Override
    public double calcularMensualidad()
    {
        if (pantallasSimultaneas > 2 ) 
        {
            return precioBase + ((pantallasSimultaneas - 2) *  recargo);
        }
        return precioBase;
    }
}

public class Main 
{
    public static void main(String []args)
    {
        ArrayList<Plan> planes = new ArrayList<>();
        planes.add(new PlanEstudiante("Gabo",2500.0,"LaSalle"));
        planes.add(new PlanPremium("Pepe",5060.0,3));

        for (Plan estudiante : planes)
        {
            estudiante.activar();
            System.out.println(estudiante.nombreUsuario);
            System.out.println(estudiante.calcularMensualidad());
        }
    }
}
