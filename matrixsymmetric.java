import java.util.Scanner;

public class matrixsymmetric{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read matrix dimensions
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        // If it's not a square matrix, it's not symmetric
        int[][] matrix = new int[n][n];
        
        // Read the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check for symmetry
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        // Output the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        scanner.close();
    }
}

