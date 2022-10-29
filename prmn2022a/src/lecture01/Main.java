package lecture01;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //kadai 1-1
        System.out.println("B2201250 Ayaka Shimizu");

        //kadai 1-2
        int studentNumber = 2201250 ;
        System.out.println("B"+studentNumber+" Ayaka Shimizu");

        //kadai 1-3
        int age ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ageに任意の値を入力:");
        age = scanner.nextInt();
        if(age<20){
            System.out.println("I am "+age+" years old so I cannot drink liquor.");
        }else{
            System.out.println("I am "+age+" years old so I can drink liquor.");
        }

    }
}
