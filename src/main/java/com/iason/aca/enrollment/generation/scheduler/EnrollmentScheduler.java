package com.iason.aca.enrollment.generation.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iason.aca.enrollment.generation.domain.Enrollment;
import com.iason.aca.enrollment.generation.domain.envelope.ISA;
import com.iason.aca.enrollment.generation.producer.EnrollmentMessageProducer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

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
public class EnrollmentScheduler {

    private EnrollmentMessageProducer producer;

    public EnrollmentScheduler(EnrollmentMessageProducer producer){
        this.producer = producer;
    }

    @Scheduled(fixedRate = 1000)
    public void sendEnrollments() throws JsonProcessingException {
        Enrollment enrollment = generateEnrollment();
        producer.sendEnrollment(enrollment);
    }

    private Enrollment generateEnrollment(){
        Enrollment enrollment = Enrollment.builder()
                .sourceFileName(generateFileName())
                .fileReceivedDateTime(OffsetDateTime.now())
                .isa(generateISASegment()).build();
        return enrollment;
    }

    private String generateFileName(){
        long timeinMillis = Instant.now().toEpochMilli();
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = formatter.format(LocalDate.now());
        String [] array = {"67138", "99110", "45943", "45124"};
        String hiosId = randomString(array);
        String fileName = "HIOS-"+hiosId+"-"+formattedDate+"-"+timeinMillis+".edi";
        return fileName;
    }

    private ISA generateISASegment(){
        String [] senderArray = {"CA0", "CAOFFX", "AR0", "AZ0", "FL0", "IL0", "MI0","AROFFX"};
        String senderId = randomString(senderArray);
        String [] receiverArray = {"2343238441", "8732435685", "78245457654",
                "52563467434", "22234343454", "92346342357",
                "44354568245", "76244763457"};
        String receiverId = randomString(receiverArray);
        ISA isa = ISA.builder()
                .isa01("00")
                .isa03("01")
                .isa04("SECRET")
                .isa05("ZZ")
                .isa06(senderId)
                .isa07("ZZ")
                .isa08(receiverId)
                .isa09(getCurrentDate())
                .isa10(getCurrentTime())
                .isa11("^")
                .isa12("00501")
                .isa13(getICN())
                .isa14("1")
                .isa15("T")
                .isa16("~").build();
        return isa;
    }

    private String randomString(String [] array){
        int rnd = new Random().nextInt(array.length - 1);
        String randomString = array[rnd];
        return randomString;
    }

    private String getCurrentDate(){
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = formatter.format(LocalDate.now());
        return formattedDate.substring(2);
    }

    private String getCurrentTime(){
        Calendar calendar = GregorianCalendar.getInstance();
        String hourString;
        String minuteString;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        if(hour < 10){
            hourString = "0" + hour;
        }else{
            hourString = Integer.toString(calendar.get(hour));
        }
        if(minute < 10){
            minuteString = "0" + minute;
        }else{
            minuteString = Integer.toString(minute);
        }
        return hourString+minuteString;
    }

    private String getICN(){
        return Long.toString(ThreadLocalRandom.current().nextLong(10000000000L, 99999999999L));
    }
}
