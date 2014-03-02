package org.catapult.patterns.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chating {
    public void chat() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
