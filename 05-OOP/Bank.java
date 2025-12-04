public class Bank {
    static int balance = 1000;

    public static void Withdraw(int amount) {
        try {
            if(amount > balance){
                throw new ArithmeticException("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdraw successfull! Remaining Balance" + balance);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int withdrawAmount = 12000;
        System.out.println("Attempting to withdraw: " + withdrawAmount);
        Withdraw(withdrawAmount);
    }
}
