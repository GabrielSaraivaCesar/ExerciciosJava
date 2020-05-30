import java.util.Scanner;

class Ex18 {

  public static void main(String[] args) {
    // Variaveis
    Integer[] arr = new Integer[16];
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
    Integer maior = Integer.MIN_VALUE, quantidadeDivisores = 0, number;

    for (int counter = 0; counter < arr.length; counter++) {
      number = arr[counter];
      if (number > maior) {
        maior = number;
      }
    }

    for (int counter = maior; counter > 0; counter--) {
      if (maior % counter == 0) {
        quantidadeDivisores++;
      }
    }

    System.out
        .println("O maior numero do vetor é: " + maior + "\nE este valor tem " + quantidadeDivisores + " divisores");
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