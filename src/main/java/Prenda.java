import java.awt.*;
import java.util.Optional;

public class Prenda {

  Trama trama;
  TipoPrenda tipoPrenda;
  Color colorPrincipal;
  Material material;
  Optional<Color> colorSecundario;
  Formalidad tipoFormalidad;

  Prenda(TipoPrenda tipoPrenda, Color colorPrincipal, Material material, Optional<Color> colorSecundario, Trama trama, Formalidad tipoFormalidad){
    this.tipoPrenda = tipoPrenda;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.tipoFormalidad = tipoFormalidad;
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


  public boolean esSuperior() {
    return this.tipoPrenda.devolverCategoria() == Categoria.PARTE_SUPERIOR;
  }

  public boolean isInformal() {
    return this.tipoFormalidad == Formalidad.INFORMAL;
  }

  public boolean esInferior() {
    return this.tipoPrenda.devolverCategoria() == Categoria.PARTE_INFERIOR;
  }

  public boolean esCalzado() {
    return this.tipoPrenda.devolverCategoria() == Categoria.CALZADO;
  }
}