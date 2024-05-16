package Testes;

import TAD.Pilha;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pilha lista = new Pilha();

    char opcao;
    do {
      System.out.println("\nMenu:");
      System.out.println("a) Inserir novo nó");
      System.out.println("b) Remover último nó");
      System.out.println("c) Mostrar conteúdo do nó atual");
      System.out.println("d) Mostrar conteúdo do próximo nó");
      System.out.println("e) Mostrar conteúdo do nó anterior");
      System.out.println("f) Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.next().charAt(0);

      switch (opcao) {
        case 'a':
          System.out.print("Digite o item a ser inserido: ");
          int item = scanner.nextInt();
          lista.inserir(item);
          break;
        case 'b':
          lista.remover();
          break;
        case 'c':
          lista.mostrarAtual();
          break;
        case 'd':
          lista.mostrarProximo();
          break;
        case 'e':
          lista.mostrarAnterior();
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
