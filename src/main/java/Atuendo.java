import java.util.Set;

public class Atuendo {
  Prenda superior;
  Prenda inferior;
  Prenda calzado;
  Set<Prenda> accesorios;

  public Atuendo (Prenda superior, Prenda inferior, Prenda calzado, Set<Prenda> accesorios){
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
    this.accesorios = accesorios;
  }

}



