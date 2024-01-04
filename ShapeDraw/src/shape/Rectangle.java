package shape;

/**
 * SRP: Responsible for drawing rectangle
 * LSP: substituate for the base class of Shape
 */
public class Rectangle extends Shape{


    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}