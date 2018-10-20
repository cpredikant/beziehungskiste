package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String strasse;

    private String hausNr;

    private String plz;

    private String stadt;

    private String land;

    private String bundesland;

    private String postfach;

    private boolean hauptAdresse;

    private boolean ausland;

}
