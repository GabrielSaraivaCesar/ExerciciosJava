import java.util.Scanner;

class Ex17 {

  public static void main(String[] args) {
    // Variaveis
    Integer[][] arr = new Integer[4][4];
    Integer[] arrB = new Integer[4];
    Integer maxItems = arr.length * arr[0].length;
    Integer row = 0, col = 0;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
      arr[row][col] = 0;

      if (col == arr[row].length - 1) {
        col = 0;
        row++;
      } else {
        col++;
      }

    }

    for (int counter = 0; counter < arrB.length; counter++) {
      System.out.println("Digite um valor inteiro para inserir no vetor:");
      arrB[counter] = keyboard.nextInt();

      printArray(arrB);

    }

    // Execucao do exercicio proposto
    execise(arr, arrB);

  }

  public static void execise(Integer[][] arr, Integer[] vector) {
    Integer[][] result = arr;
    Integer col = arr[0].length - 1;

    for (int row = 0; row < arr.length; row++) {
      result[row][col] = vector[row];

      col--;
    }

    System.out.println("Vetor:");
    printArray(vector);

    System.out.println("Matriz:");
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

  public static void printArray(Integer[] arr) {
    String result = "";
    for (int counter = 0; counter < arr.length; counter++) {
      if (arr[counter] == null) {
        break;
      }
      if (counter == 0) {
        result += "[";
      }

      result += arr[counter].toString();

      if (counter == arr.length - 1) {
        result += "]\n";
      } else {
        result += ", ";
      }
    }
    System.out.println(result);
  }
}