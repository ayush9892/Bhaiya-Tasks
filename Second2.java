/* Class with Overriding:- 
                        * same sign
                        * diff sign:- 
                                    byte float
                                    int float
                        *                          
 */

class First1{
    public int a;

    protected First1(){
        a = 1;
    }

    public int func1(){
        System.out.println("Class A.1");
        return 0;
    }

    protected int func2(){
        System.out.println("Class A.2");
        return 0;
    }
}

public class Second2 extends First1{
    public int b;

    
    // We can use different modifiers in constructor. But we mainly use public, because at the time of inheritance, it may cause problems.
    private Second2(){
        b = 2;
    }

    public int func1(){
        System.out.println("Class B.1");
        return 1;
    }

    /*  No Overriden can't occur with different return types. In overriden every things should be same, except the body.
       The reason is, when class A reference is storing the class B obj, then only the ditto copy of class B and A 
      methods or fileds are not identified by the compiler, i.e which method or fields are of which class type. 
      So, it is identified by the virtual fun in runtime.*/

    // public float func2(){       -> Overriden {error} with different return type.
    //     System.out.println("Class B.2");
    //     return 0.12f;
    // }


    
    /*  But condition is, sign should have higher privilages in child class. The reason is, imagine if a class 
        has a fun, that are accessible with some objs.Now if you apply any restriction to the same method that are in 
        another class, then compiler will struck that when these change were occur in the method. So, it will throw error.
    */
    public int func2(){    //-> Overriden with different sign
        System.out.println("Class B.2");
        return 0;
    }

    public static void main(String[] rid) {
        First1 ob1 = new Second2();
        ob1.func1();
        ob1.func2();
        System.out.println(ob1.a);
        //System.out.println(ob.b);

        
        First1 ob2 = new First1();
        // Constructor can be called outside the class, but only when we are creating an object.
    }
}