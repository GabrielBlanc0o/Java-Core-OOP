import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

interface Opciones 
{
     void verUsuarios(String cuenta);
     void agregarCuentas(String cuentaAString);
     void mostrarCuentas();
     void mostrarCuentasRepetidas();
     void buscarCuenta(String id);
}

class Menu implements Opciones
{
    Scanner sc = new Scanner(System.in);
    Set<String> lista  = new TreeSet<>();
   

    @Override
    public void verUsuarios(String cuenta)
    {
        int userOrder = 1;
        if (lista.isEmpty()) 
        {
            System.out.println("No hay cuentas que mostrar."); 
            return; 
        }
        System.out.println("Usuarios: ");
        for (String account : lista)
            {
                System.out.println("| ID " + userOrder + " | Acc number : " + account);
                userOrder++;
            }
        
    }
    @Override
    public void agregarCuentas(String cuentaAString)
    {
        
        try
        {
            System.out.println("Ingresa el nombre de la cuenta Ejm [CTA-1024]: ");
            String cuentaNueva = sc.nextLine();
            lista.add(cuentaNueva);
        } 
        catch ( IllegalArgumentException e ) 
        {
            System.out.println("Error : " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Cuenta Agregado.");
        }
    }

    @Override
    public void mostrarCuentas() 
    
    {
        int userOrder = 1;
        System.out.println("Cuentas: ");
        for (String account : lista)
            {
                System.out.println("| ID " + userOrder + " | Acc number : " + account);
                userOrder++;                
            }   
    }

    @Override
    public void mostrarCuentasRepetidas()
    {
        System.out.println("En un TreeSet no existen elementos repetidos.");
        System.out.println("Total de cuentas únicas almacenadas: " + lista.size()); 
    }

    @Override
    public void buscarCuenta(String id) 
    {
        try
        {
            System.out.println("Ingresa el nombre de la cuenta:");
            String buscarCuenta = sc.nextLine();

                if (lista.contains(buscarCuenta)) 
                {
                    System.out.println("¡Cuenta encontrada en el sistema!: " + buscarCuenta);
                } 
                else 
                {
                    System.out.println("La cuenta '" + buscarCuenta + "' no existe en nuestros registros.");
                }
                System.out.println("------------");
            
            
        } 
        catch (NullPointerException e)
        {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        finally
        {
            System.out.println("------------");
        }   
    }
}



public class CuentasDuplicadas 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Menu opciones = new Menu();
        System.out.println("Bienvenido.");

        while (true)
        { 
            System.out.println("Opcion 1: Ver todos los usuarios: ");
            System.out.println("Opcion 2: Agregar Cuenta: ");
            System.out.println("Opcion 3: Mostrar Cuentas ordenadas sin repeticiones: ");
            System.out.println("Opcion 4: Mostrar cuentas repetidas: ");
            System.out.println("Opcion 5: Buscar Usuario por ID: ");
            System.out.println("Otro numero para salir del menu.");
            String Opcion = sc.nextLine();

            

            if (Opcion.equals("1"))
            {
                opciones.verUsuarios("");
            }

            else if (Opcion.equals("2"))
            {
                opciones.agregarCuentas("");
            }

            else if (Opcion.equals("3"))
            {
                opciones.mostrarCuentas();
            }

            else if (Opcion.equals("4"))
            {
                opciones.mostrarCuentasRepetidas();
            }
            
            else if (Opcion.equals("5"))
            {
                opciones.buscarCuenta("");
            }
            else 
            {
                System.out.println("Saliendo...");
                break;  
            }
        }
    }
}