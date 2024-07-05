/*
    How Java Works?  
    
        source code         --->  compiler  --->  bytecode  --->     JVM        --->   Machine code  
    (high-level language)                                        (interpreter)        



    Understanding the Structure of a Java Program:

    How Java Works:

        1. Source Code: The program is initially written in a high-level language, such as Java.
        2. Compiler: The source code is compiled by the Java compiler, which translates it into bytecode.
        3. Bytecode: The compiled bytecode is platform-independent and can be executed by any Java Virtual Machine (JVM).
        4. JVM: The JVM interprets the bytecode and translates it into machine code that the underlying hardware can execute.

    Anatomy of a Java Program:

        1. Class Declaration: A Java program is organized into classes. The 'class' keyword is followed by the class name.
        2. Main Method: The 'main' method is the entry point of the program, where execution begins.
        3. Method Signature: 'public static void main(String args[])' is the standard signature for the main method.
*/

// Class Declaration:
// The class name must match the filename.
// Java is case-sensitive, so 'hello' is not the same as 'Hello' or 'HELLO'.
class Hello {         

    // Main Method:
    // The main method is where the program starts execution.
    // It must be declared as 'public', 'static', and 'void'.
    // 'public': This access modifier allows the method to be called from outside the class.
    // 'static': This keyword allows the method to be called without creating an instance of the class
    // 'void': This keyword indicates that the method does not return any value.
    // 'String args[]': The main method can accept arguments as an array of strings.
    
    public static void main(String args[]) { 
        
        // Printing Output:
        // 'System.out.println()' is a method to print output to the console.
        System.out.println("Hello JAVA!");
    }
}


