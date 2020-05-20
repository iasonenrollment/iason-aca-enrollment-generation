package com.iason.aca.enrollment.generation.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iason.aca.enrollment.generation.domain.FileMetadata;
import com.iason.aca.enrollment.generation.services.IEnrollmentGenerationService;
import com.iason.aca.enrollment.generation.services.IFileMetadataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

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
