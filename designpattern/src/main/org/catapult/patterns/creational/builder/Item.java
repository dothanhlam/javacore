package org.catapult.patterns.creational.builder;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/28/13
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();

}