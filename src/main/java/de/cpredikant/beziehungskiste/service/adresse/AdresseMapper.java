package de.cpredikant.beziehungskiste.service.adresse;

import de.cpredikant.beziehungskiste.model.domain.partner.Adresse;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.AdresseEntity;

public final class AdresseMapper {

    private AdresseMapper() {
        // Mapper
    }

    public static AdresseEntity mappe(final Adresse adresse, final PartnerTyp partnerTyp, final String partnerNr) {

        final AdresseEntity ae = new AdresseEntity();

        ae.setId(adresse.getId());
        ae.setVersion(adresse.getVersion());
        ae.setPartnerTyp(partnerTyp);
        ae.setPartnerNr(partnerNr);

        ae.setStrasse(adresse.getStrasse());
        ae.setPostfach(adresse.getPostfach());
        ae.setHausNr(adresse.getHausNr());
        ae.setPlz(adresse.getPlz());
        ae.setStadt(adresse.getStadt());
        ae.setBundesland(adresse.getBundesland());
        ae.setLand(adresse.getLand());

        ae.setAusland(adresse.isAusland());
        ae.setHauptAdresse(adresse.isHauptAdresse());

        return ae;
    }

    public static Adresse mappe(final AdresseEntity adresseEntity) {

        if (adresseEntity == null) {
            return null;
        }

        final Adresse a = new Adresse(adresseEntity.getId(), adresseEntity.getVersion());

        a.setStrasse(adresseEntity.getStrasse());
        a.setPostfach(adresseEntity.getPostfach());
        a.setHausNr(adresseEntity.getHausNr());
        a.setPlz(adresseEntity.getPlz());
        a.setStadt(adresseEntity.getStadt());
        a.setBundesland(adresseEntity.getBundesland());
        a.setLand(adresseEntity.getLand());

        a.setAusland(adresseEntity.isAusland());
        a.setHauptAdresse(adresseEntity.isHauptAdresse());

        return a;
    }
}
