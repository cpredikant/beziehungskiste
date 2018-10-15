package de.cpredikant.beziehungskiste.model.beziehungen;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class DienstleisterArbeitgeberBeziehung implements Serializable {

    private String vonDienstleisterNr;

    private String zuArbeitgeberNr;

    private String beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
