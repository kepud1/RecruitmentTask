package pierce.task.components;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import pierce.task.controllers.AttributeController;
import pierce.task.models.Attribute;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class AttributeModelAssembler implements RepresentationModelAssembler<Attribute, EntityModel<Attribute>> {

    @Override
    public EntityModel<Attribute> toModel(Attribute attribute) {
        return EntityModel.of(attribute,
                linkTo(methodOn(AttributeController.class).findByCode(attribute.getCode())).withSelfRel(),
                linkTo(methodOn(AttributeController.class).findAll()).withRel("attributes"));
    }
}
