package shape;

//SRP: responsible for drawing circle
//LSP: substituate for the base class of Shape
public class Circle extends Shape{
    

    @Override
    public void draw(){
        System.out.println("Drawing Circle" );
    }
}
