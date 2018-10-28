package de.cpredikant.beziehungskiste.service.partner.kontaktdaten;

import de.cpredikant.beziehungskiste.model.domain.partner.Kontaktdaten;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.KontaktdatenEntity;

import java.util.ArrayList;
import java.util.List;

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

    public static List<KontaktdatenEntity> mappe(final List<Kontaktdaten> kontaktdatenListe, final PartnerTyp partnerTyp, final String partnerNr) {
        final List<KontaktdatenEntity> kontaktdatenEntities = new ArrayList<>();

        if (kontaktdatenListe != null) {
            for (final Kontaktdaten kontaktdaten : kontaktdatenListe) {
                kontaktdatenEntities.add(KontaktdatenMapper.mappe(kontaktdaten, partnerTyp, partnerNr));
            }
        }

        return kontaktdatenEntities;
    }

    public static Kontaktdaten mappe(final KontaktdatenEntity kontaktdatenEntity) {

        if (kontaktdatenEntity == null) {
            return null;
        }

        final Kontaktdaten k = new Kontaktdaten();

        k.setId(kontaktdatenEntity.getId());
        k.setVersion(kontaktdatenEntity.getVersion());

        k.setTelefonNr(kontaktdatenEntity.getTelefonNr());
        k.setMobilNr(kontaktdatenEntity.getMobilNr());
        k.setFaxNr(kontaktdatenEntity.getFaxNr());

        k.setHauptKontaktdaten(kontaktdatenEntity.isHauptKontaktdaten());

        return k;
    }

    public static List<Kontaktdaten> mappe(final Iterable<KontaktdatenEntity> kontaktdatenEntities) {
        final List<Kontaktdaten> kontaktdatenListe = new ArrayList<>();

        if (kontaktdatenEntities != null) {
            for (final KontaktdatenEntity kontaktdatenEntity : kontaktdatenEntities) {
                kontaktdatenListe.add(KontaktdatenMapper.mappe(kontaktdatenEntity));
            }
        }

        return kontaktdatenListe;

    }

}
