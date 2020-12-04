package pierce.task.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pierce.task.models.Attribute;
import pierce.task.repositories.AttributeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AttributeService {

    private AttributeRepository attributeRepository;

    @Autowired
    public AttributeService(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    public Optional<Attribute> findByCode(String code) {
        return attributeRepository.findById(code);
    }

    public List<Attribute> findAll() {
        return attributeRepository.findAll();
    }

    public Attribute save(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    public void deleteByCode(String code) {
        attributeRepository.deleteById(code);
    }
}
