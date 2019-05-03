package net.sf.robocode.battle.peer;

import net.sf.robocode.battle.BoundingRectangle;
import net.sf.robocode.ui.gfx.ImageUtil;
import robocode.GroundITemPickupEvent;
import robocode.GroundItem;

import java.awt.*;
import java.util.List;

public class HealthPickupPeer extends GroundItemPeer {

    public HealthPickupPeer(GroundItem item) {
        super(item);
    }

    public void update(List<RobotPeer> robots) {
        for (RobotPeer otherRobot : robots) {
            if (!(otherRobot == null || otherRobot.isDead())
                    && otherRobot.getBoundingBox().intersects(getBoundingBox())) {

                double healthGain = 50;
                otherRobot.updateEnergy(healthGain);


                otherRobot.addEvent(new GroundITemPickupEvent());


                getGroundItem().setActive(false);

                break;
            }
        }
    }


    protected Image createImage() {
        return ImageUtil.getImage("/net/sf/robocode/ui/images/healthPickup.png");
    }

}
