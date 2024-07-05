//Data Types In Java 

//data types are classified into two categories:
    //Primitive Data type or Intrinsic or built-in data type
    //Non-Primitive Data type or derived  or reference data type

/*
    Primitive data type 
    ____________________
    
    The primitive data types are the predefined data types of Java. 
    They specify the size and type of any standard values. 
    Java has 8 primitive data types namely byte, short, int, long, float, double, 
    char and boolean.

    When a primitive data type is stored, it is the stack that the values will be assigned.

    When a variable is copied then another copy of the variable is created and 
    changes made to the copied variable will not reflect changes in the original variable.
    
    INTEGER 
        byte     1 byte     -2^7  to (2^7)-1
        short    2 bytes    -2^15 to (2^15)-1
        int      4 bytes    -2^31 to (2^31)-1
        long     8 bytes    -2^63 to (2^63)-1
        
        Note : For All Integer Data Types default Value 0
        
    FLOATING POINT 
        float    4 bytes(32 bits)  default 0.0f 
        double   8 bytes(64 bits)  default 0.0d
    
    Character
        char    2 bytes     0 to 2^16   unsigned unicode charater  
        
        Why char uses 2 bytes in Java ?
        
        Char uses 2 bytes in java because it uses the Unicode system 
        rather than the ASCII system.
    
    BOOLEAN
        boolean 1 bit of staorage   values:true or false 
    
    
    Object data type
    ________________________
    
    These are also refered to as Non-primitive or Reference Data Type. 
    They are so-called because they refer to any particular object. 
    Unlike the primitive data types, the non-primitive ones are created by the users in Java.
    Examples include arrays, strings, classes, interfaces etc.
    
    When the reference variables will be stored, the variable will be stored in the stack 
    and the original object will be stored in the heap. 
    
    In Object data type although two copies will be created they both will point
    to the same variable in the heap, hence changes made to any variable will 
    reflect the change in both the variables.
    
    
    Primitive data types	                                    Objects
    ____________________                                        _________
    
    Stored in a stack                        Reference variable is stored in stack and the original                                        object is stored in heap
    
    Two different variables is created      Two reference variable is created but both are pointing
    along with different assignment         to the same object on the heap     
    (only values are same)
    
    Change does not reflect in the          Changes reflected in the original ones     
    original ones    
*/

public class DataType{
    public static void main(String[] args){
        int x=10;
        int y=x;
        System.out.println(x==y);
        System.out.println("\nPrimitive Data Type");
        System.out.print("Initially: ");
        System.out.println("x = " + x + ", y = " + y);
 
        // Here the change in the value of y
        // will not affect the value of x
        y = 30;
        
        System.out.print("\nAfter changing y to 30: ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(
            "\n**Only value of y is affected here "
            + "because of Primitive Data Type\n");
            
        System.out.println("Object Data Type");
        int a[]={1,2,3};
        int b[]=a;
        // Here complete reference of a is copied to b
        // and both point to same memory in Heap
        
        System.out.println("Initially");
        
        System.out.print("a : ");
        for(int i : a){
            System.out.print(i+" ");
        }
        
        System.out.print("\tb : ");
        for(int i : b){
            System.out.print(i+" ");
        }
        
        
        b[0]=7;
        // Modifying the value at
        // index 0 to 7 in array d
        
        System.out.println("\n\nAfter Changed  b[0]=7 ");
        System.out.print("a : ");
        for(int i : a){
            System.out.print(i+" ");
        }
        
        System.out.print("\tb : ");
        for(int i : b){
            System.out.print(i+" ");
        }
        
        System.out.println(
            "\n\n**Here value of a[0] is also affected "
            + "because of Reference Data Type\n");
    }
}
