package pierce.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import pierce.task.components.OptionModelAssembler;
import pierce.task.exceptions.OptionNotFoundException;
import pierce.task.models.Option;
import pierce.task.services.OptionService;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class OptionController {


    private final OptionModelAssembler assembler;
    private final OptionService optionService;

    @Autowired
    public OptionController(OptionService optionService, OptionModelAssembler assembler) {
        this.optionService = optionService;
        this.assembler = assembler;
    }

    @GetMapping("/options")
    public CollectionModel<EntityModel<Option>> findAll() {
        List<EntityModel<Option>> options = optionService.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
        return CollectionModel.of(options,
                linkTo(methodOn(AttributeController.class).findAll()).withSelfRel());
    }
    @PostMapping("/add_option")
    public Option newOption(@RequestBody Option option) {
        return optionService.save(option);
    }


    @GetMapping("/options/{code}")
    public EntityModel<Option> findByCode(@PathVariable String code) {
        Option option = optionService.findByCode(code).orElseThrow(() -> new OptionNotFoundException(code));
        return assembler.toModel(option);
    }

    @DeleteMapping("/delete_option/{code}")
    public void deleteOption(@PathVariable String code) {
          optionService.deleteByCode(code);
    }

    @PutMapping("/update_option/{code}")
    public Option updateAttribute(@RequestBody Option option, @PathVariable String code) {
        optionService.findByCode(code).orElseThrow(()-> new OptionNotFoundException(code));
        return optionService.save(option);
    }
}
