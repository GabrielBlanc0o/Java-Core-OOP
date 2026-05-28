class UserAccount {
    String username;
    String email;
    int level;
    double walletBalance;
    UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
        level = 1;
        walletBalance = 0.0;
    }
    void depositMoney(double amount) {
        System.out.println("Deposit of $" + amount + "\n");
        walletBalance += amount;
    }
    void displayStatus(){
        System.out.printf("Username : %s \nLevel: %d \nReady to go $ %.1f \n\n",username,level,walletBalance);        
    }  
}

public class UserCase{

    public static void main(String[] args){
        UserAccount Gabriel = new UserAccount("Gabo", "coco@gmail.com");
        Gabriel.displayStatus();
        Gabriel.depositMoney(500.0);
        Gabriel.displayStatus();
    }

}