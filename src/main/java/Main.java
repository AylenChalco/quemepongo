import java.awt.*;

public class Main {
  public static void main(String[] args) {
//PRUEBAS
  TipoPrenda remera = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  BuilderPrenda borrador = new BuilderPrenda(remera);

  borrador.agregarTrama(Trama.LISA);
  borrador.agregarColorPrimario(Color.GREEN);
  borrador.agregarColorSecundario(Color.BLACK);
  borrador.agregarMaterial(Material.PLASTICO);
  Prenda prenda = borrador.crearPrenda();

    System.out.println("La prenda creada es una : " + prenda.identificarCategoria());
    System.out.println("Tiene color principal: " + prenda.getColorPrincipal());
    System.out.println("Tiene color secundario: " + prenda.getColorSecundario());
    System.out.println("Es de material: " + prenda.getMaterial());
    System.out.println("Tiene trama: " + prenda.getTrama());

  }
}
