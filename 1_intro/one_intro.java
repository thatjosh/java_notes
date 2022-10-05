public class one_intro {
  public static void main(String[] args) {

    // 1. Basic printing
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");

    // 2. Printing string and numbers
    int exampleNumber = 15;
    System.out.println("I am printing a number: " + exampleNumber);

    // 3. Declaring multiple variables
    int x, y, z;
    x = y = z = 50;
    System.out.println(x + y + z);

    // 4. Narrow type casting
    double myDouble = 10.54d;
    int myInt = (int) myDouble; // manual conversion - only needed if converting from bigger data type to smaller data type
    System.out.println(myDouble);
    System.out.println(myInt);

    // 5. Search index of phrase in a string
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
  }
}