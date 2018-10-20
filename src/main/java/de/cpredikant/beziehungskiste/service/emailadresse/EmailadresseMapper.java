package de.cpredikant.beziehungskiste.service.emailadresse;

import de.cpredikant.beziehungskiste.model.domain.partner.Emailadresse;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.EmailadresseEntity;

public final class EmailadresseMapper {

    private EmailadresseMapper() {
        // Mapper
    }

    public static EmailadresseEntity mappe(Emailadresse emailadresse, PartnerTyp partnerTyp, String partnerNr) {

        EmailadresseEntity ee = new EmailadresseEntity();

        ee.setId(emailadresse.getId());
        ee.setVersion(emailadresse.getVersion());
        ee.setPartnerTyp(partnerTyp);
        ee.setPartnerNr(partnerNr);

        ee.setEmail(emailadresse.getEmail());
        ee.setEmailadresseTyp(emailadresse.getEmailadresseTyp());
        ee.setHauptEmailadresse(emailadresse.isHauptEmailadresse());

        return ee;
    }

    public static Emailadresse mappe(EmailadresseEntity emailadresseEntity) {

        if (emailadresseEntity == null) {
            return null;
        }

        Emailadresse e = new Emailadresse(emailadresseEntity.getId(), emailadresseEntity.getVersion());

        e.setEmail(emailadresseEntity.getEmail());
        e.setEmailadresseTyp(emailadresseEntity.getEmailadresseTyp());
        e.setHauptEmailadresse(emailadresseEntity.isHauptEmailadresse());

        return e;
    }
}
