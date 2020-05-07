package com.iason.aca.enrollment.generation.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iason.aca.enrollment.generation.domain.FileMetadata;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IEnrollmentGenerationService
 * Inside the package - com.iason.aca.enrollment.generation.services
 * Created Date: 5/7/2020
 * Created Time: 9:38 AM
 **/
public interface IEnrollmentGenerationService {
    void sendEnrollment(FileMetadata fileMetadata) throws JsonProcessingException;
}
