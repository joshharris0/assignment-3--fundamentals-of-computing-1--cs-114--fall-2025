import java.util.Scanner;

public class RunMatrix{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the size of your matrix: ");
    int size = scanner.nextInt();
    Matrix matrix = new Matrix(size);
    matrix.printMatrix();
    System.out.println();

    matrix.populateMatrix();
    matrix.printMatrix();
    System.out.println();

    matrix.flipMatrix();
    matrix.printMatrix();
  }
}
