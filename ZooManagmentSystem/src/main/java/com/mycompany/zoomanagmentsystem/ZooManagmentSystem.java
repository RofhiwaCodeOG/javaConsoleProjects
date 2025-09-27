/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.zoomanagmentsystem;

import java.util.Scanner;

public class ZooManagmentSystem {
    
    //method for calculating cost of food
      public void feedingCost() {


        int costFood = 80;
        int numberofFeeds = 7;
        int sum;
        
        sum = costFood*numberofFeeds;
        
        System.out.println(" The cost is: " + sum);

    }

    public static void main(String[] args) {
        
        //A objects
        
        ZooManagmentSystem cost = new ZooManagmentSystem();
        
        //introducing Scanner
        Scanner scn = new Scanner(System.in);
       
        //Declaring variables
        String feedAction;
        String checkHealth;
        String triggerBehavior;
        
       // Asking user for input
        System.out.println("Enter the action");
        feedAction = scn.nextLine();

        System.out.println("Enter the Health");
        checkHealth = scn.nextLine();
        
        System.out.println("Enter the Trigger behavior");
         triggerBehavior= scn.nextLine();
        
        //Switch statement
        switch (feedAction) {
            case "feed":
                System.out.println("animal fed");
                break;
            case "not fed":
                System.out.println("animal not fed");
                break;

        }
        switch (checkHealth) {
            case "Healthy":
                System.out.println("Health checked");
                break;
            case "Health not checked":
                System.out.println("Health not checked");
                break;

        }
                
             switch (triggerBehavior) {
            case "blood":
                System.out.println("Health checked");
                break;
            case "Health not checked":
                System.out.println("Health not checked");
                break;

        }
               cost.feedingCost();
    

  

}
}
