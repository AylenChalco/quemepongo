import java.awt.*;
import java.util.Optional;

public class Prenda {

  Trama trama;
  TipoPrenda tipoPrenda;
  Color colorPrincipal;
  Material material;
  Optional<Color> colorSecundario;

  Prenda(TipoPrenda tipoPrenda, Color colorPrincipal, Material material, Optional<Color> colorSecundario, Trama trama){
    this.tipoPrenda = tipoPrenda;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Categoria identificarCategoria(){
    return this.tipoPrenda.devolverCategoria();
  }
  public Color getColorPrincipal(){
    return this.colorPrincipal;
  }
  public Optional<Color> getColorSecundario(){
    return this.colorSecundario;
  }
  public Material getMaterial(){
    return this.material;
  }
  public Trama getTrama(){
    return this.trama;
  }




}