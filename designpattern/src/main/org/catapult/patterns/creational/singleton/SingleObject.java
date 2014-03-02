package org.catapult.patterns.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
