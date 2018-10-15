package de.cpredikant.beziehungskiste.model.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Kontaktdaten  implements Serializable {

    private String telefon;

    private String fax;

    private String mobil;

    private boolean hauptKontaktdaten;

}
