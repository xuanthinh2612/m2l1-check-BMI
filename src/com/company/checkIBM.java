package com.company;
import java.util.Scanner;
public class checkIBM {

    public static void main(String[] args) {
	// write your code here
        double bmi,weight,height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your weight (kg)");
        weight = scanner.nextDouble();
        System.out.println("insert your height (m)");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        if (bmi<18.5) {
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        } else if (bmi<25.0) {
            System.out.printf("%-20.2f%s",bmi,"Normal");
        } else if (bmi<30) {
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        }
        else {
            System.out.printf("%-20.2f%s",bmi,"Obese");

        }
    }
}
