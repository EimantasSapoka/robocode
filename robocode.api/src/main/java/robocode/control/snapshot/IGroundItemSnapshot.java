package robocode.control.snapshot;


import robocode.GroundItem;

public interface IGroundItemSnapshot {


    double getPaintX();

    double getPaintY();

    GroundItem getState();
}
