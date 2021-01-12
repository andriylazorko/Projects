public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
        System.out.println("Exercise 150");
        int answer = multiply(6);
        System.out.println("the answer is "+answer);
        System.out.println("Multiplier is: "+ multiplier);


//        StaticTest firstInstance = new StaticTest("First Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("Second Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstance());
//
//        StaticTest thirdInstance = new StaticTest("Third Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstance());
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
