import java.awt.*;

public class Prenda {

  TipoPrenda tipoPrenda;
  Color colorPrincipal;
  Material material;
  Color colorSecundario;

  Prenda(TipoPrenda tipoPrenda, Color colorPrincipal, Material material, Color colorSecundario){
    this.tipoPrenda = tipoPrenda;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario;
  }

  Prenda(TipoPrenda tipoPrenda, Color colorPrincipal, Material material){
    this.tipoPrenda = tipoPrenda;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = null;
  }
  //Como usuarie de QuéMePongo, quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).
  public void indicarTipo(TipoPrenda tipoPrenda){
    this.tipoPrenda = tipoPrenda;
  }

  //Como usuarie de QuéMePongo, quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).
  /*indentificar se refiere a especificar mi categoria o simplemente devolver la categoria?*/
  public Categoria identificarCategoria(){
    return this.tipoPrenda.devolverCategoria();
  }

  // Como usuarie de QuéMePongo, quiero poder indicar de qué tela o material está hecha una prenda
  public void indicarMaterial(Material material){
    this.material = material;
  }

  //Como usuarie de QuéMePongo, quiero poder indicar un color principal para mis prendas
  public void indicarColorPrimario(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
  }

  //Como usuarie de QuéMePongo, quiero poder indicar, si existe, un color secundario para mis prendas.
  public void indicarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  public boolean esValida() {
    return tieneTodosTipos();
  }

    private boolean tieneTodosTipos() {
    return tipoPrenda!= null && colorPrincipal!= null && material!= null; //Por default, borrar despues
    /*Si la prenda se instancia con el constrctor¿Los valores ya cumplen este requisito por defecto?
     * */
  }
}