import java.util.Scanner;

class CuentaBancaria{
    private String titular;
    private double saldo;

    CuentaBancaria(String titular,double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double retirar(double cantidad){
        if (cantidad > getSaldo()) {
            throw new IllegalArgumentException("Error: Fondos insuficientes.");            
        }
        else{
            saldo -= cantidad;
            System.out.printf("Se han retirado $ %f exitosamente.\n",cantidad);
            System.out.println("Saldo actualizado.");
        }
        return cantidad;
    }

    public double depositar(double cantidad){
        if (cantidad > 0.0){
            saldo += cantidad;
            System.out.println("Deposito correcto..");
        } else {
            throw new IllegalArgumentException("Error: No puedes depositar cantidades menores o iguales a cero.");
        }
        return cantidad;
    }
}

class CuentaCorriente extends CuentaBancaria{

    private final double limiteSobregiro ;
    CuentaCorriente(String titular, double saldo,double limiteSobregiro) {
        super(titular, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }
    @Override
    public double retirar(double cantidad){
        double saldo = getSaldo();
        double limite =  saldo + limiteSobregiro;

        if (cantidad > limite) {
              System.out.println("Sobregiro detectado..");     
               System.out.println(" Error: Límite de sobregiro excedido. Fondos insuficientes.");     
        }
        else{ 
            System.out.println(" Procesando retiro con autorización de sobregiro...");
            setSaldo(saldo - cantidad);
            System.out.printf(" Se han retirado $ %f exitosamente.\n", cantidad);
        }
        return cantidad;
    }
}

public class SimuladorBanco{
    public static void main(String[] args){
        System.out.println("=== SISTEMA BANCARIO INICIADO ===");
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Bienvenido.");
            System.out.println("Ingresa tu nombre:");
            String nombre = scanner.nextLine();

            System.out.println(" --- Ingresa tu saldo inicial 'ejm 50.99'  --- : ");  
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine();

            CuentaBancaria datos = new CuentaCorriente(nombre, saldoInicial,50.0);

            System.out.println("--- Ingresando al menu... para salir al final presiona 6. ---");
            boolean statusOperaciones = true;
            int opcion;

            while (statusOperaciones) { 
                System.out.println(" --- PRESIONA 1 PARA MOSTRAR TU SALDO ACTUAL ");
                System.out.println(" --- PRESIONA 2 PARA DEPOSITOS  ");
                System.out.println(" --- PRESIONA 3 PARA RETIRAR ");
                System.out.println(" --- PRESIONA 6 SALIR ");

                opcion = scanner.nextInt();
                if (opcion == 1){
                    System.out.print("--- Saldo actual: \n");
                    System.out.println(datos.getSaldo());
                } if (opcion == 2){
                    try{
                        System.out.println("--- Ingresa la cantidad que deseas depositar: ");
                            double montoDeposito = scanner.nextDouble();
                            datos.depositar(montoDeposito);                       
                    }   catch (IllegalArgumentException e){
                        System.out.println("--- Numeros negativos no validos.");
                    } finally {
                        System.out.println("---");
                    }                   
                } if (opcion == 3) {
                    try {
                       System.out.println("Ingresa la cantidad que deseas retirar: ");
                        double montoRetirar = scanner.nextDouble();
                        datos.retirar(montoRetirar);
                    } catch (NumberFormatException e) {
                        System.out.println("--- Error porfavor ingrese unicamente numeros.");
                    } finally {
                        System.out.println("---");
                    }
                    
                } if (opcion == 6) {
                    System.out.println(" --- Gracias por usar el sistema.. \n Saliendo...---");
                    statusOperaciones = false;
                }
            }

        }catch (NumberFormatException e ){
            System.out.println("---Opcion Invalida..---");
        } finally {
            System.out.println("------");
            scanner.close();
        }
    }
}