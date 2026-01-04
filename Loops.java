import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234 ;
        double balance = 1000 ;
         boolean running = true ;

         System.out.println("Enter your ATM PIN :");
         int enteredPin = scanner.nextInt();

         if (enteredPin != correctPin ) {
            System.out.println("Incorrect PIN! Access denied");
            return;
         }
         System.out.println("PIN Verified!Welcome");

        while (running) {
            System.out.println("----SHOW MENU----");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdrawal ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice :");
            int choice = scanner.nextInt();

            switch(choice) {

                case 1 :
                    System.out.println("Your current balance is " + balance);
                    break;

                    case 2 :
                        System.out.println("Enter amount to deposit cash :");
                        double deposit = scanner.nextDouble();
                        if ( deposit <= 0 ) {
                            System.out.println("Invalid!");
                        } else {
                            System.out.println("Deposit Allowed!");
                            balance = balance + deposit ;
                            System.out.println("Updated balance :" + balance );
                            break;
                        }

                        case 3 :
                            System.out.println("Enter amount to withdrawal :");
                            double amount = scanner.nextDouble();
                            if (amount > balance ) {
                                System.out.println("Insufficient Funds!");
                            } else if ( amount <= 0) {
                                System.out.println("Invalid!");
                            } else {
                                System.out.println("Withdrawal Allowed!");
                                balance = balance - amount ;
                                System.out.println("withdrawl Successful!");
                                System.out.println("Updated Balance :" + balance);
                                break;
                            }

                            case 4 :
                                System.out.println("Thankyou for using ATM!");
                                running = false;
                                break;

                                default :
                                System.out.println("Invalid choice!Try again");

            }
        }
    }
}