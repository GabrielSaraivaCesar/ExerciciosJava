import java.util.Scanner;

class Ex16 {

  public static void main(String[] args) {
    // Variaveis
    Integer[] arr = new Integer[16];
    Integer maxItems = arr.length, number = 5;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {

      arr[counter] = number;
      if (counter % 2 == 0) {
        number++;
      } else {
        number += 5;
      }

    }

    // Execucao do exercicio proposto
    System.out.println("Resultado:");
    printArray(arr);
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