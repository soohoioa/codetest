package com.example.codetest._01string;

import java.util.Scanner;

public class _06나머지 {

    public class Main {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            in.close();

            System.out.println( (A+B)%C );
            System.out.println( (A%C + B%C)%C );
            System.out.println( (A*B)%C );
            System.out.println( (A%C * B%C)%C );

        }

    }
}
