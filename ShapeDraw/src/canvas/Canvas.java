package canvas;

import shape.Shape;
import drawing.Drawing;

import java.util.List;

//DIP: Canvas class depends on the abstract class Shape

public class Canvas implements Drawing{
    
    public List<Shape> shapes;

    public Canvas(List<Shape> shapes){
        this.shapes = shapes;
    }

    @Override
    public void drawShape(Shape shape){
        shape.draw();
    }
}
