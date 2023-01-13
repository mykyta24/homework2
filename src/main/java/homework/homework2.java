package homework;

public class homework2 {
    public static void main(String[] args) {
        homework2 homeworkFirst = new homework2();
        homeworkFirst.positiveIntegers();


    }


    public void positiveIntegers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3==0) {
                System.out.println("The number " + i + " is divisible by three");
            }
            else if (i % 2 == 0) {
                System.out.println("The number " + i + " is even");
            }
            else {
                System.out.println("The number " + i + " is odd");
            }




        }


    }


}


















