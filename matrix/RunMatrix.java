import java.util.Scanner;

public class RunMatrix{
  public static void main(String[] args) {
    Matrix matrix = new Matrix(4);
    matrix.printMatrix();
    System.out.println();

    matrix.populateMatrix();
    matrix.printMatrix();
    System.out.println();

    matrix.flipMatrix();
    matrix.printMatrix();
  }
}
