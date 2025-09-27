/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.student_grade_analyzer;

import java.util.Scanner;

/**
 *
 * @author New User
 */
public class Student_grade_analyzer {
    


    public static void main(String[] args) {
        
       //Var Declaration
        String name;
        int  maths, physics, english;
        int sum;
        double avrg;
        
        try {
            //Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Full Name: ");
        name = scan.nextLine();
        
        System.out.println("ENTER YOURS MARKS: ");
        System.out.print("Maths: ");
        maths = scan.nextInt();
        System.out.print("Physics: ");
        physics = scan.nextInt();
        System.out.print("English: ");
        english = scan.nextInt();
        
        //formulas
        sum=maths+physics+english;
        avrg=(int)sum/3;
        
        
        
        
        
        
        System.out.println("Name: "+name);

        //Maths
        if (maths < 50) {
            System.out.println("maths: " + maths + "F");

        } else if (maths < 59 ) {
            System.out.println("maths: " + maths + "D");
        } else if (maths < 69||maths>50) {
            System.out.println("maths: " + maths + "C");
        } else if (maths < 79) {
            System.out.println("maths: " + maths + "B");
        } else if (maths > 90) {
            System.out.println("maths: " + maths + "A");
        } else if (maths < 100) {
            System.out.println("maths: " + maths + "A");
        } else {
            System.out.println("NULL OR INVALID INPUT");
        }

        //Physics
        if (physics < 50) {
            System.out.println("physics: " + physics + "F");

        } else if (physics < 59) {
            System.out.println("physics: " + physics + "D");
        } else if (physics < 69) {
            System.out.println("physics: " + physics + "C");
        } else if (physics < 79) {
            System.out.println("physics: " + physics + "B");
        } else if (physics > 90) {
            System.out.println("physics: " + physics + "A");
        } else if (physics < 100) {
            System.out.println("physics: " + physics + "A");
        } else {
            System.out.println("NULL OR INVALID INPUT");
        }

        //ENGLISH
        if (english < 50) {
            System.out.println("english: " + english + "F");

        } else if (english < 59) {
            System.out.println("english: " + english + "D");
        } else if (english < 69) {
            System.out.println("english: " + english + "C");
        } else if (english < 79) {
            System.out.println("english: " + english + "B");
        } else if (english > 90) {
            System.out.println("english: " + english + "A");
        } else if (english < 100) {
            System.out.println("english: " + english + "A");
        } else {
            System.out.println("NULL OR INVALID INPUT");
        }
        
        
        System.out.println("Avarage = "+avrg);

        } catch (Exception e) {
            System.out.println("please  enter a valid number!!!!!");
        }
        
        
    }
}
