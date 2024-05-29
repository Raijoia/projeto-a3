package Testes;

import TAD.Fila;

import java.util.Scanner;

public class TesteFila {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Fila lista = new Fila();

    char opcao;
    do {
      System.out.println("\nMenu:");
      System.out.println("a) Inserir novo nó");
      System.out.println("b) Remover primeiro nó da lista");
      System.out.println("c) Mostrar conteúdo do inicio");
      System.out.println("d) Mostrar conteúdo do final");
      System.out.println("f) Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.next().charAt(0);

      switch (opcao) {
        case 'a':
          System.out.print("Digite o item a ser inserido: ");
          String item = scanner.next();
          lista.inserir(item);
          break;
        case 'b':
          lista.remover();
          break;
        case 'c':
          lista.mostrarPrimeiro();
          break;
        case 'd':
          lista.mostrarUltimo();
          break;
        case 'f':
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 'f');
    scanner.close();
  }
}
