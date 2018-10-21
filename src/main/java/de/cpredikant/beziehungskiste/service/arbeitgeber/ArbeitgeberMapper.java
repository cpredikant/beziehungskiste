package de.cpredikant.beziehungskiste.service.arbeitgeber;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitgeber;
import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitgeberEntity;

public final class ArbeitgeberMapper {

    private ArbeitgeberMapper() {
        // Mapper
    }

    public static ArbeitgeberEntity mappe(final Arbeitgeber arbeitgeber) {

        if (arbeitgeber == null) {
            return null;
        }

        final ArbeitgeberEntity ae = new ArbeitgeberEntity();

        ae.setArbeitgeberNr(arbeitgeber.getArbeitgeberNr());
        ae.setVersion(arbeitgeber.getVersion());

        ae.setRechtsformTyp(arbeitgeber.getRechtsformTyp());
        ae.setFirmenname(arbeitgeber.getFirmenname());
        ae.setAnredeTyp(arbeitgeber.getAnredeTyp());
        ae.setVorname(arbeitgeber.getVorname());
        ae.setNachname(arbeitgeber.getNachname());

        return ae;
    }


    public static Arbeitgeber mappe(final ArbeitgeberEntity arbeitgeberEntity) {

        if (arbeitgeberEntity == null) {
            return null;
        }

        final Arbeitgeber a = new Arbeitgeber();

        a.setArbeitgeberNr(arbeitgeberEntity.getArbeitgeberNr());
        a.setVersion(arbeitgeberEntity.getVersion());

        a.setRechtsformTyp(arbeitgeberEntity.getRechtsformTyp());
        a.setFirmenname(arbeitgeberEntity.getFirmenname());
        a.setAnredeTyp(arbeitgeberEntity.getAnredeTyp());
        a.setVorname(arbeitgeberEntity.getVorname());
        a.setNachname(arbeitgeberEntity.getNachname());


        return a;
    }
}
