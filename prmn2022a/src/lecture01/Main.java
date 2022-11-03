package lecture01;

import java.util.Scanner;
public class Main {

    //kadai 1-5のメソッド
    static int min(int[] score){
        int min = score[0];
        for(int i:score)
        if(min > i){
            min = i;
        }
        return min;
    }

    static int max(int[] score){
        int max = score[0];
        for(int i:score)
            if(max < i){
                max = i;
            }
        return max;
    }

    static double average(int[] score){
        double ave = 0;
        for(int i=0;i<score.length;i++){
            ave += score[i];
        }
        ave /= score.length;
        return ave;
    }

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

        //kadai 1-4
        //forを用いた理由:
        int[] array = new int[100];
        int sum=0;
        for( int i=0 ; i<array.length ; i++ ){
            array[i] = i+1 ;
        }
        for( int j=0 ; j<array.length ; j++ ){
            if(j%2==0){
                sum += array[j];
            }
        }
        System.out.println(sum+"");

        //kadai 1-5
        int[] score = {41,85,72,38,80};
        for(int i=0;i<score.length;i++){
            System.out.print(i+"番 "+score[i]+"点　");
            if(score[i]<60){
                System.out.println("不可");
            }else if(60<=score[i] && score[i]<70){
                System.out.println("可");
            }else if(70<=score[i] && score[i]<80){
                System.out.println("良");
            }else if(80<=score[i] && score[i]<90){
                System.out.println("優");
            }else{
                System.out.println("秀");
            }
        }
        System.out.println("最高点:"+max(score)+"点");
        System.out.println("最低点:"+min(score)+"点");
        System.out.println("平均点:"+average(score)+"点");

    }
}
