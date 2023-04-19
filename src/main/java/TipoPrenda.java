public class TipoPrenda {
  Categoria categoria;

  TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }

  public boolean concideConCategoria(Categoria unaCategoria) {
    return categoria == unaCategoria;
  }

  public Categoria devolverCategoria(){
    return this.categoria;
  }
}
