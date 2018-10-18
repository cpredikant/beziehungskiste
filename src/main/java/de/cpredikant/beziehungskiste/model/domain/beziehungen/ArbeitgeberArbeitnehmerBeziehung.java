package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import de.cpredikant.beziehungskiste.model.enums.beziehungen.BeziehungsTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data

public class ArbeitgeberArbeitnehmerBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String vonArbeitgeberNr;

    private String zuArbeitnehmerNr;

    private BeziehungsTyp beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
