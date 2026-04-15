package lesson_09_01;
// Bài toán nhiều attribute, nhiều value (standard, update value)
// Immutable Object | Read-only
// Design Pattern | Design ideas : Models (template) | 23, 24
// Builder Design Pattern
public class HouseWithBuilder {

    private String color = "White";
    private int mainDoor = 1;
    private int windows = 4;
    private String topRoofColor = "red";

    protected HouseWithBuilder(Builder builder){
        this.color = builder.color;
        this.mainDoor = builder.mainDoor;
        this.windows = builder.windows;
        this.topRoofColor = builder.topRoofColor;
    }
// Read only
    public String getColor() {
        return color;
    }

    public int getMainDoor() {
        return mainDoor;
    }

    public int getWindows() {
        return windows;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", windows=" + windows +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    // Inner Class |
    public static class Builder {
        private String color = "White";
        private int mainDoor = 1;
        private int windows = 4;
        private String topRoofColor = "red";

        // Write only

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMainDoor(int mainDoor) {
            this.mainDoor = mainDoor;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }




}
