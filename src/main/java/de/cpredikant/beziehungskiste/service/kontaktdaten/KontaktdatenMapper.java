package de.cpredikant.beziehungskiste.service.kontaktdaten;

import de.cpredikant.beziehungskiste.model.domain.partner.Kontaktdaten;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.KontaktdatenEntity;

public final class KontaktdatenMapper {

    private KontaktdatenMapper() {
        // Mapper
    }

    public static KontaktdatenEntity mappe(final Kontaktdaten kontaktdaten, final PartnerTyp partnerTyp, final String partnerNr) {

        final KontaktdatenEntity ke = new KontaktdatenEntity();

        ke.setId(kontaktdaten.getId());
        ke.setVersion(kontaktdaten.getVersion());
        ke.setPartnerTyp(partnerTyp);
        ke.setPartnerNr(partnerNr);

        ke.setTelefonNr(kontaktdaten.getTelefonNr());
        ke.setMobilNr(kontaktdaten.getMobilNr());
        ke.setFaxNr(kontaktdaten.getFaxNr());

        ke.setHauptKontaktdaten(kontaktdaten.isHauptKontaktdaten());

        return ke;
    }

    public static Kontaktdaten mappe(final KontaktdatenEntity kontaktdatenEntity) {

        if (kontaktdatenEntity == null) {
            return null;
        }

        final Kontaktdaten k = new Kontaktdaten(kontaktdatenEntity.getId(), kontaktdatenEntity.getVersion());

        k.setTelefonNr(kontaktdatenEntity.getTelefonNr());
        k.setMobilNr(kontaktdatenEntity.getMobilNr());
        k.setFaxNr(kontaktdatenEntity.getFaxNr());

        k.setHauptKontaktdaten(kontaktdatenEntity.isHauptKontaktdaten());

        return k;
    }

}
