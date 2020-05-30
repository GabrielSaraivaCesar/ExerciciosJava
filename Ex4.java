import java.util.Scanner;

public class Ex4 {
  
  public static void main(String[] args) {
    // Variaveis
    Integer[][] arr = new Integer[4][4];
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
    Integer[] vector = new Integer[0], tempVector;
    Integer col = 0, row = 0, number, counter = 0;

    while(row < arr.length) {
      number = arr[row][col];

      if (number % 5 == 0) {
        counter++;
        tempVector = new Integer[counter];
        for(int c = 0; c < vector.length; c++) {
          tempVector[c] = vector[c];
        }
        tempVector[counter-1] = number;

        vector = tempVector;
      }

      if (col == arr.length - 1) {
        col = 0;
        row++; 
      }
      else {
        col++;
      }
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