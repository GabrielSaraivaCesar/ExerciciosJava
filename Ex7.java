import java.util.Scanner;

public class Ex7 {
  
  public static void main(String[] args) {
    // Variaveis
    Integer[][] arr = new Integer[5][5];
    Double maxItems = Math.pow(arr.length, 2);
    Integer row = 0, col = 0;

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
     
      arr[row][col] = 0;
      
      if (col == arr.length - 1) {
        col = 0;
        row++;
      }
      else {
       col++;
      }
    }

    // Execucao do exercicio proposto
    execise(arr);

  }

  public static void execise(Integer[][] arr) {
    Integer[] vector = new Integer[arr.length];
    Integer[][] resultArr = arr;
    Integer row = 0, col = 0;
    Scanner keyboard = new Scanner(System.in);

    for (int c = 0; c < vector.length; c++) {
      System.out.println("Digite um valor inteiro para adicionar no vetor (" + (c+1) + "/8):");
      vector[c] = keyboard.nextInt();
    }
    
    while (row < arr.length) {

      resultArr[row][col] = vector[col];
      
      col++;
      row++;
    }

    System.out.println("Matriz:");
    printArray(resultArr);

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