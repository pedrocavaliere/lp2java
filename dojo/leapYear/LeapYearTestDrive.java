public class LeapYearTestDrive {

  public static void main(String[] args)
  {
    Year leapYear = new Year();


    // Leap Years
    System.out.println("\nTrue:");
    System.out.println(leapYear.isLeapYear(4));
    System.out.println(leapYear.isLeapYear(400));
    System.out.println(leapYear.isLeapYear(1944));

    System.out.println("\nFalse:");
    System.out.println(leapYear.isLeapYear(100)); // false
    System.out.println(leapYear.isLeapYear(1742));
  }
}
