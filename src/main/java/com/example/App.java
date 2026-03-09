package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter Principal: ");
            double p = sc.nextDouble();
            
            System.out.print("Enter Rate: ");
            double r = sc.nextDouble();
            
            System.out.print("Enter Time (years): ");
            double t = sc.nextDouble();
            
            double si = (p * r * t) / 100;
            
            System.out.println("Simple Interest: " + si);
            System.out.println("Total Amount: " + (p + si));
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            sc.close();
        }
    }
}
