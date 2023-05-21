package pl.vistula61421;

class MyClass {
    static String yes61421() {
        String yes = null;
        return yes;
    }
}


public class Main {

    public static void main(String[] args) {
        MyClass ref= null;
        //

        try{
            ref.toString();

        }
        catch (Exception e){
            System.out.println("Error");
            System.out.println(e);
            e.printStackTrace();

        }
    }
}
