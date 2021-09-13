/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise8;

import java.util.Scanner;


public class Excercise8 {
    public static void main(String[] args){
        Scanner eyes = new Scanner(System.in);

        System.out.print("How many people do you have:");

        String STRpeople = eyes.nextLine();

        var people = Integer.parseInt(STRpeople, 10);

        System.out.print("How many pizzas do you have?");

        String STRpizza = eyes.nextLine();

        var pizza = Integer.parseInt(STRpizza, 10);

        System.out.print("How many slices per pizza?");

        String STRslices = eyes.nextLine();

        var slices = Integer.parseInt(STRslices, 10);

        int total_slices = (pizza * slices);

        int servings = total_slices / people;

        int remainder = total_slices % slices;

        System.out.printf("%d people with %d pizzas(%d slices)\n", people, pizza, total_slices);

        System.out.printf("Each person gets %d slices of pizza\n", servings);

        System.out.printf("there are %d slices left over\n", remainder);


    }
}
