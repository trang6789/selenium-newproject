package lesson_05;

public class StringLearning {

    public static void main(String[] args) {
        //Tường minh - Literal declaration
         String myName1 = "Teo";
         String myName2 = "Teo";

         //String Object declaration
        String myName3 = new String("Teo");

        System.out.println("myName1 == myName2" + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3" + (myName1.equals(myName3)));

        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigit = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;
        for (char character : myCharacters) {
            if(Character.isDigit(character)){
                totalDigit++;
            }
            if(Character.isLowerCase(character)){
                totalLowerCase++;
            }
            if(Character.isUpperCase(character)){
                totalUpperCase++;
            }
        }
        if(totalDigit > 0 && totalLowerCase > 0 && totalUpperCase > 0){
            System.out.println("You are all set");
        }else {
            System.out.println("Password format is incorrect!");
        }
    }
}
