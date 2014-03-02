package org.catapult.patterns.creational.abstractfactory;

import org.catapult.patterns.creational.factory.Shape;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
