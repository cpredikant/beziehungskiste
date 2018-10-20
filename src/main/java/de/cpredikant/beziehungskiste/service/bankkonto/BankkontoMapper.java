package de.cpredikant.beziehungskiste.service.bankkonto;

import de.cpredikant.beziehungskiste.model.domain.partner.Bankkonto;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.BankkontoEntity;

public final class BankkontoMapper {

    private BankkontoMapper() {
        // Mapper
    }

    public static BankkontoEntity mappe(Bankkonto bankkonto, PartnerTyp partnerTyp, String partnerNr) {

        BankkontoEntity be = new BankkontoEntity();

        be.setId(bankkonto.getId());
        be.setVersion(bankkonto.getVersion());
        be.setPartnerTyp(partnerTyp);
        be.setPartnerNr(partnerNr);

        be.setKontoinhaber(bankkonto.getKontoinhaber());
        be.setBic(bankkonto.getBic());
        be.setIban(bankkonto.getIban());
        be.setBlz(bankkonto.getBlz());
        be.setKontoNr(bankkonto.getKontoNr());

        be.setAusland(bankkonto.isAusland());
        be.setAuszahlung(bankkonto.isAuszahlung());
        be.setEinzahlung(bankkonto.isEinzahlung());
        be.setWinterbau(bankkonto.isWinterbau());


        return be;
    }

    public static Bankkonto mappe(BankkontoEntity bankkontoEntity) {

        if (bankkontoEntity == null) {
            return null;
        }

        Bankkonto b = new Bankkonto(bankkontoEntity.getId(), bankkontoEntity.getVersion());

        b.setKontoinhaber(bankkontoEntity.getKontoinhaber());
        b.setBic(bankkontoEntity.getBic());
        b.setIban(bankkontoEntity.getIban());
        b.setBlz(bankkontoEntity.getBlz());
        b.setKontoNr(bankkontoEntity.getKontoNr());

        b.setAusland(bankkontoEntity.isAusland());
        b.setAuszahlung(bankkontoEntity.isAuszahlung());
        b.setEinzahlung(bankkontoEntity.isEinzahlung());
        b.setWinterbau(bankkontoEntity.isWinterbau());

        return b;
    }
}
