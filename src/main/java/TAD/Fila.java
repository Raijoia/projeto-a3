package TAD;

public class Fila {
  private NoLista inicio;
  private NoLista fim;

  public Fila() {
    this.inicio = null;
    this.fim = null;
  }

  public void inserir(String item) {
    NoLista novoNo = new NoLista(item);
    if (inicio == null) {
      inicio = novoNo;
      fim = novoNo;
    } else {
      fim.proximo = novoNo;
      novoNo.anterior = fim;
      fim = novoNo;
    }
  }

  public void remover() {
    if (inicio != null) {
      if (inicio.proximo != null) {
        inicio = inicio.proximo;
        inicio.anterior = null;
      } else {
        inicio = null;
        fim = null;
      }
    }
  }

  public String mostrarPrimeiro() {
    if (inicio != null) {
        return inicio.item;
    } else {
        return null;
    }
  }

  public void mostrarUltimo() {
    if (fim != null) {
      System.out.println("Conteúdo do último nó: " + fim.item);
    } else {
      System.out.println("Fila vazia");
    }
  }
}
