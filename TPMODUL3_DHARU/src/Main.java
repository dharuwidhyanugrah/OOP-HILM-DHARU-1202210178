import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much Food to made: ");
            orderQty = input.nextInt();

            Thread pertama = new Thread(resto);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread kedua = new Thread(waiter);

            pertama.start();
            kedua.start();
            pertama.join();
            kedua.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}
