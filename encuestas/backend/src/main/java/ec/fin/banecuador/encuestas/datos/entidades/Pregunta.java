package ec.fin.banecuador.encuestas.datos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by raasanch on 29/09/2017.
 */
@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "texto")
    private String texto;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
