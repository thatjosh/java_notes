package mypack;

class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Main myObj = new Main();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
  }
}