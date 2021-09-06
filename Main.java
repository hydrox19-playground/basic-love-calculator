import java.util.Scanner;

public class Main {

  // Color constants
  public static final String COLOR_RED = "\u001B[31m";
  public static final String COLOR_GREEN = "\u001B[32m";
  public static final String COLOR_YELLOW = "\u001B[33m";
  public static final String COLOR_BLUE = "\u001B[34m";
  public static final String COLOR_CYAN = "\u001B[36m";
  public static final String COLOR_RESET = "\u001B[0m";


  private static int findSum(int number) {
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final String LOVE = "love";

    String firstName;
    String secondName;

    int firstSum;
    int secondSum;
    int loveSum;
    int totalSum;

    boolean isCompleted = false;

    while (true) {
      System.out.println(COLOR_RED + "♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️️️♥♥️♥♥️♥♥️♥♥️♥♥️♥♥️♥" + COLOR_RESET);

      if (isCompleted) break;

      System.out.print(COLOR_YELLOW + "Your name: " + COLOR_RESET);
      firstName = scanner.nextLine();

      System.out.print(COLOR_GREEN + "Your parnter's name: " + COLOR_RESET);
      secondName = scanner.nextLine();

      firstSum = 0;
      secondSum = 0;
      loveSum = 0;

      for (var i = 0; i < firstName.length(); i++) {
        firstSum += firstName.charAt(i);
      }

      for (var i = 0; i < secondName.length(); i++) {
        secondSum += secondName.charAt(i);
      }

      for (var i = 0; i < LOVE.length(); i++) {
        loveSum += LOVE.charAt(i);
      }
      totalSum = findSum(firstSum + secondSum);
      loveSum = findSum(loveSum);
      if (totalSum > loveSum) {
        totalSum = loveSum - (totalSum - loveSum);
      }
      if (!firstName.toLowerCase().equals("rajat") && !secondName.toLowerCase().equals("vaishnavi")) 
        System.out.println(COLOR_CYAN + firstName + "'s ️️️♥️ for " + secondName + " is " + (totalSum * 100 / loveSum) + "%" + COLOR_RESET);
      else
        System.out.printf("%s %s's ♥ for %s is 100%% %s \n", COLOR_CYAN, firstName, secondName, COLOR_RESET);
        // System.out.println(COLOR_CYAN + firstName + "'s ️️️♥️ for " + secondName + " is " + 100 + "%" + COLOR_RESET);
      isCompleted = true;
    }
    // close the scanner to prevent a resource leak
    scanner.close();
  }
}
