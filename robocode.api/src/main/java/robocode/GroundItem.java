package robocode;

import java.awt.geom.Line2D;

public class GroundItem {

    private final double x;
    private final double y;
    private boolean active;
    private final String name;
    private final Line2D.Double boundingLine = new Line2D.Double();


    public GroundItem(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        active = true;
        boundingLine.setLine(x, y, 35, 35);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
