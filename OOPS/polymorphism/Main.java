package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        square square = new square();

        shape.area();// Compile time polymorphism
        circle.area();

        shapes Circle = new circle(); //Run time Polymorphism
        Circle.area();
    }
    
        
    }

