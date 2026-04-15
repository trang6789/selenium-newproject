package lesson_06;

// Functional programming
//What to solve
public class MayGatDapLienHop {
    //method
    public void catLua(String cayLua) {
        System.out.println("Dang cat " + cayLua);
    }

    public void xayLua(String hatLua) {
        System.out.println("Dang xay " + hatLua);
    }

    public static void main(String[] args) {
        // Instance/ Object
        // Class  --   variable name/ reference variable --   new (heap memory)/ create new instance --  Contructor (hàm khởi tạo) ko tham số()
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        mayGatDapLienHop.catLua("Cay lua");
        mayGatDapLienHop.xayLua("Hat lua");
    }
}
