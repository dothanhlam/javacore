package org.catapult.patterns.creational.abstractfactory;

import org.catapult.patterns.creational.factory.Circle;
import org.catapult.patterns.creational.factory.Rectangle;
import org.catapult.patterns.creational.factory.Shape;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape == "rectangle") {
            return new Rectangle();
        }
        else if (shape == "circle") {
            return new Circle();
        }
        return null;
    }
}
