package com.iason.aca.enrollment.generation.web.apis;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: EnrollmentGenerationApi
 * Inside the package - com.iason.aca.enrollment.generation.web.apis
 * Created Date: 5/19/2020
 * Created Time: 2:33 PM
 **/
@Tag(name = "enrollment", description = "The Iason Enrollment API")
@RequestMapping(value = "/api/v1/iason/")
public interface EnrollmentGenerationApi {

    @Operation(
            summary = "Welcome API",
            description = "This is just a Welcome API to test Gateway",
//            tags = {
//                    "product"
//            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful Operation",
                            content = {
                                    @Content(
                                            schema = @Schema(implementation = String.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping(value = "welcome",produces = {"application/json"})
    ResponseEntity<String> getWelcomeMessage();
}
