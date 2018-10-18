package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "bankkonto")
public class Bankkonto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "bankkonto_gen", sequenceName = "bankkonto_seq")
    @GeneratedValue(generator = "bankkonto_gen")
    private Long id;

    @Version
    private Long version;

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
