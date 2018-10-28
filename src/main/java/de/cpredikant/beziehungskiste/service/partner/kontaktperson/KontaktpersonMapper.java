package de.cpredikant.beziehungskiste.service.partner.kontaktperson;

import de.cpredikant.beziehungskiste.model.domain.partner.Kontaktperson;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.KontaktpersonEntity;

import java.util.ArrayList;
import java.util.List;

public final class KontaktpersonMapper {

    private KontaktpersonMapper() {
        // Mapper
    }

    public static KontaktpersonEntity mappe(final Kontaktperson kontaktperson, final PartnerTyp partnerTyp, final String partnerNr) {

        final KontaktpersonEntity kpe = new KontaktpersonEntity();

        kpe.setId(kontaktperson.getId());
        kpe.setVersion(kontaktperson.getVersion());
        kpe.setPartnerTyp(partnerTyp);
        kpe.setPartnerNr(partnerNr);

        kpe.setKontaktPersonTyp(kontaktperson.getKontaktPersonTyp());
        kpe.setAnredeTyp(kontaktperson.getAnredeTyp());
        kpe.setTitelTyp(kontaktperson.getTitelTyp());
        kpe.setVorname(kontaktperson.getVorname());
        kpe.setNachname(kontaktperson.getNachname());

        return kpe;
    }

    public static List<KontaktpersonEntity> mappe(final List<Kontaktperson> kontaktpersonListe, final PartnerTyp partnerTyp, final String partnerNr) {
        final List<KontaktpersonEntity> kontaktpersonEntities = new ArrayList<>();

        if (kontaktpersonListe != null) {
            for (final Kontaktperson kontaktperson : kontaktpersonListe) {
                kontaktpersonEntities.add(KontaktpersonMapper.mappe(kontaktperson, partnerTyp, partnerNr));
            }
        }

        return kontaktpersonEntities;
    }

    public static Kontaktperson mappe(final KontaktpersonEntity kontaktpersonEntity) {

        if (kontaktpersonEntity == null) {
            return null;
        }

        final Kontaktperson k = new Kontaktperson();

        k.setId(kontaktpersonEntity.getId());
        k.setVersion(kontaktpersonEntity.getVersion());

        k.setKontaktPersonTyp(kontaktpersonEntity.getKontaktPersonTyp());
        k.setAnredeTyp(kontaktpersonEntity.getAnredeTyp());
        k.setTitelTyp(kontaktpersonEntity.getTitelTyp());
        k.setVorname(kontaktpersonEntity.getVorname());
        k.setNachname(kontaktpersonEntity.getNachname());

        return k;
    }

    public static List<Kontaktperson> mappe(final Iterable<KontaktpersonEntity> kontaktpersonEntities) {
        final List<Kontaktperson> kontaktpersonListe = new ArrayList<>();

        if (kontaktpersonEntities != null) {
            for (final KontaktpersonEntity kontaktpersonEntity : kontaktpersonEntities) {
                kontaktpersonListe.add(KontaktpersonMapper.mappe(kontaktpersonEntity));
            }
        }

        return kontaktpersonListe;

    }

}
