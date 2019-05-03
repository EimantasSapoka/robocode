package net.sf.robocode.battle.peer;



import net.sf.robocode.battle.BoundingRectangle;
import robocode.GroundITemPickupEvent;
import robocode.GroundItem;

import java.io.Serializable;
import java.util.List;

public class GroundItemPeer implements Serializable {

    private final GroundItem groundItem;
    private final BoundingRectangle boundingBox;


    public GroundItemPeer(GroundItem item) {
        this.groundItem = item;
        boundingBox = new BoundingRectangle(getX(),getY(),35,35);
    }


    public double getX() {
        return groundItem.getX();
    }

    public double getY() {
        return groundItem.getY();
    }

    public String getName() {
        return groundItem.getName();
    }

    public boolean isActive() {
        return groundItem.isActive();
    }

    public void update(List<RobotPeer> robots) {
        for (RobotPeer otherRobot : robots) {
            if (!(otherRobot == null || otherRobot.isDead())
                    && otherRobot.getBoundingBox().intersects(boundingBox)) {

                double healthGain = 50;
                otherRobot.updateEnergy(healthGain);


                otherRobot.addEvent(new GroundITemPickupEvent());


                groundItem.setActive(false);

                break;
            }
        }
    }

    public GroundItem getGroundItem(){
        return groundItem;
    }
}
