package com.example.codetest._01string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _05출생연도 {

    public class Main {
        public static void main(String[] args) throws IOException {

            System.out.println("-----첫번째방법-----");
            Scanner in = new Scanner(System.in);
            int year = in.nextInt();
            System.out.println(year - 543);

            System.out.println("-----두번째방법-----");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();	// 한 줄을 읽고 문자열로 반환함
            int year_ = Integer.parseInt(s);	// 반환 된 문자열을 정수로 바꿔줌
            System.out.println(year_ - 543);
        }
    }

}
