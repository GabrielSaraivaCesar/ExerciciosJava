import java.util.Scanner;

public class Ex5 {
  
  public static void main(String[] args) {
    // Variaveis
    Integer[][] arr = new Integer[8][8];
    Double maxItems = Math.pow(arr.length, 2);
    Integer row = 0, col = 0;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println("Digite um numero inteiro para acrecentar na matriz:");
      arr[row][col] = keyboard.nextInt();
      
      if (col == arr.length - 1) {
        col = 0;
        row++;
      }
      else {
       col++;
      }

      printArray(arr);
    }

    // Execucao do exercicio proposto
    execise(arr);

  }

  public static void execise(Integer[][] arr) {
    Integer[] vector = new Integer[8];
    Integer col = 0, row = 0, number;

    while(row < arr.length) {
      number = arr[row][1];

      vector[row] = number;

      row++;
    }

    System.out.println("Matriz:");
    printArray(arr);

    System.out.println("Vetor:");
    printArray(vector);
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
          }
          else {
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
      }
      else {
        result += ", ";
      }
    }
    System.out.println(result);
  }
}