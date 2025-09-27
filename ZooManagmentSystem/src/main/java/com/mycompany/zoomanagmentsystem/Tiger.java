
package com.mycompany.zoomanagmentsystem;

/**
 *
 * @author New User
 */
public class Tiger extends Animal{
    
    public Tiger(String name, int age, boolean isFed) {
        super(name, age, isFed);
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrrr");
    }
    public void feedAnimal(){
        super.setIsFed(true);
    }
    
  
    public void healthCheck(){
        if (super.getAge()>10 && super.getAge()>=100 ) {
            if (super.getAge()>10 && super.getAge()<20){
                System.out.println("Young");
            } else if(super.getAge() >20 && super.getAge() < 40){
                System.out.println("Adult");
            } else if(super.getAge() >40 && super.getAge() <= 100){
                System.out.println("Old");
            
        }
    
    }else {
            System.out.println("Baby");
        }
}
    public void specialBehavior(){
        System.out.println("Fastest animal in the animal kingdom");
    }
}