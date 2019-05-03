package robocode.control.snapshot;


import net.sf.robocode.battle.peer.GroundItemPeer;
import robocode.GroundItem;

public interface IGroundItemSnapshot {


    double getPaintX();

    double getPaintY();

    GroundItemPeer getState();
}
