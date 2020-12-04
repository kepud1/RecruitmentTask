package pierce.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import pierce.task.components.AttributeModelAssembler;
import pierce.task.exceptions.AttributeNotFoundException;
import pierce.task.models.Attribute;
import pierce.task.services.AttributeService;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class AttributeController {


    private final AttributeModelAssembler assembler;
    private final AttributeService attributeService;


    @Autowired
    public AttributeController(AttributeService attributeService, AttributeModelAssembler assembler) {
        this.attributeService = attributeService;
        this.assembler = assembler;
    }

    @GetMapping("/attributes")
    public CollectionModel<EntityModel<Attribute>> findAll() {
        List<EntityModel<Attribute>> attributes = attributeService.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
        return CollectionModel.of(attributes,
                linkTo(methodOn(AttributeController.class).findAll()).withSelfRel());
    }

    @PostMapping("/add_attribute")
    public Attribute newAttribute(@RequestBody Attribute attribute) {
        return attributeService.save(attribute);
    }

    @GetMapping("/attributes/{code}")
    public EntityModel<Attribute> findByCode(@PathVariable String code) {
        Attribute attribute = attributeService.findByCode(code)
                .orElseThrow(() -> new AttributeNotFoundException(code));
        return assembler.toModel(attribute);
    }

    @DeleteMapping("/delete_attribute/{code}")
    public void deleteAttribute(@PathVariable String code) {
        attributeService.deleteByCode(code);
    }

    @PutMapping("/update_attribute/{code}")
    public Attribute updateAttribute(@RequestBody Attribute attribute, @PathVariable String code) {
        attributeService.findByCode(code).orElseThrow(()-> new AttributeNotFoundException(code));
        return attributeService.save(attribute);
    }

}
