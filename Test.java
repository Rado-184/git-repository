/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class Test {

    private static String totalRes;
    private static String res1;
    private static String res2;
    private static int var = 2;
    private static int i;

    public static void main(String[] args) {
        Test t = new Test();

//        System.out.println(firstTask());
//        System.out.println(t.secondTask());
//        System.out.println(t.thirdTask());
//        t.fourthTask();
//        System.out.println(t.fifthTask());
//        System.out.println(t.sixthTask());
//        t.seventhTask();
//        System.out.println(t.eighthTask());
//        t.ninthTask();
        t.tenthTask();
    }

    public static String firstTask() {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        try {
            i = in.nextInt();
        } catch (InputMismatchException e) {
            totalRes = "The entered number is not an integer.";
            return totalRes;
        }
        Test t = new Test();
        primeNumber(i);
        if (i % 2 == 0) {
            res2 = "The number is even.";
        } else {
            res2 = "This is an odd number.";
        }

        return totalRes = res1 + "\n" + res2;
    }

    public static void primeNumber(int i) {  //This method is used for the "firstTask"
        if (i > 1) {
            if (i % var != 0) {
                var++;
                primeNumber(i);
            } else if (var == i) {
                res1 = "This is a prime number";
            } else {
                res1 = "The is a composite number";
            }
        } else if (i == 1) {
            res1 = "1 is neither prime nor composite number.";
        } else {
            res1 = "The is a composite number";
        }
    }
//----------------------------- The end of the first task-------------------//

    public String secondTask() {
        String res = null;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Please enter first number: ");
            int i = in.nextInt();
            System.out.print("Please enter second number: ");
            int y = in.nextInt();

            res = ("Sum = " + (i + y)) + ("\nDif = " + Math.abs(i - y))
                    + ("\nGCD = " + gcd(i, y)) + ("\nLCM = " + lcm(i, y));
        } catch (InputMismatchException e) {
            res = "The entered number is not an integer.";
        }
        return res;
    }

    public int gcd(int i, int y) {    //This method is used for the "secondTask"
        return y == 0 ? i : gcd(y, i % y);
    }

    public int lcm(int i, int y) {      //This method is used for the "secondTask"
        return i / gcd(i, y) * y;
    }
    //----------------------------- The end of the second task-------------------//

    public boolean thirdTask() {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = in.nextLine();

        StringBuilder strBuilder = new StringBuilder(sentence);
        strBuilder.reverse();
        String reversedSentence = strBuilder.toString();
        return sentence.equalsIgnoreCase(reversedSentence);
    }
    //----------------------------- The end of the third task-------------------//

    public void fourthTask() {
        String res = null;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a sentence");

        String sentence = in.nextLine();
        String[] tokens = sentence.split("[,\\s]");
        List<String> list = Arrays.asList(tokens);

        Collections.sort(list);

        System.out.println(list + "\n" + "Array size = " + list.size());

    }
    //----------------------------- The end of the fourth task-------------------//

    public int fifthTask() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sentence = in.nextLine();
        System.out.println("Please enter a word");
        String word = in.nextLine();

        String[] tokens = sentence.split(" ");
        Map<String, Integer> hm = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

        for (String o : tokens) {
            hm.put(o, hm.getOrDefault(o, 0) + 1);
        }

        return (hm.get("" + word + ""));
    }
    //----------------------------- The end of the fifth task-------------------//

    public boolean sixthTask() {
        boolean res = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number");
        double a = in.nextDouble();
        System.out.println("Please enter second number");
        double b = in.nextDouble();
        System.out.println("Please enter third number");
        double c = in.nextDouble();

        if (c == Math.sqrt(a * a + b * b)) {
            res = true;
        } else if (a == Math.sqrt(c * c + b * b)) {
            res = true;
        } else if (b == Math.sqrt(c * c + a * a)) {
            res = true;
        }
        return res;
    }
    //----------------------------- The end of the sixth task-------------------//

    public void seventhTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = in.nextInt();
        int max = 0;
        int min = 99;
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = 10 + (int) (Math.random() * 90);

            System.out.println(arr[j]);
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    //----------------------------- The end of the seventh task-------------------//

    public ArrayList eighthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");

        int i = in.nextInt();
        ArrayList<String> list = new ArrayList<>();

        if (i > 100) {
            System.out.println("Error: number should be equal or less than 100");
        } else {
            String[] str = new String[i];
            for (int j = 0; j < i; j++) {
                str[j] = Integer.toString(j);
            }

            for (int j = 0; j < i; j++) {
                StringBuilder strBuilder = new StringBuilder(str[j]);
                strBuilder.reverse();
                String reversedStr = strBuilder.toString();
                if (str[j].equals(reversedStr)) {
                    list.add(str[j]);
                }
            }
        }
        return list;
    }
    //----------------------------- The end of the eighth task-------------------//

    public void ninthTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number N");
        int n = in.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Even list: " + list);
        System.out.println("sum: " + sum);
    }
    //----------------------------- The end of the ninth task-------------------//

    public void tenthTask() {
        String str = null;
        int[] arr = new int[3];
        String[] arrStr = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number ");
        arr[0] = in.nextInt();
        System.out.println("Please enter second number ");
        arr[1] = in.nextInt();
        System.out.println("Please enter third number ");
        arr[2] = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
            str = (Integer.toString(arr[0]) + Integer.toString(arr[1]) + Integer.toString(arr[2]));    
            System.out.println(str);
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
//----------------------------- The end of the tenth task-------------------//
}
