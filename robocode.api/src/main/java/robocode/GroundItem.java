package robocode;


public class GroundItem {

    public enum GroundItemType {
        HEALTH ("Health pickup", "Increases health by 50"),
        MINE ("Mine", "Deals 25 damage");

        private final String description;
        private final String name;

        GroundItemType(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return name;
        }
    }

    public static final int ITEM_SIZE_X = 35;
    public static final int ITEM_SIZE_Y = 35;
    private final double x;
    private final double y;
    private boolean active;
    private final GroundItemType type;


    public GroundItem(double x, double y, GroundItemType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        active = true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public GroundItemType getType() {
        return type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
