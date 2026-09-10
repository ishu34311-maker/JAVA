public class onPay {
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        Payment payment2 = new CardPayment();
        payment.pay(1000);
        payment.paymentStatus();
        payment2.pay(500);
        payment2.paymentStatus();

        User user = new Customer("Ishu");
        User user2 = new Admin("Admin");
        user.showUserType();
        user2.showUserType();

    }
}
abstract class User{
    String name;
    abstract void showUserType();
}
class Customer extends User{
    
    Customer(String name){
        this.name = name;
    }
    @Override  
    void showUserType(){
        System.out.println("Name"+ name);
        System.out.println("User Type: Customer");
    }
}
class Admin extends User{
    Admin(String name){
        this.name = name;
    }
    @Override 
   void showUserType(){
    System.out.println("Name:"+ name);
        System.out.println("User Type: Admin");
    }
}

interface Payment{
    void pay(double amount);
    void paymentStatus();
}
class UPIPayment implements Payment{
    @Override 
   public void pay(double amount){
        System.out.println("Payment through UPI: Rs"+ amount);
    }
    @Override 
    public void paymentStatus(){
        System.out.println("Payment is successfull. " );
    }
}
class CardPayment implements Payment{
        @Override 
    public void pay(double amount){
        System.out.println("Payment through Card: Rs"+ amount);
    }
    @Override 
    public void paymentStatus(){
        System.out.println("Payment is successfull. " );
    }
}