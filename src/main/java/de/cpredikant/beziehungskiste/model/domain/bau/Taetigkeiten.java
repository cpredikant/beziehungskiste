package de.cpredikant.beziehungskiste.model.domain.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.TaetigkeitTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class Taetigkeiten implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private TaetigkeitTyp taetigkeitTyp;

    private String prozentsatz;


}
