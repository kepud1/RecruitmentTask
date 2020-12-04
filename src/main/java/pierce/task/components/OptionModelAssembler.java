package pierce.task.components;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import pierce.task.controllers.OptionController;
import pierce.task.models.Option;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class OptionModelAssembler implements RepresentationModelAssembler<Option, EntityModel<Option>> {

    @Override
    public EntityModel<Option> toModel(Option option) {
        return EntityModel.of(option,
                linkTo(methodOn(OptionController.class).findByCode(option.getCode())).withSelfRel(),
                linkTo(methodOn(OptionController.class).findAll()).withRel("options"));
    }

}
