package net.sf.robocode.battle.peer;



import net.sf.robocode.battle.BoundingRectangle;
import robocode.GroundITemPickupEvent;
import robocode.GroundItem;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

public abstract class GroundItemPeer implements Serializable {

    private final GroundItem groundItem;
    private final BoundingRectangle boundingBox;
    private Image image;

    public GroundItemPeer(GroundItem item) {
        this.groundItem = item;
        boundingBox = new BoundingRectangle(getX(),getY(),35,35);
        image = createImage();
    }


    public double getX() {
        return groundItem.getX();
    }

    public double getY() {
        return groundItem.getY();
    }

    public GroundItem.GroundItemType getType() {
        return groundItem.getType();
    }

    public boolean isActive() {
        return groundItem.isActive();
    }

    public GroundItem getGroundItem(){
        return groundItem;
    }

    public abstract void update (List<RobotPeer> robots);
    protected abstract Image createImage();

    public Image getImage() {
        return this.image;
    }

    public BoundingRectangle getBoundingBox() {
        return boundingBox;
    }

    public void setImage(Image image) {
        this.image = image;
    }




}
