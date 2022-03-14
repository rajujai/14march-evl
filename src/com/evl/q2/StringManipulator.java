package com.evl.q2;

import java.util.Scanner;

public class StringManipulator {
    public String removeVowels(String input)
    {
        if(input=="" || input==null)
            return null;
        String[] str = input.split("");
        String newStr = "";
        for(int i=0;i<str.length;i++){
            if(input.charAt(i)!='a' && input.charAt(i)!='e' && input.charAt(i)!='i' && input.charAt(i)!='o' && input.charAt(i)!='u')
                newStr+=str[i];
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid string: ");
        String input = sc.nextLine().trim();
        StringManipulator sm = new StringManipulator();
        String res = sm.removeVowels(input);
        System.out.println(res);
    }
}