package lesson_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//dùng khi cần tra cứu nhanh theo key
//dùng mapping dữ liệu (API)
//dùng đếm số lần xuất hiện (dùng khi xử lý data)
public class HashMapLearning {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
//        System.out.println(emergencyList.get(116));
//        emergencyList.put(116, "Something else");
//        System.out.println(emergencyList.get(116));

//        emergencyList.replace(116, "116");
//        emergencyList.replace(116, "1167","Something else!");
//        emergencyList.remove(116,"1167");

//        for (int key : emergencyList.keySet()) {
////            if(emergencyList.get(key).equals("Others")){
////                emergencyList.replace(key, "Something else");
////            }
//            emergencyList.replace(key, "Others", "Something else!");
//        }
//
//        for (int key : emergencyList.keySet()) {
//            System.out.println(emergencyList.get(key));
//        }
//
//        for (int key : emergencyList.keySet()) {
//            System.out.println(emergencyList.get(key));
//
//        }

        //ConcurrentModificationException -- xử lý = Iterator

        Iterator<Map.Entry<Integer,String>> emergencyValue = emergencyList.entrySet().iterator();
        while(emergencyValue.hasNext()){
            Map.Entry<Integer, String> entry = emergencyValue.next();
            if (entry.getValue().equals("Others")) {
                emergencyValue.remove();
            }
        }
        System.out.println(emergencyList);
    }
}
