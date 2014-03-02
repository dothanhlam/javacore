package org.catapult.patterns.behavioral.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/29/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class OctalObserver extends  Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        this.valueInString = Integer.toOctalString(subject.getState());
    }
}
