package lecture03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {

        //入力する行数の取得
        Scanner scanner = new Scanner(System.in);
        System.out.print("何行分入力しますか: ");
        int inputNum = scanner.nextInt();
        scanner.nextLine();

        //配列の生成
        List<String> list = new ArrayList<String>();

        //配列への入力
        for(int i=0 ; i<inputNum ; i++){
            System.out.print((i+1)+"行目: ");
            list.add(scanner.nextLine());
        }

        //出力(拡張for文で)
        System.out.println("入力した文字列:");
        int j = 0;
        for(String str :list){
            System.out.println("["+list.indexOf(str)+"] "+str); //list.indexOf(str) でインデックス取得できる
        }
    }
}
