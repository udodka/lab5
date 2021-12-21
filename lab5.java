//1. Написать программу, выполняющую «сглаживание» вещественного массива A размерности N
//        следующим образом: элемент Ak заменяется на среднее арифметическое первых K исходных
//        элементов массива A. На экран должны выводиться как оригинальное состояние массива, так и
//        итоговое.
package com.company;
import java.util.*;

public class lab5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input elements:");
        ArrayList<Double> numbers = new ArrayList<>();

        while (in.hasNextLine()) {
            if (in.hasNextDouble()) {
                numbers.add(in.nextDouble());
            }
            else {
                String s = in.next();

                if (s.equals("quit")) {
                    break;
                } else {
                    System.out.println("input double numbers");
                }
            }
        }

        double sum = 0;
        ArrayList<Double> res = new ArrayList<>();

        for(int k = 0; k < numbers.size(); k++) {
            sum += numbers.get(k);
            res.add(sum / (k + 1));
        }
        in.close();
        System.out.println("original list:" + numbers);
        System.out.println("modified list:" + res);
    }
}
