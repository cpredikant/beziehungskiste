package de.cpredikant.beziehungskiste.model.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Adresse implements Serializable {

    private String strasse;

    private String hausnummer;

    private String plz;

    private String stadt;

    private String land;

    private String beundesland;

    private String postfach;

    private boolean hauptadresse;

    private boolean ausland;

}
