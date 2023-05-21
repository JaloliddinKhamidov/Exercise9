package pl.vistula50182;

public class Task2 {

    public static void main(String[ ] args) {
        int[] Nimesh50182 = {1, 2, 3, 6 , 8 , 21};
        System.out.println(Nimesh50182[7]);


        try {
            Nimesh50182 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(Nimesh50182[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
