package org.catapult.patterns.behavioral.mediator;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
