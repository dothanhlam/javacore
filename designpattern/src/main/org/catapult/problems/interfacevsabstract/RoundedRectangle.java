package org.catapult.problems.interfacevsabstract;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 12/29/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoundedRectangle extends BaseRectangle {
    // note that RoundedRectangle cannot override transform method due dto final keyword declaration from upper

    @Override
    public void draw() {
        super.draw();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
