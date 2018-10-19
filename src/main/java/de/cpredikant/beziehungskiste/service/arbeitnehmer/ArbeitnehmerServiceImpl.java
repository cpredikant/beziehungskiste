package de.cpredikant.beziehungskiste.service.arbeitnehmer;

import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitnehmerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbeitnehmerServiceImpl implements ArbeitnehmerService {

    @Autowired
    private ArbeitnehmerRepository arbeitnehmerRepository;

    @Override
    public ArbeitnehmerEntity createArbeitnehmer(ArbeitnehmerEntity arbeitnehmerEntity) {
        return arbeitnehmerRepository.save(arbeitnehmerEntity);
    }

    @Override
    public ArbeitnehmerEntity readArbeitnehmer(String arbeitnehmerNr) {
        return arbeitnehmerRepository.findById(arbeitnehmerNr).orElse(null);
    }

}
