package org.example;

public class GenericClass <T> {
    private T myField;


    public GenericClass(T myField) {
        this.myField = myField;
    }


    public void printField() {
        System.out.println("My field is: " + myField);
    }

    // Ana metod
    public static void main(String[] args) {

        GenericClass<String> myObject = new GenericClass<>("Hello, World!");

        myObject.printField();
    }
}
