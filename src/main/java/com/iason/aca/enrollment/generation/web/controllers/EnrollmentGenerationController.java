package com.iason.aca.enrollment.generation.web.controllers;

import com.iason.aca.enrollment.generation.web.apis.EnrollmentGenerationApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: EnrollmentGenerationController
 * Inside the package - com.iason.aca.enrollment.generation.web.controllers
 * Created Date: 5/19/2020
 * Created Time: 2:32 PM
 **/
@RestController
public class EnrollmentGenerationController implements EnrollmentGenerationApi {


    @Override
    public ResponseEntity<String> getWelcomeMessage() {
        return new ResponseEntity("Hello, Welcome to Iason Microservices", HttpStatus.OK);
    }
}
