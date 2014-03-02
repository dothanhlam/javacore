package org.catapult.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.print("Red: fill()");
    }
}
