package ec.fin.banecuador.encuestas.web.servicios;

import ec.fin.banecuador.encuestas.datos.entidades.Pregunta;
import ec.fin.banecuador.encuestas.negocio.ServicioPregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raasanch on 29/09/2017.
 */
@RestController
@RequestMapping(path = "/api")
public class ServicioControladorPregunta {

    @Autowired
    ServicioPregunta servicioPregunta;

    @RequestMapping(method = RequestMethod.GET, path = "/pregunta/{id}")
    public Pregunta obtenerPregunta(@PathVariable int id) {
        return servicioPregunta.obtenerPregunta(id);
    }

}
