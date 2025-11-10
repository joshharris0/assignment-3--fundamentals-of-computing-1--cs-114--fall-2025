import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a int value: ");
    int diamondSize = scan.nextInt();
    System.out.println(diamondSize);
    int mid = diamondSize / 2;

    if (diamondSize % 2 == 0){

      for (int i = 0; i <= mid ; i++){
        int stars = 2 * i;
        int spaces = (diamondSize - stars) / 2;
          for (int s = 0; s < spaces; s++){
            System.out.print(" ");
          }
          for (int star = 0; star < stars; star++){
            System.out.print("*");
          }
          System.out.println();
      }
      for (int i = mid - 1; i > 0; i--){
        int stars = 2 * i;
        int spaces = (diamondSize - stars) / 2;
          for (int s = 0; s < spaces; s++) {
             System.out.print(" ");
          }
          for (int star = 0; star < stars; star++){
            System.out.print("*");
          }
          System.out.println();
      }






    } else {
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
