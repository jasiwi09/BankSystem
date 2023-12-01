import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;

        Client client = new Client("Pedro", "Suarez", "Sanchez", 500l, 10l);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("[!] Bienvenido " + client.getFullName());
            System.out.println("[*] ¿Que operación desea realizar?");
            System.out.println("[1] Depositar dinero");
            System.out.println("[2] Retirar dinero");
            System.out.println("[3] Consultar cuenta");
            System.out.println("-------------------------------------------------------");
            System.out.print("[?] Indique la opción: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("-------------------------------------------------------");
                System.out.println("[*] Dinero en cuenta: " + client.getAccountMoney() + " Dinero en efectivo: " + client.getMoney());
                System.out.println("[?] ¿Cuánto desea depositar?: ");
                option = scanner.nextInt();
                client.deposit(option);
            }

            if (option == 2) {
                System.out.println("-------------------------------------------------------");
                System.out.println("[*] Dinero en cuenta: " + client.getAccountMoney() + " Dinero en efectivo: " + client.getMoney());
                System.out.println("[?] ¿Cuánto desea retirar?: ");
                option = scanner.nextInt();
                client.withdraw(option);
            }

            if (option == 3) {
                System.out.println("-------------------------------------------------------");
                System.out.println("[*] Dinero en cuenta: " + client.getAccountMoney());
                System.out.println("[*] Dinero en efectivo: " + client.getMoney());
            }
            scanner.close();
        } while(true);
    
    }
}