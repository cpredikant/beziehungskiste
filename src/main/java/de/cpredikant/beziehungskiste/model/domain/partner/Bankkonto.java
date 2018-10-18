package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Bankkonto implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String bic;

    private String iban;

    private String kontoNr;

    private String blz;

    private String kontoinhaber;

    private boolean winterbau;

    private boolean einzahlung;

    private boolean auszahlung;

    private boolean ausland;

}
