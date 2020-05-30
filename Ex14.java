import java.util.Scanner;

class Ex14 {

  public static void main(String[] args) {
    // Variaveis
    Integer[] arr = new Integer[20];
    Integer maxItems = arr.length;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println("Digite um numero inteiro para acrecentar no vetor:");
      arr[counter] = keyboard.nextInt();

      printArray(arr);
    }

    // Execucao do exercicio proposto
    execise(arr);

  }

  public static void execise(Integer[] arr) {
    Integer[] result = new Integer[0];
    Integer number;

    for (int counter = 0; counter < arr.length; counter++) {
      number = arr[counter];
      if (number % 2 != 0) {
        result = arrayPush(result, number);
      }
    }

    System.out.println("Vetor inicial:");
    printArray(arr);

    System.out.println("Vetor de impares:");
    printArray(result);
  }

  public static Integer[] arrayPush(Integer[] arr, Integer item) {
    Integer[] tempArray = new Integer[arr.length + 1];
    for (int counter = 0; counter < arr.length; counter++) {
      tempArray[counter] = arr[counter];
    }
    tempArray[tempArray.length - 1] = item;
    return tempArray;
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