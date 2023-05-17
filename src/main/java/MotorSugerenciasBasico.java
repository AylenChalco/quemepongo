import com.google.common.collect.Lists;
import java.util.List;

public class MotorSugerenciasBasico implements  MotorSugerencias{
  public List<Sugerencia> generarSugerencias(Usuario usuario){
    List<Prenda> prendasSuperiores = usuario.getPrendas().stream().filter(Prenda::esSuperior).toList();
    List<Prenda> prendasInferiores = usuario.getPrendas().stream().filter(Prenda::esInferior).toList();
    List<Prenda> calzados = usuario.getPrendas().stream().filter(Prenda::esCalzado).toList();

    List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).toList();
    //return combinaciones.stream().map(c -> new Sugerencia(c[0], c[1], c[2]));
  }
}
