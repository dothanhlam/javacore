package org.catapult.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class FactoryBuilder {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
