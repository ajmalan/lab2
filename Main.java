class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    // Declaring variables
    int total = 55*11;
    double blue = total*.24 ;
    double brown = total*.13;
    double green = total*.16;
    double orange = total*.2;
    double red = total*.13;
    double yellow = total*.14;
   // Print Statements for M&M Calculations
    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);
    // Sum Statements
    double sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sum);
    //Comparison Booleans
    if ( blue < brown && red > orange)
      System.out.println ("Blue under Brown and Red over Orange");
if ( brown >= green)
     System.out.println ("Brown is greater than or equal to Green");
if ( sum == total)
     System.out.println ("Numbers match");
  }
}