package pierce.task.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import pierce.task.models.Attribute;
import pierce.task.models.BaseEntity;
import pierce.task.models.LabelTypes;
import pierce.task.models.Option;
import pierce.task.repositories.AttributeRepository;
import pierce.task.repositories.OptionRepository;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class LoadExcelFile {
    private static final String CSV_ATTRIBUTES_PATH = "attributes.csv";
    private static final String CSV_OPTIONS_PATH = "options.csv";

    private final AttributeRepository attributeRepository;
    private final OptionRepository optionRepository;

    public LoadExcelFile(AttributeRepository attributeRepository,OptionRepository optionRepository) {
        this.attributeRepository = attributeRepository;
        this.optionRepository = optionRepository;
    }

    public List<Option> readOptionFile() throws IOException {
        List<Option> optionsList = new ArrayList<>();
        try (
                Reader reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource(CSV_OPTIONS_PATH).toURI()));
                CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT
                                .withFirstRecordAsHeader().withIgnoreHeaderCase().withDelimiter(';').withTrim());
        ) {


            for (CSVRecord csvRecord : csvParser) {
                Option tempOption = new Option();

                setOptionParameters(csvRecord, tempOption);
                optionsList.add(tempOption);
            }

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return optionsList;
    }



    public List<Attribute> readAttributeFile() throws IOException {
        List<Attribute> attributeList = new ArrayList<>();
        try (
                Reader reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource(CSV_ATTRIBUTES_PATH).toURI()));
                CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT
                                .withFirstRecordAsHeader().withIgnoreHeaderCase().withDelimiter(';').withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                Attribute attribute = new Attribute();
                setAttributeParameters(csvRecord, attribute);
                attributeList.add(attribute);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return attributeList;

    }

    private void setAttributeParameters(CSVRecord csvRecord, Attribute attribute) {
        setBaseEntityParameters(csvRecord, attribute);
    }

    private void setOptionParameters(CSVRecord csvRecord, Option tempOption) {
        setBaseEntityParameters(csvRecord, tempOption);
        tempOption.setAttribute(csvRecord.get("attribute"));
        tempOption.setSortOrder(csvRecord.get("sort_order"));
    }

    private void setBaseEntityParameters(CSVRecord csvRecord, BaseEntity baseEntity) {
        baseEntity.setCode(csvRecord.get("code"));
        baseEntity.setLABEL_IT(csvRecord.get(LabelTypes.LABEL_IT.getLabelType()));
        baseEntity.setLABEL_EN_GB(csvRecord.get(LabelTypes.LABEL_EN_GB.getLabelType()));
        baseEntity.setLABEL_EN_IE(csvRecord.get(LabelTypes.LABEL_EN_IE.getLabelType()));
        baseEntity.setLABEL_PL(csvRecord.get(LabelTypes.LABEL_PL.getLabelType()));
        baseEntity.setLABEL_NL(csvRecord.get(LabelTypes.LABEL_NL.getLabelType()));
        baseEntity.setLABEL_NL_BE(csvRecord.get(LabelTypes.LABEL_NL_BE.getLabelType()));
        baseEntity.setLABEL_NB(csvRecord.get(LabelTypes.LABEL_NB.getLabelType()));
        baseEntity.setLABEL_FI(csvRecord.get(LabelTypes.LABEL_FI.getLabelType()));
        baseEntity.setLABEL_EN_US(csvRecord.get(LabelTypes.LABEL_EN_US.getLabelType()));
        baseEntity.setLABEL_ES(csvRecord.get(LabelTypes.LABEL_ES.getLabelType()));
        baseEntity.setLABEL_DE(csvRecord.get(LabelTypes.LABEL_DE.getLabelType()));
        baseEntity.setLABEL_DE_CHF(csvRecord.get(LabelTypes.LABEL_DE_CHF.getLabelType()));
        baseEntity.setLABEL_DE_AT(csvRecord.get(LabelTypes.LABEL_DE_AT.getLabelType()));
        baseEntity.setLABEL_DK(csvRecord.get(LabelTypes.LABEL_DK.getLabelType()));
        baseEntity.setLABEL_FR(csvRecord.get(LabelTypes.LABEL_FR.getLabelType()));
        baseEntity.setLABEL_SV(csvRecord.get(LabelTypes.LABEL_SV.getLabelType()));
        baseEntity.setLABEL_CZ(csvRecord.get(LabelTypes.LABEL_CZ.getLabelType()));
    }


}
