import java.util.Scanner;

class Ex19 {

  public static void main(String[] args) {
    // Variaveis
    Integer[] arr = new Integer[25];
    Integer maxItems = arr.length;
    Scanner keyboard = new Scanner(System.in);

    // Montagem da matriz
    for (int counter = 0; counter < maxItems; counter++) {
      System.out.println("Digite um numero inteiro para acrescentar no vetor:");
      arr[counter] = keyboard.nextInt();

      printArray(arr);
    }

    // Execucao do exercicio proposto
    execise(arr);

  }

  public static void execise(Integer[] arr) {
    Integer produto = 1, number;

    for (int counter = 0; counter < arr.length; counter++) {
      number = arr[counter];
      if (number % 5 == 0 && number % 7 == 0) {
        produto *= number;
      }
    }

    System.out.println("Produto dos numeros multiplos de 5 e 7 ao mesmo tempo: ");
    System.out.println(produto);
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