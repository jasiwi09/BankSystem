public class Client {

    private String name;
    private String firstName;
    private String lastName;
    private long accountMoney;
    private long money;


    public Client(String name, String firstName, String lastName, long accountMoney, long money) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountMoney = accountMoney;
        this.money = money;
    }

    public  void withdraw(int amount) {
        if (this.accountMoney >= amount) {
            this.accountMoney -= amount;
            this.money += amount;
            System.out.println("[*] Has retirado: " + amount + " euros.");
        } else  {
            System.out.println("[*] No tienes suficiente dinero");
        }
    }

    public void deposit(int amount) {
        if (this.money >= amount) {
            this.accountMoney += amount;
            this.money -= amount;
            System.out.println("[*] Has ingresado: " + amount + " euros.");
        } else {
            System.out.println("[*] No tienes suficiente dinero");
        }
    }

    public long getAccountMoney() {
        return this.accountMoney;
    }

    public long getMoney() {
        return this.money;
    }

    public String getFullName() {
        return this.name + " " + this.firstName + " " + this.lastName;
    }

}
