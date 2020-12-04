package pierce.task.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pierce.task.models.Option;
import pierce.task.repositories.AttributeRepository;
import pierce.task.repositories.OptionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class LoadDatabase {



    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AttributeRepository attributeRepository, OptionRepository optionRepository) {
        return args -> {

            LoadExcelFile loadExcelFile = new LoadExcelFile(attributeRepository, optionRepository);
            List<Option> optionsList = loadExcelFile.readOptionFile();

            loadExcelFile.readAttributeFile().forEach(attribute -> {
                attribute.setOptionsList(optionsList.stream()
                        .filter(option -> option.getAttribute().equals(attribute.getCode()))
                        .collect(Collectors.toSet()));
                log.info("preloading: " + attributeRepository.save(attribute));
            });

        };

    }

}
