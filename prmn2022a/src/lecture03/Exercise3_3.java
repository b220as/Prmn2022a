package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("一つ目の整数を入力:");
        String str1 = scanner.nextLine();
        Integer int1 = new Integer(str1);
        //Integerクラスをインスタンス化してparseInt()を使いたい
        //非推奨となる　
        //どのようにすれば推奨される形でparseInt()が使えるようになるのか
        int num1 = int1.parseInt(str1);

        System.out.print("二つ目の整数を入力:");
        String str2 = scanner.nextLine();
        Integer int2 = new Integer(str2);
        int num2 = int2.parseInt(str2);
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
}
