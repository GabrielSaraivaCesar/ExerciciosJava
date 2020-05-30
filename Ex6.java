import java.util.Scanner;

public class Ex6 {

  public static void main(String[] args) {
    // Variaveis
    Integer[][] arr = new Integer[5][5], arr2 = new Integer[5][5];
    Double maxItems = Math.pow(arr.length, 2);
    Integer row = 0, col = 0;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz 1
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println(
          "Digite um numero inteiro para acrecentar na primeira matriz: (" + (counter + 1) + "/" + maxItems + ")");
      arr[row][col] = keyboard.nextInt();

      if (col == arr.length - 1) {
        col = 0;
        row++;
      } else {
        col++;
      }
    }
    System.out.println("Primeira matriz:");
    printArray(arr);

    row = 0;
    col = 0;
    // Montagem da matriz 2
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println(
          "Digite um numero inteiro para acrecentar na segunda matriz: (" + (counter + 1) + "/" + maxItems + ")");
      arr2[row][col] = keyboard.nextInt();

      if (col == arr2.length - 1) {
        col = 0;
        row++;
      } else {
        col++;
      }
    }
    System.out.println("Segunda matriz:");
    printArray(arr2);

    // Execucao do exercicio proposto
    execise(arr, arr2);

  }

  public static void execise(Integer[][] arr, Integer[][] arr2) {
    Integer[][] result = new Integer[arr.length][arr.length];
    Integer nextNumber;

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr.length; col++) {
        nextNumber = 0;

        for (int pointer = 0; pointer < arr.length; pointer++) {
          nextNumber += arr[row][pointer] * arr2[pointer][col];
        }

        result[row][col] = nextNumber;
      }
    }

    System.out.println("Produto das matrizes:");
    printArray(result);

  }

  public static void printArray(Integer[][] arr) {
    String result = "";
    for (int counter = 0; counter < arr.length; counter++) {
      for (int counterB = 0; counterB < arr[counter].length; counterB++) {
        if (arr[counter][counterB] == null) {
          break;
        }
        if (counterB == 0) {
          result += "[";
        }

        result += arr[counter][counterB].toString();

        if (counterB == arr[counter].length - 1) {
          result += "]\n";
        } else {
          result += ", ";
        }
      }
    }
    System.out.println(result);
  }
}