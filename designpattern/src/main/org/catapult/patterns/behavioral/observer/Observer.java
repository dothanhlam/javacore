package org.catapult.patterns.behavioral.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Observer {
    public String getValueInString() {
        return valueInString;
    }

    protected String valueInString;
    protected Subject subject;
    public abstract void update();
}
