import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a int value: ");
    int diamondSize = scan.nextInt();
    System.out.println(diamondSize);
    int mid = diamondSize / 2;
    scan.close();
    if (diamondSize % 2 == 0){  // even diamond

      for (int i = 0; i <= mid ; i++){
        int stars;

        if (i == 0){
          stars = 2 * i + 1;
        } else {
          stars = 2 * i;
        }
        int spaces = (diamondSize - stars);
          for (int s = 0; s < spaces; s++){
            System.out.print(" ");
          }
          for (int star = 0; star < stars; star++){
            System.out.print("*");
            if (star < stars - 1) {
              System.out.print(" ");
            }
          }
          System.out.println();
      }
      for (int i = mid - 1; i >= 0; i--){
        int stars;

        if (i == 0){
          stars = 1;
        } else {
          stars = 2 * i;
        }
          int spaces = (diamondSize - stars);
          for (int s = 0; s < spaces; s++) {
             System.out.print(" ");
          }
          for (int star = 0; star < stars; star++){
            System.out.print("*");
             if (star < stars - 1) {
              System.out.print(" ");
            }
          }
          System.out.println();
      }



    } else { // odd diamond
      for (int i = 0; i<=mid; i++){
        int stars = 2 * i + 1;
        int spaces = (diamondSize - stars) / 2;

          for (int s = 0; s < spaces; s++) {
             System.out.print(" ");
        }
          for (int star = 0; star < stars; star++){
            System.out.print("*");
          }
          System.out.println();
      }
      for (int i = mid + 1; i < diamondSize; i++){
        int stars = 2 * (diamondSize - i - 1) + 1;
        int spaces = (diamondSize - stars) / 2;

        for (int s = 0; s < spaces; s++) {
             System.out.print(" ");
          }
         for (int star = 0; star < stars; star++){
            System.out.print("*");
          }
          System.out.println();
      }
    }
  }
}
