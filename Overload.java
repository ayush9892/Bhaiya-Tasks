/*  Class with Constructor, overloading:-
                            i> same sign with different parameters
*/

public class Overload{
    public int no;
    public String word;

    //  * Methods can have same class name. 
    public int Overload(){  // -> method with class name.
        this.no = 2;
        word = "No, cons";
        return this.no;
    }

    /* * If you give any return type in constructor, then it will becomes method. 
       * Because the main purpose of constructor is to initialize the attributes automatically, when an object is created. 
       * So, there is no need of any return type.
    */
   public Overload(){   // -> Constructor
        this.no = 1;
        word = "Yes, cons.";
    }
    

    // >> OVERLOADING Concepts:- 

    public int metho(){ 
        System.out.println("A");
        return 0;
    }

    // * No in overloading, it doesn't matter whether you have different return type of method or not.
    // * Compiler will, only vary by its parameter, else it will throw "method is already defined".
    
    // public double metho(){   // -> diff sign same para.  {error}
    //     System.out.println("A");
    //     return 0.0;
    // }

    public double metho(double a){  // -> diff sign diff para.
        System.out.println("B");
        return a;
    }

    public double metho(int a, double d){   // -> same sign diff para.
        System.out.println("C");
        return d;
    }




    public static void main(String [] par){
        Overload ob = new Overload();
        System.out.println(ob.no + ob.word);
        ob.Overload();
        System.out.println(ob.no + ob.word);
        int a = ob.metho();
        double b = ob.metho(3.14);
        double c = ob.metho(3, 1.31);
        
    }

    
}