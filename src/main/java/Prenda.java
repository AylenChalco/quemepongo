import java.awt.*;
import java.util.Objects;
import java.util.Optional;

public class Prenda {

  Trama trama;
  TipoPrenda tipoPrenda;
  Color colorPrincipal;
  Material material;
  Optional<Color> colorSecundario;

  Prenda(TipoPrenda tipoPrenda, Color colorPrincipal, Material material, Optional<Color> colorSecundario, Trama trama){
    Objects.requireNonNull(tipoPrenda, "Falta tipo");
    Objects.requireNonNull(colorPrincipal, "Falta color principal");
    Objects.requireNonNull(material, "falta material");
    this.tipoPrenda = tipoPrenda;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario;
  }

  public Categoria identificarCategoria(){
    return this.tipoPrenda.devolverCategoria();
  }

}