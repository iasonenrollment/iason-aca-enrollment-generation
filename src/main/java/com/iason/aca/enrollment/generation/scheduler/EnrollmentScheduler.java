package com.iason.aca.enrollment.generation.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iason.aca.enrollment.generation.domain.Enrollment;
import com.iason.aca.enrollment.generation.domain.FileMetadata;
import com.iason.aca.enrollment.generation.domain.envelope.ISA;
import com.iason.aca.enrollment.generation.producer.EnrollmentMessageProducer;
import com.iason.aca.enrollment.generation.services.IEnrollmentGenerationService;
import com.iason.aca.enrollment.generation.services.IFileMetadataService;
import com.iason.aca.enrollment.generation.util.IasonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: EnrollmentScehduler
 * Inside the package - com.iason.aca.enrollment.generation.scheduler
 * Created Date: 5/5/2020
 * Created Time: 6:43 PM
 **/
@Service
@Slf4j
public class EnrollmentScheduler {

    private IFileMetadataService fileMetadataService;

    private IEnrollmentGenerationService enrollmentGenerationService;

    public EnrollmentScheduler(IFileMetadataService fileMetadataService,
                               IEnrollmentGenerationService enrollmentGenerationService){
        this.fileMetadataService = fileMetadataService;
        this.enrollmentGenerationService = enrollmentGenerationService;
    }

    @Scheduled(fixedRate = 1000)
    public void sendEnrollments() throws JsonProcessingException {
        FileMetadata fileMetadata = sendFileMetadata();
        enrollmentGenerationService.sendEnrollment(fileMetadata);
    }

    public FileMetadata sendFileMetadata() throws JsonProcessingException {
        return fileMetadataService.sendFileMetadata();
    }

}
