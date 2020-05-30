import java.util.Scanner;

class Ex15 {

  public static void main(String[] args) {
    // Variaveis
    Integer[] arr = new Integer[16];
    Integer maxItems = arr.length;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println("Digite um numero inteiro positivo para acrecentar no vetor:");
      arr[counter] = keyboard.nextInt();

      printArray(arr);
    }

    // Execucao do exercicio proposto
    execise(arr);

  }

  public static void execise(Integer[] arr) {
    Integer[] result = new Integer[arr.length];

    for (int counter = 0; counter < arr.length; counter++) {
      result[counter] = getFactorial(arr[counter]);
    }

    System.out.println("Vetor original");
    printArray(arr);

    System.out.println("Vetor de fatoriais");
    printArray(result);
  }

  public static Integer getFactorial(Integer number) {
    Integer factorial = 1, counter = number;

    while (counter > 1) {
      factorial *= counter;
      counter--;
    }

    return factorial;
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