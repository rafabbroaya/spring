package ec.fin.banecuador.encuestas.datos.repositorios;

import ec.fin.banecuador.encuestas.datos.entidades.Pregunta;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raasanch on 29/09/2017.
 */
public interface RepositorioPregunta extends CrudRepository<Pregunta, Integer> {

    Pregunta findById(int id);
}
