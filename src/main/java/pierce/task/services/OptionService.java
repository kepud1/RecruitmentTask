package pierce.task.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pierce.task.models.Option;
import pierce.task.repositories.OptionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OptionService {

    private OptionRepository optionRepository;

    @Autowired
    public OptionService(OptionRepository optionRepository) {
        this.optionRepository = optionRepository;
    }

    public Optional<Option> findByCode(String code) {
        return optionRepository.findById(code);
    }

    public List<Option> findAll() {
        return optionRepository.findAll();
    }

    public Option save(Option attribute) {
        return optionRepository.save(attribute);
    }

    public void deleteByCode(String code) {
        optionRepository.deleteById(code);
    }
}
