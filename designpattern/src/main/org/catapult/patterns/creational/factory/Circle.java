package org.catapult.patterns.creational.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 10:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.print("Circle: draw");
    }
}
