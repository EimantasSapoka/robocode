package net.sf.robocode.battle.peer;

import robocode.GroundItem;

public class GroundItemPeerFactory {

    public static GroundItemPeer createGroundItemPeer(GroundItem groundItem) {
        GroundItem.GroundItemType type = groundItem.getType();
        switch (type) {
            case HEALTH: return new HealthPickupPeer(groundItem);
            case MINE: return new MinePeer(groundItem);
        }
        return null;
    }
}
