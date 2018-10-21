package de.cpredikant.beziehungskiste.service.arbeitnehmer;

import de.cpredikant.beziehungskiste.model.domain.partner.*;
import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitnehmerEntity;

public final class ArbeitnehmerMapper {

    private ArbeitnehmerMapper() {
        // Mapper
    }

    public static ArbeitnehmerEntity mappe(final Arbeitnehmer arbeitnehmer) {

        if (arbeitnehmer == null) {
            return null;
        }

        final ArbeitnehmerEntity ae = new ArbeitnehmerEntity();

        ae.setArbeitnehmerNr(arbeitnehmer.getArbeitnehmerNr());
        ae.setVersion(arbeitnehmer.getVersion());
        ae.setAnredeTyp(arbeitnehmer.getAnredeTyp());
        ae.setTitelTyp(arbeitnehmer.getTitelTyp());
        ae.setVorname(arbeitnehmer.getVorname());
        ae.setNachname(arbeitnehmer.getNachname());
        ae.setGeburtsdatum(arbeitnehmer.getGeburtsdatum());
        ae.setGeburtsort(arbeitnehmer.getGeburtsort());
        ae.setGeschlechtTyp(arbeitnehmer.getGeschlechtTyp());
        ae.setSozialversicherungsNr(arbeitnehmer.getSozialversicherungsNr());

        return ae;
    }

    public static Arbeitnehmer mappe(final ArbeitnehmerEntity arbeitnehmerEntity, final Adresse adresse, final Kontaktdaten kontaktdaten, final Emailadresse emailadresse, final Bankkonto bankkonto) {

        if (arbeitnehmerEntity == null) {
            return null;
        }

        final Arbeitnehmer a = new Arbeitnehmer();

        a.setArbeitnehmerNr(arbeitnehmerEntity.getArbeitnehmerNr());
        a.setVersion(arbeitnehmerEntity.getVersion());

        a.setAnredeTyp(arbeitnehmerEntity.getAnredeTyp());
        a.setTitelTyp(arbeitnehmerEntity.getTitelTyp());
        a.setVorname(arbeitnehmerEntity.getVorname());
        a.setNachname(arbeitnehmerEntity.getNachname());
        a.setGeburtsdatum(arbeitnehmerEntity.getGeburtsdatum());
        a.setGeburtsort(arbeitnehmerEntity.getGeburtsort());
        a.setGeschlechtTyp(arbeitnehmerEntity.getGeschlechtTyp());
        a.setSozialversicherungsNr(arbeitnehmerEntity.getSozialversicherungsNr());

        a.setAdresse(adresse);
        a.setKontaktdaten(kontaktdaten);
        a.setEmailadresse(emailadresse);
        a.setBankkonto(bankkonto);

        return a;
    }

    public static Arbeitnehmer mappe(final ArbeitnehmerEntity arbeitnehmerEntity) {

        if (arbeitnehmerEntity == null) {
            return null;
        }

        final Arbeitnehmer a = new Arbeitnehmer();

        a.setArbeitnehmerNr(arbeitnehmerEntity.getArbeitnehmerNr());
        a.setVersion(arbeitnehmerEntity.getVersion());

        a.setAnredeTyp(arbeitnehmerEntity.getAnredeTyp());
        a.setTitelTyp(arbeitnehmerEntity.getTitelTyp());
        a.setVorname(arbeitnehmerEntity.getVorname());
        a.setNachname(arbeitnehmerEntity.getNachname());
        a.setGeburtsdatum(arbeitnehmerEntity.getGeburtsdatum());
        a.setGeburtsort(arbeitnehmerEntity.getGeburtsort());
        a.setGeschlechtTyp(arbeitnehmerEntity.getGeschlechtTyp());
        a.setSozialversicherungsNr(arbeitnehmerEntity.getSozialversicherungsNr());


        return a;
    }
}
