package com.iason.aca.enrollment.generation.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iason.aca.enrollment.generation.domain.FileMetadata;
import com.iason.aca.enrollment.generation.util.IasonUtils;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: RestImplFileMetadataService
 * Inside the package - com.iason.aca.enrollment.generation.services
 * Created Date: 5/7/2020
 * Created Time: 9:21 AM
 **/
@Service
public class RestTemplateFileMetadataServiceImpl implements IFileMetadataService{

    private RestTemplate restTemplate;

    private ObjectMapper objectMapper;

    public RestTemplateFileMetadataServiceImpl(RestTemplateBuilder builder, ObjectMapper objectMapper){
        this.restTemplate = builder.build();
        this.objectMapper = objectMapper;
    }

    @Override
    public FileMetadata sendFileMetadata() throws JsonProcessingException {
        FileMetadata fileMetadata = FileMetadata.builder()
                .sourceFileName(generateFileName())
                .fileStatus("RECEIVED")
                .fileReceivedDateTime(OffsetDateTime.now()).build();
        String fileAsString = objectMapper.writeValueAsString(fileMetadata);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request =
                new HttpEntity<String>(fileAsString, headers);
        String fileId = restTemplate.postForObject("http://localhost:8081/files", request, String.class);
        fileMetadata.setFileId(fileId);
        return fileMetadata;
    }

    private String generateFileName(){
        long timeinMillis = Instant.now().toEpochMilli();
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = formatter.format(LocalDate.now());
        String [] array = {"67138", "99110", "45943", "45124"};
        String hiosId = IasonUtils.randomString(array);
        String fileName = "HIOS-"+hiosId+"-"+formattedDate+"-"+timeinMillis+".edi";
        return fileName;
    }

}
