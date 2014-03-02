package org.catapult.patterns.behavioral.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/29/13
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        this.valueInString = Integer.toBinaryString(subject.getState());
    }
}
