package com.example.codetest._02condition;

import java.util.Scanner;

public class _02시험성적 {

    public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int A = in.nextInt();
            in.close();

            if (A >= 90) System.out.println("A");
            else if (A >= 80) System.out.println("B");
            else if (A >= 70) System.out.println("C");
            else if (A >= 60) System.out.println("D");
            else System.out.println("F");

            System.out.println("-----두번째방밥-----");
            System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
        }

    }
}
