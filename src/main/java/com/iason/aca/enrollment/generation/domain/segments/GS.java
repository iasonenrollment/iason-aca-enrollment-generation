package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: GSA
 * Inside the package - com.iason.aca.enrollment.generation.domain.functional
 * Created Date: 5/5/2020
 * Created Time: 8:44 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GS {

    /**
     * Functional identifier code.
     * This will be "BE"
     */
    private String gs01;

    /**
     * Application Sender Code
     */
    private String gs02;

    /**
     * Application Receiver Code
     */
    private String gs03;

    /**
     * Functional Group Creation Code
     */
    private String gs04;

    /**
     * Functional group creation time
     */
    private String gs05;

    /**
     * Group Control Number
     * Assigned number originated and maintained by the sender.
     * The data interchange control number GS06 in this header must be
     * identical to the same data element in the associated functional group trailer,
     * GE02
     */
    private String gs06;

    /**
     * Responsible Agency Code
     * Code identifying the issuer of the standard;
     */
    private String gs07;

    /**
     * Version/Release/Industry Identifier Code
     */
    private String gs08;


}
