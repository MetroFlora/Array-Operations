
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eurellowatte
 */
public class Task2 {
     /*public static void main(String[] args) {
        // TODO code application logic here
        int[] ten = {10,20,20,40,50,60,70,80,90,100};
    Arrays.sort(ten);
    System.out.println("Sorted array");
    for (int i : ten) {
        System.out.println(i + " ");
    }
}}*/
public static void main(String[] args) {
        // TODO code application logic here
        int[] ten = {10, 20, 20, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum += ten[i];
        }
        System.out.println("Sum of elements in the array: " + sum);
        Arrays.sort(ten);
        int[] sortedTen = new int[ten.length];
        for (int i = 0; i < ten.length; i++) {
            sortedTen[ten.length - 1 - i] = ten[i];
        }
        System.out.println("Sorted elements in descending order: " + Arrays.toString(sortedTen));
        for (int i = 0; i < sortedTen.length; i++) {
            if (sortedTen[i] == 100) {
                sortedTen[i] = 1000;
            }
        }
        System.out.println("Array with 100 replaced by 1000: " + Arrays.toString(sortedTen));
    }}
