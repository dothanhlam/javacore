package org.catapult.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFacade {
    private ArrayList<Shape> shape;
    public ShapeFacade() {
        shape = new ArrayList<Shape>();
        shape.add(new Circle());
        shape.add(new Rectangle());
        shape.add(new Square());
    }

    public void drawCircle() {
        shape.get(0).draw();
    }

    public void drawRectangle() {
        shape.get(1).draw();
    }

    public void drawSquare() {
        shape.get(2).draw();
    }
}
