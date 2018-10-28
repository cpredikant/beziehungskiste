package de.cpredikant.beziehungskiste.service.partner.vertreter;

import de.cpredikant.beziehungskiste.model.domain.partner.Vertreter;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.VertreterEntity;

import java.util.ArrayList;
import java.util.List;

public final class VertreterMapper {

    private VertreterMapper() {
        // Mapper
    }

    public static VertreterEntity mappe(final Vertreter vertreter, final PartnerTyp partnerTyp, final String partnerNr) {

        final VertreterEntity ve = new VertreterEntity();

        ve.setId(vertreter.getId());
        ve.setVersion(vertreter.getVersion());
        ve.setPartnerTyp(partnerTyp);
        ve.setPartnerNr(partnerNr);

        ve.setVertreterTyp(vertreter.getVertreterTyp());
        ve.setRechtsformTyp(vertreter.getRechtsformTyp());
        ve.setAnredeTyp(vertreter.getAnredeTyp());
        ve.setTitelTyp(vertreter.getTitelTyp());
        ve.setFirmenname(vertreter.getFirmenname());
        ve.setVorname(vertreter.getVorname());
        ve.setNachname(vertreter.getNachname());


        return ve;
    }

    public static List<VertreterEntity> mappe(final List<Vertreter> vertreterListe, final PartnerTyp partnerTyp, final String partnerNr) {
        final List<VertreterEntity> vertreterEntities = new ArrayList<>();

        if (vertreterListe != null) {
            for (final Vertreter vertreter : vertreterListe) {
                vertreterEntities.add(VertreterMapper.mappe(vertreter, partnerTyp, partnerNr));
            }
        }

        return vertreterEntities;
    }

    public static Vertreter mappe(final VertreterEntity vertreterEntity) {

        if (vertreterEntity == null) {
            return null;
        }

        final Vertreter v = new Vertreter();

        v.setId(vertreterEntity.getId());
        v.setVersion(vertreterEntity.getVersion());

        v.setVertreterTyp(vertreterEntity.getVertreterTyp());
        v.setRechtsformTyp(vertreterEntity.getRechtsformTyp());
        v.setAnredeTyp(vertreterEntity.getAnredeTyp());
        v.setTitelTyp(vertreterEntity.getTitelTyp());
        v.setFirmenname(vertreterEntity.getFirmenname());
        v.setVorname(vertreterEntity.getVorname());
        v.setNachname(vertreterEntity.getNachname());

        return v;
    }

    public static List<Vertreter> mappe(final Iterable<VertreterEntity> vertreterEntities) {
        final List<Vertreter> vertreterListe = new ArrayList<>();

        if (vertreterEntities != null) {
            for (final VertreterEntity vertreterEntity : vertreterEntities) {
                vertreterListe.add(VertreterMapper.mappe(vertreterEntity));
            }
        }

        return vertreterListe;

    }

}
