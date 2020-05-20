package com.iason.aca.enrollment.generation.services;

import com.iason.aca.enrollment.generation.domain.FileMetadata;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FileMetaDataFeignClient
 * Inside the package - com.iason.aca.enrollment.generation.services
 * Created Date: 5/19/2020
 * Created Time: 3:23 PM
 **/
@FeignClient(name="iason-aca-intake")
public interface FileMetadataFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "/files")
    String postFileMetaData(@RequestBody FileMetadata fileMetadata);
}
