package lecture06;

import java.util.*;

public class Exercise6_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for(int i=0;i<5;i++){
            list.add(random.nextInt(6) + 1);
        }
        System.out.println("サイコロを"+list.size()+"個振った.");
        System.out.print("何個目のサイコロの値を確認しますか: ");
        try{
            System.out.println("サイコロの値は "+list.get(input.nextInt())+".");
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認.");
            System.out.println("プログラム終了.");
            System.exit(0);
        }catch (InputMismatchException e){
            System.out.println("int型整数以外の値の入力を確認.");
            System.out.println("プログラム終了.");
        }



    }
}
