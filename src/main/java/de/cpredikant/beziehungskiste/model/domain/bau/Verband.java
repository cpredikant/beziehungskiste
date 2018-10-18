package de.cpredikant.beziehungskiste.model.domain.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.VerbandTyp;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Verband implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String arbeitgeberNr;

    private VerbandTyp verbandTyp;

    private LocalDate beginnDatum;

    private LocalDate endeDatum;

}
