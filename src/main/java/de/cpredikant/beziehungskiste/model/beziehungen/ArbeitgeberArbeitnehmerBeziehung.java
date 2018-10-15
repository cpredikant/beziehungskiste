package de.cpredikant.beziehungskiste.model.beziehungen;

import java.io.Serializable;
import java.time.LocalDate;

public class ArbeitgeberArbeitnehmerBeziehung implements Serializable {

    private String vonArbeitgeberNr;

    private String zuArbeitnehmerNr;

    private String beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
