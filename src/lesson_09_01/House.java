package lesson_09_01;
// Bài toán nhiều attribute, nhiều value (standard, update value)
public class House {

    private String color = "White";
    private int mainDoor = 1;
    private String topRoofColor;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoor(int mainDoor) {
        this.mainDoor = mainDoor;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }


    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house1 = new House();
        house1.setColor("pink");
        house1.setMainDoor(2);

        System.out.println(house1);
    }

    // Immutable Object | Read-only
    // Builder Design Pattern
}
