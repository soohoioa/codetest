package com.example.codetest._02condition;

import java.util.Scanner;

public class _01두수비교 {

    public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int A = in.nextInt();
            int B = in.nextInt();

            in.close();

            System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));

            System.out.println("-----두번째방법-----");
            String str = (A>B) ? ">" : ((A<B) ? "<" : "==" );
            System.out.println(str);
        }

    }

}
