import java.awt.*;
import java.util.Objects;
import java.util.Optional;

public class BorradorPrenda {
  Trama trama;
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Formalidad formalidad;

  BorradorPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
    this.trama = Trama.LISA;
  }
  void agregarMaterial(Material material) {
    this.material = material;
  }
  void agregarColorPrimario(Color colorPrimario) {
    this.colorPrincipal = colorPrimario;
  }
  void agregarColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
  void agregarTrama(Trama trama) {
    this.trama = trama;
  }
  public void indicarFormalidad(Formalidad formalidad) {
    this.formalidad = formalidad;
  }

  public Prenda crearPrenda() {
    Objects.requireNonNull(tipoPrenda, "Falta el tipo");
    Objects.requireNonNull(colorPrincipal, "Falta color el principal");
    Objects.requireNonNull(material, "Falta el material");
    return new Prenda(tipoPrenda, colorPrincipal, material, Optional.ofNullable(colorSecundario), trama, formalidad);
  }
}
