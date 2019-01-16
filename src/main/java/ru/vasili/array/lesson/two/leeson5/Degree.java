package ru.vasili.array.lesson.two.leeson5;

//import java.util.Scanner;


public class Degree {
    public static void main(String[] args) {
        System.out.println("Число возводимое в степень = 3");
       // Scanner sc = new Scanner(System.in);
      //  int z = sc.nextInt();
        System.out.println("На сепень = 6 ");
    //    int x = sc.nextInt();
        System.out.println(degre(3, 6));
    } // Z = число возводимое в Х = степень.

    public static int degre(int z, int x) {
        if (x != 1) {
            return z * degre(z,x-1);
        }
        return z;
    }


}
