
import java.util.*;

import canvas.Canvas;
import drawing.Drawing;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

//OCP: new shapes can be added
public class App {
    public static void main(String[] args) throws Exception {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        Drawing canvas = new Canvas(shapes);

        for (Shape shape : shapes) {
            canvas.drawShape(shape);
        }
    }
}
