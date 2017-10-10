package ec.fin.banecuador.encuestas.negocio;

import ec.fin.banecuador.encuestas.datos.entidades.Pregunta;
import ec.fin.banecuador.encuestas.datos.repositorios.RepositorioPregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by raasanch on 29/09/2017.
 */
@Service
public class ServicioPregunta {

    private RepositorioPregunta repositorioPregunta;

    @Autowired
    public ServicioPregunta(
            RepositorioPregunta repositorioPregunta) {
        this.repositorioPregunta = repositorioPregunta;
    }

    public Pregunta obtenerPregunta(Integer id) {
        return repositorioPregunta.findById(id);
    }
}
