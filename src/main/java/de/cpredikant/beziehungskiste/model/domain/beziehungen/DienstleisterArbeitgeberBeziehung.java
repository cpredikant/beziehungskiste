package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class DienstleisterArbeitgeberBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String vonDienstleisterNr;

    private String zuArbeitgeberNr;

    private LocalDate beginn;

    private LocalDate ende;

}
