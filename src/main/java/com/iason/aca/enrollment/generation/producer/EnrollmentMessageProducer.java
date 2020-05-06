package com.iason.aca.enrollment.generation.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iason.aca.enrollment.generation.domain.Enrollment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: EnrollmentMessageProducer
 * Inside the package - com.iason.aca.enrollment.generation.producer
 * Created Date: 5/5/2020
 * Created Time: 6:35 PM
 **/
@Service
@Slf4j
public class EnrollmentMessageProducer {

    private KafkaTemplate<String, String> kafkaTemplate;
    private ObjectMapper objectMapper;

    public EnrollmentMessageProducer(KafkaTemplate kafkaTemplate, ObjectMapper objectMapper){
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendEnrollment(Enrollment enrollment) throws JsonProcessingException {
        String enrollmentString = objectMapper.writeValueAsString(enrollment);
        kafkaTemplate.send("enrollments",enrollmentString);
        log.info("Enrollment Produced and sent: " + enrollment.getSourceFileName());
    }
}
