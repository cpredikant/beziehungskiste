package de.cpredikant.beziehungskiste.model.domain.util;

import de.cpredikant.beziehungskiste.model.domain.partner.*;
import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.EmailadresseTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.GeschlechtTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;

import java.time.LocalDate;

public final class PartnerGenerator {

    private PartnerGenerator() {
        // Utils-Class
    }


    public static Arbeitnehmer erzeugeArbeitnehmer(final String arbeitnehmerNr) {

        final Arbeitnehmer arbeitnehmer = new Arbeitnehmer();

        arbeitnehmer.setArbeitnehmerNr(arbeitnehmerNr);

        arbeitnehmer.setAnredeTyp(AnredeTyp.HERR);
        arbeitnehmer.setTitelTyp(TitelTyp.PROFESSOR);
        arbeitnehmer.setGeburtsdatum(LocalDate.now());
        arbeitnehmer.setGeburtsort("Hier");
        arbeitnehmer.setGeschlechtTyp(GeschlechtTyp.MAENNLICH);
        arbeitnehmer.setNachname("Muster");
        arbeitnehmer.setVorname("Max");
        arbeitnehmer.setSozialversicherungsNr("987654321");

        final Adresse adresse = new Adresse();

        adresse.setStrasse("Meine Straße");
        adresse.setHausNr("99a");
        adresse.setPlz("65549");
        adresse.setStadt("Limburg");
        adresse.setBundesland("Hessen");
        adresse.setLand("Deutschland");

        adresse.setAusland(false);
        adresse.setHauptAdresse(true);

        final Kontaktdaten kontaktdaten = new Kontaktdaten();
        kontaktdaten.setTelefonNr("+49643112345678");
        kontaktdaten.setHauptKontaktdaten(true);

        final Emailadresse emailadresse = new Emailadresse();
        emailadresse.setEmail("test@test.de");
        emailadresse.setEmailadresseTyp(EmailadresseTyp.KONTAKT);
        emailadresse.setHauptEmailadresse(true);

        final Bankkonto bankkonto = new Bankkonto();

        bankkonto.setKontoinhaber(arbeitnehmer.getVorname() + " " + arbeitnehmer.getNachname());

        bankkonto.setBic("LMAAXYZ");
        bankkonto.setIban("DE14123234113214214321");

        bankkonto.setAusland(false);
        bankkonto.setAuszahlung(true);
        bankkonto.setEinzahlung(false);
        bankkonto.setWinterbau(false);


        arbeitnehmer.setAdresse(adresse);
        arbeitnehmer.setKontaktdaten(kontaktdaten);
        arbeitnehmer.setEmailadresse(emailadresse);
        arbeitnehmer.setBankkonto(bankkonto);
        return arbeitnehmer;
    }
}
