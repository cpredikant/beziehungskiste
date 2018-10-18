package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ArbeitgeberArbeitgeberBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String vonArbeitgeberNr;

    private String zuArbeitgeberNr;

    private LocalDate beginn;

    private LocalDate ende;

}
