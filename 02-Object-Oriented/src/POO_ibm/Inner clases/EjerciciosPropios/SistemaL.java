
interface Notificador
{
    void enviarAlerta(String msg);
}

class SistemaLogistico 
{
    private String nombreEmpresa = "PepeLLC";

    public class Paquete
    {
        String destino;
        double peso;

        public Paquete(String destino, double peso)
        {
            this.destino = destino;
            this.peso = peso;
        }
    
    public void mostrarDetalles() 
        {
            System.out.println("Nombre: " + nombreEmpresa 
                                + "\nDestino : " + destino 
                                + "\nPeso : " + peso);
        }
    }
    

    public static class CalculadoraRuta
    {
        public static double calcularCosto(double peso , double tarifa)
        {
            return peso * tarifa;
        }
    }
}

public class SistemaL
{
    public static void main(String[] args)
    {
        SistemaLogistico sistema = new SistemaLogistico();

        // instanciar clase interna reg 
        SistemaLogistico.Paquete miPaquete = sistema.new Paquete("Bogota", 12.5);
        miPaquete.mostrarDetalles();

        // instanciar clase estatica
        double costo = SistemaLogistico.CalculadoraRuta.calcularCosto(12.5, 5);
        System.out.println("Costo de envio: $"+costo);

        // usar clase anonima de la interfaz
        Notificador alertaDespacho = new Notificador()
        {
            @Override
            public void enviarAlerta(String msg)
            {
                System.out.println("Alerta del bunker: " + msg);
            }
        };
        alertaDespacho.enviarAlerta("El paquete hacia bogota va en camino.");
    }
}