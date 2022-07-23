/* Class with Exception:-
                        * diff sign with excep.
                        * diff sign with sub excep.
                        * diff sign with custom excep.
 */

import java.io.*;
 

class Pare{
    protected void exc1() throws ArithmeticException{
        if(7 != 1){
            throw new MyException();
        }
    }
}

class MyException extends RuntimeException{     // -> Custom Exception.
    @Override
    public String getMessage() {
        System.out.println("Overrided");
        return "Exception created by me!";
    }
    
}



public class Except extends Pare{
    public int a;

    private void exc2() throws Exception{
        int a = 3/0;
        System.out.println("Child");
    }

    public static void main(String[] args) {    
        Except ob2 = new Except();

        try{
            ob2.exc1();
        }catch(ArithmeticException e){
            System.out.println("Parent Excep:-" + e.getMessage());
        }catch(MyException e){
            System.out.println("Parent Excep:-" + e.getMessage());
        }

        try{
            ob2.exc2();
        }
        catch (Exception e){
            System.out.println("Child Excep:-" + e.getMessage());
        }

        System.out.println("Exit");
    }

 }