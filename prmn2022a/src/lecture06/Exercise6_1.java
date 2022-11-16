package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("小数値を入力:");
            System.out.println(input.nextFloat());
        }catch(InputMismatchException e){
            System.out.println("Error");
        }
    }
}
