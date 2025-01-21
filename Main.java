public class Main {

   public static void main(String []args) {
      // ARRAY (list) is a DATA STRUCTURE (collection) that
      // stores multiple values in one named variable

      // DECLARE arrays using square brackets
      // one array can hold items of ONE DATA TYPE
      int[] luckyNumbers; // just creates a named REFERENCE, no values yet
      double[] mileTimes;
      boolean[] trueOrFalse;
      // arrays can also store OBJECTS (reference types)
      String[] spiritAnimals;

      // TWO OPTIONS to CREATE the array in memory
      // 1. Use the keyword NEW to set up an empty array
      // Need to tell Java HOW MANY SPACES to allocate!
      luckyNumbers = new int[6]; // already declared
      int[] moreLuckyNumbers = new int[8]; // DECLARE + CREATE in one line
      double[] movieRatings = new double[10];
      String[] faveAnimals = new String[8]; 

      System.out.println(moreLuckyNumbers); // prints locations in memory

      // 2. Use an INITIALIZER LIST to set array values 
      int[] luckiestNumbers = { 13, 13, 10, 9, 5, 20, 37, 7 };
      double[] currentCash = { 0.0, 5.25, 1.0, 15.0, 21.0 };
      // HOW TO ACCESS ARRAY ELEMENTS (items)
      // arrayNAME[index] --> gets item at that position
      System.out.println(luckiestNumbers[0]); // first item is at index 0

      // HOW TO MODIFY ARRAY ELEMENTS  
      // arrayName[index] = newValue
      faveAnimals[0] = "dolphin";
      faveAnimals[1] = "dog";
      // NOTE that the other 6 indices hold NULL
      System.out.println(faveAnimals[2]);

      String[] bestClass = { "Maia", "Alex", "Zoie", "Paige", "Natalie", "Bryce", "Finny", "Jackson" };
      System.out.println(bestClass[5]);
      // LENGTH is an Array ATTRIBUTE/PROPERTY 
      int numStudents = bestClass.length;
      System.out.println(numStudents);
      // FINAL INDEX is always [length - 1] !!!
      int lastStudentIndex = bestClass.length - 1; // 7
      System.out.println(bestClass[lastStudentIndex]);

      // PARALLEL ARRAY to hold info associated with another arrat
      String[] faveFoods = { "Pasta", "", "Sushi", "Caesar Salad", "Sushi", "Burritos", "I don't know", "Lasagna" };
      // With parallel arrays, ORDER MATTERS
      // 
      System.out.println(bestClass[4] + "'s favorite food is " + faveFoods[4]);
      System.out.println(bestClass[3] + "'s favorite food is " + faveFoods[3]);
   }
}
