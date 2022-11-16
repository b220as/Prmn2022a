package lecture04;

public class Account {
    final String name;
    final String number;
    long balance;

    Account(String name ,String number){
        this.name = name;
        this.number = number;
        this.balance = 0 ;
    }
}
