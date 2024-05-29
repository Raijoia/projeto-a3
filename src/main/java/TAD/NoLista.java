package TAD;

public class NoLista {
  String item;
  NoLista anterior;
  NoLista proximo;

  public NoLista(String item) {
    this.item = item;
    this.anterior = null;
    this.proximo = null;
  }
}
