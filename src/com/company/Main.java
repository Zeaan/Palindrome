package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        String reverse_word = "";
        String temp;

        for(int i=word.length()-1; i>=0; i--){
            temp = (word.charAt(i)+"").trim();
            reverse_word = reverse_word+temp;
        }

        if(reverse_word.toLowerCase().equals(word.toLowerCase()))
            System.out.println(word+" is a Palindrome");
        else
            System.out.println(word+" is not a Palindrome");
    }
}
