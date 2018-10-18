package de.cpredikant.beziehungskiste.model.domain.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.TaetigkeitTyp;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Taetigkeiten implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String arbeitgeberNr;

    private TaetigkeitTyp taetigkeitTyp;

    private BigDecimal prozentsatz;

    private LocalDate beginnDatum;

    private LocalDate endeDatum;

}
