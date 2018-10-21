package de.cpredikant.beziehungskiste.controller;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitnehmer;
import de.cpredikant.beziehungskiste.model.domain.util.PartnerGenerator;
import de.cpredikant.beziehungskiste.model.domain.util.PartnerNrGenerator;
import de.cpredikant.beziehungskiste.service.arbeitnehmer.ArbeitnehmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArbeitnehmerController {

    @Autowired
    private ArbeitnehmerService arbeitnehmerService;


    @PostMapping("/arbeitnehmer")
    public Resource<Arbeitnehmer> erstelleArbeitnehmer(@RequestBody(required = false) final Arbeitnehmer arbeitnehmer) {

        final Arbeitnehmer createdArbeitnehmer;

        if (arbeitnehmer == null) {
            createdArbeitnehmer = arbeitnehmerService.createArbeitnehmer(
                    PartnerGenerator.erzeugeArbeitnehmer(
                            PartnerNrGenerator.generiereArbeitnehmerNummer()));
        } else {
            createdArbeitnehmer = arbeitnehmerService.createArbeitnehmer(arbeitnehmer);
        }


        return new Resource<>(createdArbeitnehmer,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).leseArbeitnehmer(
                                createdArbeitnehmer.getArbeitnehmerNr())).withRel("get"),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).aktualisiereArbeitnehmer(
                                createdArbeitnehmer)).withRel("put"),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).loescheArbeitnehmer(
                                createdArbeitnehmer.getArbeitnehmerNr())).withRel("delete")
        );

    }

    @GetMapping("/arbeitnehmer/{arbeitnehmerNr}")
    public Resource<Arbeitnehmer> leseArbeitnehmer(
            @PathVariable final String arbeitnehmerNr) {

        final Arbeitnehmer arbeitnehmer = arbeitnehmerService.readArbeitnehmer(arbeitnehmerNr);

        return new Resource<>(arbeitnehmer,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).leseArbeitnehmer(
                                arbeitnehmerNr)).withSelfRel(),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).loescheArbeitnehmer(
                                arbeitnehmer.getArbeitnehmerNr())).withRel("delete"));
    }

    @PutMapping("/arbeitnehmer")
    public Resource<Arbeitnehmer> aktualisiereArbeitnehmer(
            @RequestBody final Arbeitnehmer arbeitnehmer) {

        final Arbeitnehmer updatedArbeitnehmer = arbeitnehmerService.updateArbeitnehmer(arbeitnehmer);

        return new Resource<>(updatedArbeitnehmer,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).leseArbeitnehmer(
                                updatedArbeitnehmer.getArbeitnehmerNr())).withRel("self"),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).loescheArbeitnehmer(
                                updatedArbeitnehmer.getArbeitnehmerNr())).withRel("delete"));
    }

    @DeleteMapping("/arbeitnehmer/{arbeitnehmerNr}")
    public Resource<?> loescheArbeitnehmer(
            @PathVariable final String arbeitnehmerNr) {
        arbeitnehmerService.deleteArbeitnehmerById(arbeitnehmerNr);
        return new Resource(Arbeitnehmer.class,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitnehmerController.class).erstelleArbeitnehmer(new Arbeitnehmer())).withRel("post"));
    }

    @DeleteMapping("/arbeitnehmer")
    public ResponseEntity<?> loescheArbeitnehmer(
            @RequestBody final Arbeitnehmer arbeitnehmer) {
        arbeitnehmerService.deleteArbeitnehmer(arbeitnehmer);
        return ResponseEntity.noContent().build();
    }


}
