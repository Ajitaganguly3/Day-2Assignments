package shape;

//SRP: responsible for drawing Triangle
//LSP: substituate for the base class of Shape
public class Triangle extends Shape{
    

    @Override
    public void draw(){
        System.out.println("Drawing Triangle");
    }

}
