
public class JavaVersionCheck{
    
    public static void main(String[] args){

        System.out.println("Java Main function call -start");

        // Java Version check 
        System.out.println("Java Specification version: " + System.getProperty("java.specification.version"));
        System.out.println("Java runtime version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java class version: " + System.getProperty("java.class.version"));

        System.out.println("Java Main function call -start");

    }
}