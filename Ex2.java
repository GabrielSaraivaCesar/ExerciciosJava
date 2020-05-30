import java.util.Scanner;

public class Ex2 {
  
  public static void main(String[] args) {
    // Variaveis
    Double[][] arr = new Double[5][5];
    Double maxItems = Math.pow(arr.length, 2);
    Integer row = 0, col = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println(maxItems);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println("Digite um numero real para acrecentar na matriz:");
      arr[row][col] = keyboard.nextDouble();
      
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

  public static void execise(Double[][] arr) {
    Integer row = 0, col = arr.length - 1;
    Double produto = 1.0, number;

    for(int counter = 0; counter < arr.length; counter++) {
      number = arr[row][col];
      
      if ((row+1) % 2 == 0 && number < 50) {
        produto = produto* number;
      }

      row++;
      col--;
    }

    System.out.println("Produto dos numeros situados nas linhas pares da diagonal secundaria menores do que 50:");
    System.out.println(produto);
  }

  public static void printArray(Double[][] arr) {
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
}