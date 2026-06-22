import java.util.HashMap;

public class ecommerce 
{
    final private HashMap<Integer,String> orders;

    public ecommerce() {
        orders = new HashMap<>();
    }
    public void addOrder(int orderId, String customerName){
        orders.put(orderId, customerName);
    }

    //  mostrar ordenes
    public void displayOrders() {
        System.out.println("Customer Orders:");
        for (int orderId : orders.keySet())
        {
            System.out.println("Order ID: "+ orderId + ", Customer Name: " + orders.get(orderId));
        }
    }

    public static void main(String[] args) {
        ecommerce orderManagement = new ecommerce();
        orderManagement.addOrder(101, "Gabriel");
        orderManagement.displayOrders();
    }

 
}
