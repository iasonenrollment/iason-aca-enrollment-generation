package com.iason.aca.enrollment.generation.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iason.aca.enrollment.generation.domain.FileMetadata;
import com.iason.aca.enrollment.generation.util.IasonUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FeignFileMetadataServiceImpl
 * Inside the package - com.iason.aca.enrollment.generation.services
 * Created Date: 5/19/2020
 * Created Time: 3:30 PM
 **/
@Service
@Slf4j
@RequiredArgsConstructor
public class FeignFileMetadataServiceImpl implements IFileMetadataService{

    private final FileMetadataFeignClient feignClient;

    @Override
    public FileMetadata sendFileMetadata() throws JsonProcessingException {
        log.info("Running from Feign Client");
        FileMetadata fileMetadata = FileMetadata.builder()
                .sourceFileName(generateFileName())
                .sourceFileId(UUID.randomUUID())
                .fileStatus("RECEIVED")
                .fileReceivedDateTime(OffsetDateTime.now()).build();
        String fileId = feignClient.postFileMetaData(fileMetadata);
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
