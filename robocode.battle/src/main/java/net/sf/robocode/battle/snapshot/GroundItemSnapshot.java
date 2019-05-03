package net.sf.robocode.battle.snapshot;

import net.sf.robocode.battle.peer.GroundItemPeer;
import robocode.GroundItem;
import robocode.control.snapshot.IGroundItemSnapshot;

public class GroundItemSnapshot implements IGroundItemSnapshot {
    private final GroundItemPeer groundItem;

    public GroundItemSnapshot(GroundItemPeer groundItem) {
        this.groundItem = groundItem;
    }

    @Override
    public double getPaintX() {
        return groundItem.getX();
    }

    @Override
    public double getPaintY() {
        return groundItem.getY();
    }

    @Override
    public GroundItem getState() {
        return groundItem.getGroundItem();
    }
}
