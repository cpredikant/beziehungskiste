package de.cpredikant.beziehungskiste.model.partner;

import java.io.Serializable;

public class Bankkonto implements Serializable {

    private String bic;

    private String iban;

    private String kontonummer;

    private String blz;

    private String kontoinhaber;

    private boolean winterbau;

    private boolean einzahlung;

    private boolean auszahlung;

    private boolean ausland;

}
