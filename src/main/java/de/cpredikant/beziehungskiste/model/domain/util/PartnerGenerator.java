package de.cpredikant.beziehungskiste.model.domain.util;

import de.cpredikant.beziehungskiste.model.domain.partner.*;
import de.cpredikant.beziehungskiste.model.enums.bau.VertreterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.*;

import java.time.LocalDate;
import java.util.Arrays;

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

        final Adresse adresse = PartnerGenerator.erzeugeAdresse();
        final Kontaktdaten kontaktdaten = PartnerGenerator.erzeugeKontaktdaten();
        final Emailadresse emailadresse = PartnerGenerator.erzeugeEmailadresse();
        final Bankkonto bankkonto = PartnerGenerator.erzeugeBankkonto(arbeitnehmer.getVorname(), arbeitnehmer.getNachname());

        arbeitnehmer.setAdresse(adresse);
        arbeitnehmer.setKontaktdaten(kontaktdaten);
        arbeitnehmer.setEmailadresse(emailadresse);
        arbeitnehmer.setBankkonto(bankkonto);

        return arbeitnehmer;
    }

    public static Arbeitgeber erzeugeArbeitgeber(final String arbeitgeberNr) {

        final Arbeitgeber a = new Arbeitgeber();

        a.setArbeitgeberNr(arbeitgeberNr);
        a.setAnredeTyp(AnredeTyp.FIRMA);
        a.setRechtsformTyp(RechtsformTyp.GMBH);
        a.setFirmenname("Janosh & Schnuddelbuddel Hausbau");

        a.setAdresse(PartnerGenerator.erzeugeAdresse());
        a.setKontaktdaten(Arrays.asList(PartnerGenerator.erzeugeKontaktdaten()));
        a.setEmailadressen(Arrays.asList(PartnerGenerator.erzeugeEmailadresse()));
        a.setKontaktpersonen(Arrays.asList(PartnerGenerator.erzeugeKontaktperson()));
        a.setBankkonten(Arrays.asList(PartnerGenerator.erzeugeBankkonto(a.getAnredeTyp().name(), a.getFirmenname())));
        a.setVertreter(Arrays.asList(PartnerGenerator.erzeugeVertreter()));

        return a;
    }

    private static Adresse erzeugeAdresse() {

        final Adresse adresse = new Adresse();

        adresse.setStrasse("Meine Straße");
        adresse.setHausNr("99a");
        adresse.setPlz("65549");
        adresse.setStadt("Limburg");
        adresse.setBundesland("Hessen");
        adresse.setLand("Deutschland");

        adresse.setAusland(false);
        adresse.setHauptAdresse(true);

        return adresse;
    }

    private static Kontaktdaten erzeugeKontaktdaten() {

        final Kontaktdaten kontaktdaten = new Kontaktdaten();

        kontaktdaten.setTelefonNr("+49643112345678");
        kontaktdaten.setHauptKontaktdaten(true);

        return kontaktdaten;
    }

    private static Emailadresse erzeugeEmailadresse() {

        final Emailadresse emailadresse = new Emailadresse();
        emailadresse.setEmail("test@test.de");
        emailadresse.setEmailadresseTyp(EmailadresseTyp.KONTAKT);
        emailadresse.setHauptEmailadresse(true);

        return emailadresse;
    }

    private static Kontaktperson erzeugeKontaktperson() {
        final Kontaktperson kontaktperson = new Kontaktperson();

        kontaktperson.setKontaktPersonTyp(KontaktpersonTyp.DIENSTLEISTER);
        kontaktperson.setAnredeTyp(AnredeTyp.HERR);
        kontaktperson.setTitelTyp(TitelTyp.DR);
        kontaktperson.setVorname("John");
        kontaktperson.setNachname("Zoidberg");

        return kontaktperson;
    }

    private static Bankkonto erzeugeBankkonto(final String vorname, final String nachname) {
        final Bankkonto bankkonto = new Bankkonto();

        bankkonto.setKontoinhaber(vorname + " " + nachname);

        bankkonto.setBic("LMAAXYZ");
        bankkonto.setIban("DE14123234113214214321");

        bankkonto.setAusland(false);
        bankkonto.setAuszahlung(true);
        bankkonto.setEinzahlung(false);
        bankkonto.setWinterbau(false);

        return bankkonto;
    }

    private static Vertreter erzeugeVertreter() {
        final Vertreter vertreter = new Vertreter();

        vertreter.setVertreterTyp(VertreterTyp.GESCHAEFTSFUEHRER);
        vertreter.setAnredeTyp(AnredeTyp.HERR);
        vertreter.setTitelTyp(TitelTyp.PROFESSOR);
        vertreter.setVorname("Hubert");
        vertreter.setNachname("Farnsworth");

        return vertreter;
    }
}
