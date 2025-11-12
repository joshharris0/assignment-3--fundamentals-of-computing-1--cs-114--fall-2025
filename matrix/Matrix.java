public class Matrix {
  private int[][] matrix;
  private int size;

  public Matrix(int size){
    this.matrix = new int[size][size];
    this.size = size;
    System.out.println("Created a matrix with dimensions " + size + "x" + size);
  }

  public void populateMatrix() {
    int index = 1;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = index++;
        // matrix[i][j] = 0;
      }
    }
  }

  public void printMatrix() {
    final String YELLOW = "\u001b[33m";
    final String NORMAL = "\u001b[0m";

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j == (size - 1) - i) {
          System.out.print(YELLOW + matrix[i][j] + NORMAL + "\t");
        } else {
          System.out.print(matrix[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void flipMatrix() {
  }


}
