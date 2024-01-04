package drawing;

import shape.Shape;

//ISP: Interface Drawing is specific to the needs of classes that implements it
public interface Drawing {
    
    void drawShape(Shape shape);
}
