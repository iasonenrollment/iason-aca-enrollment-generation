package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: REF
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:45 PM
 *
 * X12 Segment Name: Reference Information
 * X12 Purpose: To specify identifying information
 * X12 Syntax: 1. R0203
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class REF {

    /**
     * Reference Identification Qualifier
     * Code qualifying the Reference Identification
     */
    private String ref01;

    /**
     * Reference Identification
     * Reference information as defined for a particular Transaction Set or as specified
     * by the Reference Identification Qualifier
     */
    private String ref02;
}
