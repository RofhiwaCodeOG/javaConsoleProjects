
package com.mycompany.zoomanagmentsystem;

/**
 *
 * @author New User
 */
abstract class Animal {
    private String name;
    private int age;
    private boolean isFed;

    public Animal(String name, int age, boolean isFed) {
        this.name = name;
        this.age = age;
        this.isFed = isFed;
    }
    
    public abstract void makeSound();

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsFed() {
        return isFed;
    }

    public void setIsFed(boolean isFed) {
        this.isFed = isFed;
    }
    
    
}
