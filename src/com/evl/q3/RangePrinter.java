package com.evl.q3;

import java.util.Scanner;

public class RangePrinter {
    public static String printRange(int start, int end, int increment){
        String res = "";
        for(int i=start;i<=end;i+=increment){
            res+=i+" ";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in format (start<space>end<space>increment) :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int increment = sc.nextInt();
        System.out.println(printRange(start,end,increment));
    }
}
