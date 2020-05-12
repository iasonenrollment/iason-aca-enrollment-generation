package com.iason.aca.enrollment.generation.domain;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetadata
 * Inside the package - com.iason.aca.enrollment.generation.domain
 * Created Date: 5/6/2020
 * Created Time: 8:43 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadata {

    private String fileId;

    private UUID sourceFileId;

    private String sourceFileName;

    private OffsetDateTime fileReceivedDateTime;

    private String fileStatus;
}
