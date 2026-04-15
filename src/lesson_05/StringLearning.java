package lesson_05;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {
        //Tường minh - Literal declaration
        String myName1 = "Teo";
        String myName2 = "Teo";

//         //String Object declaration
//        String myName3 = new String("Teo");
//
//        System.out.println("myName1 == myName2" + (myName1.equals(myName2)));
//        System.out.println("myName1 == myName3" + (myName1.equals(myName3)));
//
//        String myPassword = "123myPassword";
//        char[] myCharacters = myPassword.toCharArray();
//        int totalDigit = 0;
//        int totalLowerCase = 0;
//        int totalUpperCase = 0;
//        for (char character : myCharacters) {
//            if(Character.isDigit(character)){
//                totalDigit++;
//            }
//            if(Character.isLowerCase(character)){
//                totalLowerCase++;
//            }
//            if(Character.isUpperCase(character)){
//                totalUpperCase++;
//            }
//        }
//        if(totalDigit > 0 && totalLowerCase > 0 && totalUpperCase > 0){
//            System.out.println("You are all set");
//        }else {
//            System.out.println("Password format is incorrect!");
//        }

        //Immutable - nội dung ko thay đổi đc
        String badWordsContainer = "bad, very bad, something else, bad!     ";
//        System.out.println(badWordsContainer.replace("bad", "b**"));
        String filteredStr = badWordsContainer.replace("bad", "b**");
        System.out.println(filteredStr);

        //trim
        System.out.println(badWordsContainer.trim());

        //subString, indexOf, split
        String url = "https://google.com";
        // lấy từ 0->4 (giống sublist)
        System.out.println(url.substring(0, 5));
        // cắt từ index 8 đến cuối
        System.out.println(url.substring(8));
        // trả về index đầu tiên chứa giá trị
        System.out.println(url.indexOf("o"));
        // trả về true, false - có chứa contain ko
        System.out.println(url.contains("https"));
        //split - cắt chuỗi theo quy luật
        String[] splitStr = url.split("://");
        System.out.println(Arrays.toString(splitStr));

        //$10, 10,000 vnd
        //RegularExpression | Regex
        String cookingTimeStr = "105mins";
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);
        // chuyển từ số qua chuỗi
        int a = 105;
        String.valueOf(a);
        // chuyển từ chuỗi qua số
        System.out.println(Integer.valueOf(cookingTimeNumStr));
        System.out.println(Integer.parseInt(cookingTimeNumStr));
        // tăng giá trị
        int cookingTimeNum = Integer.parseInt(cookingTimeNumStr);
        System.out.println("My cooking time: " + (cookingTimeNum + 1));

        for (int index = 0; index < 5; index++) {
            System.out.println("Element " + (index + 1));
        }

        // Concat | Concatenation - nối chuỗi
        String s1 = "Hello, ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2).concat("!"));

        // StringBuilder - xử lý đoạn dữ liệu lớn



        //Parttern, Matcher


    }
}
