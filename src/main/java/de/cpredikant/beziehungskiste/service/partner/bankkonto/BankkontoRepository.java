package de.cpredikant.beziehungskiste.service.partner.bankkonto;

import de.cpredikant.beziehungskiste.model.persistence.partner.BankkontoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankkontoRepository extends CrudRepository<BankkontoEntity, Long> {

    Optional<BankkontoEntity> findByPartnerNr(String partnerNr);

}
