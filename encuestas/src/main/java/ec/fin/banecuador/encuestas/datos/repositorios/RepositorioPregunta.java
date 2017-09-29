package ec.fin.banecuador.encuestas.datos.repositorios;

import ec.fin.banecuador.encuestas.datos.entidades.Pregunta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by raasanch on 29/09/2017.
 */
public interface RepositorioPregunta extends PagingAndSortingRepository<Pregunta, Integer> {

  @Override
  Page<Pregunta> findAll(Pageable pageable);

}
