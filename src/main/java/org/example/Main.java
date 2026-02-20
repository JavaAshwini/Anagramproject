//package org.example;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
//        String Input1=null, Input2=null;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the Input 1");
//        Input1  = scanner.nextLine();
//        System.out.println("Please enter the Input 2");
//        Input2  = scanner.nextLine();
//        if(checkAnagram(Input1, Input2))
//            System.out.println("Input is an anagram");
//        else
//            System.out.println("Input is not an anagram");
//    }
//
//    private static boolean checkAnagram(String Input1,String Input2 ) {
//
//        Input1 = Input1.toLowerCase().trim().replace(" ","");;
//        Input2 = Input2.toLowerCase().trim().replace(" ","");
//        System.out.println(Input1);
//        System.out.println(Input2);
//        if (Input1.length() == Input2.length()) {
//            char[] ch1 = Input1.toCharArray();
//            char[] ch2 = Input2.toCharArray();
//
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//
//            if (Arrays.equals(ch1, ch2))
//                return true;
//            else
//                return false;
//
//        }
//        else
//            return false;
//    }
//}