package org.catapult.patterns.creational.abstractfactory;

import org.catapult.patterns.creational.factory.Shape;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color == "green") {
            return new Green();
        }
        else if (color == "red") {
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
