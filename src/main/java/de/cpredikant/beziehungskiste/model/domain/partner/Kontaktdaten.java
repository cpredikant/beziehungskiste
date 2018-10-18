package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Kontaktdaten implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String telefonNr;

    private String faxNr;

    private String mobilNr;

    private boolean hauptKontaktdaten;

}
