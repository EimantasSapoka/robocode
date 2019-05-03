package net.sf.robocode.battle.peer;

import net.sf.robocode.ui.gfx.ImageUtil;
import robocode.GroundITemPickupEvent;
import robocode.GroundItem;

import java.awt.*;
import java.util.List;

public class MinePeer extends GroundItemPeer {

    public MinePeer(GroundItem item) {
        super(item);
    }

    public void update(List<RobotPeer> robots) {
        for (RobotPeer otherRobot : robots) {
            if (!(otherRobot == null || otherRobot.isDead())
                    && otherRobot.getBoundingBox().intersects(getBoundingBox())) {

                double damage = 25;
                otherRobot.updateEnergy(-damage);


                otherRobot.addEvent(new GroundITemPickupEvent());


                getGroundItem().setActive(false);

                break;
            }
        }
    }

    protected Image createImage() {
        return ImageUtil.getImage("/net/sf/robocode/ui/images/mine.png");
    }


}
