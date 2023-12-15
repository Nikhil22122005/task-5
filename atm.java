import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

            nik1();
        }

        public static void nik1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Register");
            System.out.println("2.Exit");
            System.out.print("Enter your Choice:");
            int choice = sc.nextInt();

            if (choice == 2) {
                return;
            }

            if (choice == 1) {
                System.out.println();
                System.out.println();


                System.out.print("Enter your name :");
                String name = sc.next();
            System.out.print("Enter your username : ");
            String user = sc.next();

            System.out.print("Enter your password :");
            String pass = sc.next();

            System.out.print("Enter your Account number:");
            int num = sc.nextInt();

            System.out.println("Registration completed ......kindly login");


            while (true) {
                System.out.println("1.login");
                System.out.println("2.Exit");
                System.out.print("Enter your Choice:");
                int choice1 = sc.nextInt();
                if (choice == 1) {
                    System.out.print("Enter your username:");
                    String name2 = sc.next();
                    System.out.print("Enter your password:");
                    String pass2 = sc.next();
                    if (user.equals(name2) && pass.equals(pass2)) {
                        System.out.println("Succesfully login!!!!");
                        nik();
                    } else {
                        System.out.println("Incorrect details ...!!!!");
                    }
                }
                if (choice == 2) {
                    return;
                }
            }
        }
    }


        private static void nik(){
                int balance = 10000;
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.println("1.Withdrawl");
                    System.out.println("2.Deposit");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Transfer");
                    System.out.println("5.Exit");
                    System.out.print("Enter your choice:");
                    int a = sc.nextInt();
                    if (a == 1) {
                        System.out.print("Enter amount to withdrawl:");
                        int withdrawl = sc.nextInt();
                        balance = balance - withdrawl;
                        System.out.println("Succesfully Withdrawl..!!!");
                    }
                    if (a == 2) {
                        System.out.print("Enter amount to Deposit:");
                        int Deposit = sc.nextInt();
                        balance = balance + Deposit;
                        System.out.println("Succesfully Deposited..!!!");
                    }
                    if (a == 3) {
                        System.out.println("Your balance is :" + balance);
                    }
                    if (a == 4) {
                        System.out.print("Enter Account number to Transfer:");
                        int transfer = sc.nextInt();
                        System.out.print("Enter amount to Transfer:");
                        int transfer1 = sc.nextInt();
                        balance = balance - transfer1;
                        System.out.println("Succesfully Transfered" + transfer1 + "to Account number :" + transfer);

                    }
                    if (a == 5) {
                        nik1();
                    }
                }
            }
}

