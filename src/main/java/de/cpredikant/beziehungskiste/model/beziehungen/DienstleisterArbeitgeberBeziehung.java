package de.cpredikant.beziehungskiste.model.beziehungen;

import java.io.Serializable;
import java.time.LocalDate;

public class DienstleisterArbeitgeberBeziehung implements Serializable {

    private String vonDienstleisterNr;

    private String zuArbeitgeberNr;

    private String beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
