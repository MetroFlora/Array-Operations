
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eurellowatte
 */
public class CopyingArray {
    public static void main (String[] args) {
    String [] copyFrom = {
        "Affogato","americano","Cappuccino","Correto","Cortado","Doppio",
        "Espresso","Frappacino","Freddo","Lungo","Macchiato",
        "Marocchino","Ristretto"};
    //the case of the first letter changes its output sequence.
    /*String [] copyTo = new String [7];
    System.arraycopy(copyFrom, 2,copyTo, 0, 7);
    for (String coffee : copyTo) {
        System.out.print(coffee + " ");*/
        
         /*Arrays.sort(copyFrom);
   
    System.out.println("Sorted array");
    for (String i : copyFrom) {
        System.out.println(i + "");
    }*/
          Arrays.parallelSort(copyFrom);
        System.out.println(Arrays.toString(copyFrom));  
    }}

    

