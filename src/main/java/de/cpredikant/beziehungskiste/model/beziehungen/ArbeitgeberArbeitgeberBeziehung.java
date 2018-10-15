package de.cpredikant.beziehungskiste.model.beziehungen;

import java.io.Serializable;
import java.time.LocalDate;

public class ArbeitgeberArbeitgeberBeziehung implements Serializable {

    private String vonArbeitgeberNr;

    private String zuArbeitgeberNr;

    private String beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
