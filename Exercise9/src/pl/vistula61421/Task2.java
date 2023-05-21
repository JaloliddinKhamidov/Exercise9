package pl.vistula61421;

public class Task2 {

    public static void main(String[ ] args) {
        int[] MyClass = {1, 2, 3, 6 , 8 , 21};
        System.out.println(MyClass[7]);


        try {
            MyClass = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(MyClass[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
