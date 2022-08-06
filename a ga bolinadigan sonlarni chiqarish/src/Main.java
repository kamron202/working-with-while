import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
//        int i=1;
//        int res= 0;
//        System.out.print("bo'limuvchi son: ");
//        int a=scanner.nextInt();
//        System.out.print("gacha bo'linsin: ");
//        int b = scanner.nextInt();
//        while (i<=b) {
//
//            if(i % a == 0) {
//                res ++;                     //bolinadiAN sonlar
//                System.out.print(i+" ");
//
//            }
//            i++;
//        }
//        System.out.println();
//        System.out.println(res);                 //bolingan sonlarni nechtaligi


        int i = 1;
        int res = 0;

        while (i <= 50) {

            if (i % 2 == 0) {
                res += i;
                System.out.println();
                System.out.print(i + " ");

                if (i % 3 == 0) {

                    //(i % 5 == 0 && i % 3 == 0) { 3ga va 5ga bolinadi
                    res += i;
                    //res ++;     //sonlarni nechtaligini korsatadi

                    System.out.print(i + " ");
                    System.out.println();
                }
            }
            i++;
        }
        System.out.println();
        System.out.println(res);


    }
}