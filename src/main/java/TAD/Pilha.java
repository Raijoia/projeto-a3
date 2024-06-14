package TAD;

public class Pilha {
  private NoLista inicio;
  private NoLista atual;
  private int quantidade;

  public Pilha() {
    this.inicio = null;
    this.atual = null;
    this.quantidade = 0;
  }

  public void inserir(String item) {
    NoLista novoNo = new NoLista(item);
    if (inicio == null) {
      inicio = novoNo;
      atual = novoNo;
    } else {
      novoNo.anterior = atual;
      atual.proximo = novoNo;
      atual = novoNo;
    }
    quantidade++;
  }

  public void remover() {
    if (atual != null) {
      if (atual.anterior != null) {
        atual.anterior.proximo = null;
        atual = atual.anterior;
      } else {
        inicio = null;
        atual = null;
      }
      quantidade--;
    }
  }

  public String mostrarAtual() {
    if (atual != null) {
      return atual.item;
    } else {
      return null;
    }
  }

  public void mostrarProximo() {
    if (atual != null && atual.proximo != null) {
      System.out.println("Conteúdo do próximo nó: " + atual.proximo.item);
    } else {
      System.out.println("Lista Encerrada");
    }
  }

  public void mostrarAnterior() {
    if (atual != null && atual.anterior != null) {
      System.out.println("Conteúdo do nó anterior: " + atual.anterior.item);
    } else {
      System.out.println("Lista Encerrada");
    }
  }

  public int mostrarQuantidade() {
    return quantidade;
  }
}