package org.catapult.patterns.creational.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }

        if (shapeName == "rectangle") {
            return new Rectangle();
        }
        else if (shapeName == "circle") {
            return new Circle();
        }

        return null;
    }
}
