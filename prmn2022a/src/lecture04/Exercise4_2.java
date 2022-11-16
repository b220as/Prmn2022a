package lecture04;

//import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.existsAccount("清水彩加","12345");
        atm.registerAccount("清水彩加","12345");
        atm.existsAccount("清水彩加","12345");
        atm.deposit("12345",1000);
        atm.withdraw("12345",2000);
        atm.withdraw("12345",500);

        /*
        System.out.println("口座新規開設 1");
        System.out.println("口座の有無の確認 2");
        System.out.println("入金 3");
        System.out.println("引出 4");
        Scanner input = new Scanner(System.in);
        input.nextInt();
         */

    }
}
