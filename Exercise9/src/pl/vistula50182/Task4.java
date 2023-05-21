package pl.vistula50182;

public class Task4 {

    public static void Method(int Nimesh) throws LessThanOneException,GreaterThanOneException,EqualsZeroException{
        if(Nimesh<0){
            throw new LessThanOneException("The number Is Less Than 0");
        }
        else if (Nimesh>1){
            throw new GreaterThanOneException("The number Is Greater Than 1");
        }
        else if(Nimesh==0){
            throw new EqualsZeroException("The number Is equal To 0");
        }
    }
    public static  void main(String[]args) throws GreaterThanOneException, LessThanOneException, EqualsZeroException {
        try {
            Method(0);
        }
        catch (GreaterThanOneException | EqualsZeroException |LessThanOneException tfs ){
            System.out.println(tfs);
        }

    }


}
