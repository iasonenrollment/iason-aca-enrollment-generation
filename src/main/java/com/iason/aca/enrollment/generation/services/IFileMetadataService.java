package com.iason.aca.enrollment.generation.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iason.aca.enrollment.generation.domain.FileMetadata;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IFileMetadataService
 * Inside the package - com.iason.aca.enrollment.generation.services
 * Created Date: 5/7/2020
 * Created Time: 9:14 AM
 **/
public interface IFileMetadataService {
    FileMetadata sendFileMetadata() throws JsonProcessingException;
}
