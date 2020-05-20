package com.iason.aca.enrollment.generation.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iason.aca.enrollment.generation.domain.Enrollment;
import com.iason.aca.enrollment.generation.domain.FileMetadata;
import com.iason.aca.enrollment.generation.domain.segments.ISA;
import com.iason.aca.enrollment.generation.producer.EnrollmentMessageProducer;
import com.iason.aca.enrollment.generation.util.IasonUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: KafkaEnrollmentGenerationServiceImpl
 * Inside the package - com.iason.aca.enrollment.generation.services
 * Created Date: 5/7/2020
 * Created Time: 9:40 AM
 **/
@Service
public class KafkaEnrollmentGenerationServiceImpl implements IEnrollmentGenerationService{

    private EnrollmentMessageProducer producer;

    public KafkaEnrollmentGenerationServiceImpl(EnrollmentMessageProducer producer){
        this.producer = producer;
    }

    @Override
    public void sendEnrollment(FileMetadata fileMetadata) throws JsonProcessingException {
        Enrollment enrollment = Enrollment.builder().fileMetadata(fileMetadata).build();
        generateEnrollment(enrollment);
        producer.sendEnrollment(enrollment);
    }

    private Enrollment generateEnrollment(Enrollment enrollment){
        enrollment.setIsa(generateISASegment());
        return enrollment;
    }


    private ISA generateISASegment(){
        String [] senderArray = {"CA0", "CAOFFX", "AR0", "AZ0", "FL0", "IL0", "MI0","AROFFX"};
        String senderId = IasonUtils.randomString(senderArray);
        String [] receiverArray = {"2343238441", "8732435685", "78245457654",
                "52563467434", "22234343454", "92346342357",
                "44354568245", "76244763457"};
        String receiverId = IasonUtils.randomString(receiverArray);
        ISA isa = ISA.builder()
                .isa01("00")
                .isa03("01")
                .isa04("SECRET")
                .isa05("ZZ")
                .isa06(senderId)
                .isa07("ZZ")
                .isa08(receiverId)
                .isa09(IasonUtils.getCurrentDate())
                .isa10(IasonUtils.getCurrentTime())
                .isa11("^")
                .isa12("00501")
                .isa13(getICN())
                .isa14("1")
                .isa15("T")
                .isa16("~").build();
        return isa;
    }



    private String getICN(){
        return Long.toString(ThreadLocalRandom.current().nextLong(10000000000L, 99999999999L));
    }
}
