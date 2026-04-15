package lesson_08;

public class Meo {
// chỉ thay đổi attribute of object
    private int id;

    public Meo(){
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Meo meomeo = new Meo();
        Meo mimi = new Meo();
        mimi.setId(2);

        System.out.println(meomeo.getId());
        System.out.println(mimi.getId());
    }
}
