import java.util.Scanner;

public class MultiplicacaoMatrizes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Requisito 01: Ler o tamanho e os elementos das matrizes
    System.out.println("Informe o número de linhas da matriz A: ");
    int linhasA = scanner.nextInt();
    System.out.println("Informe o número de colunas da matriz A: ");
    int colunasA = scanner.nextInt();

    int[][] matrizA = new int[linhasA][colunasA];
    System.out.println("Informe os elementos da matriz A:");
    for (int i = 0; i < linhasA; i++) {
      for (int j = 0; j < colunasA; j++) {
        System.out.printf("Elemento [%d,%d]: ", i + 1, j + 1);
        matrizA[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Informe o número de linhas da matriz B: ");
    int linhasB = scanner.nextInt();
    System.out.println("Informe o número de colunas da matriz B: ");
    int colunasB = scanner.nextInt();

    // Requisito 02: Verificar se a multiplicação é possível
    if (colunasA != linhasB) {
      System.out.println(
          "A multiplicação não é possível. O número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
      return;
    }

    int[][] matrizB = new int[linhasB][colunasB];
    System.out.println("Informe os elementos da matriz B:");
    for (int i = 0; i < linhasB; i++) {
      for (int j = 0; j < colunasB; j++) {
        System.out.printf("Elemento [%d,%d]: ", i + 1, j + 1);
        matrizB[i][j] = scanner.nextInt();
      }
    }

    // Requisito 03: Multiplicação das matrizes
    int[][] matrizC = new int[linhasA][colunasB];

    for (int i = 0; i < linhasA; i++) {
      for (int j = 0; j < colunasB; j++) {
        matrizC[i][j] = 0;
        for (int k = 0; k < colunasA; k++) {
          matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
        }
      }
    }

    // Requisito 04: Apresentar as matrizes e o resultado da multiplicação
    System.out.println("\nMatriz A:");
    exibirMatriz(matrizA);

    System.out.println("\nMatriz B:");
    exibirMatriz(matrizB);

    System.out.println("\nMatriz C (resultado da multiplicação):");
    exibirMatriz(matrizC);
  }

  // Método para exibir uma matriz
  public static void exibirMatriz(int[][] matriz) {
    for (int[] linha : matriz) {
      for (int elemento : linha) {
        System.out.print(elemento + "\t");
      }
      System.out.println();
    }
  }
}
