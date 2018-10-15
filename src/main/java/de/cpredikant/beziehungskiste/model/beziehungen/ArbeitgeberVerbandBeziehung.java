package de.cpredikant.beziehungskiste.model.beziehungen;

import java.io.Serializable;
import java.time.LocalDate;

public class ArbeitgeberVerbandBeziehung implements Serializable {

    private String vonArbeitgeberNr;

    private String zuVerbandNr;

    private String beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
