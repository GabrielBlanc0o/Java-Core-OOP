// ejercicio de practica con constructores parametrizados

class transaccion {

    String id;
    double amount;
    double taxRate;
    String status;

    transaccion(String id, double amount,double taxRate){
        this.id = id;
        this.amount = amount;
        this.taxRate = taxRate;
        this.status = "PENDING";
    }

    double calculateTotal(){
            return  this.amount + (this.amount * this.taxRate);
    }

    void completeTransaction(){
        this.status = "SUCCESS";
    }
}


public class Transaction{
    public static void main(String[] args){
        transaccion userX = new transaccion("58",600,0.19); 
        transaccion userY = new transaccion("69",200,0); 
        
        System.out.println("ID "+userX.id+" status: "+userX.status +
         " \nPrecio sin IVA " + userX.amount+"\n");
    
        double totalconIva =userX.calculateTotal(); 
        userX.completeTransaction();
        System.out.println("ID "+userX.id+
            " status: "+userX.status + " \nPrecio con IVA " + totalconIva);

        System.out.println();

        System.out.println("ID "+userY.id+" status: "+userY.status +
         " \nPrecio sin IVA " + userY.amount+"\n");
    
        double totalconIva2 =userY.calculateTotal(); 
        userY.completeTransaction();
        System.out.println("ID "+userY.id+
                " status: "+userY.status + "\nPrecio " + totalconIva2);
    }
}
