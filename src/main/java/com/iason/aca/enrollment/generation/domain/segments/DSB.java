package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: DSB
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:31 PM
 *
 * X12 Segment Name: Disability Information
 * X12 Purpose: To supply disability information
 *
 * TR3 Example: DSB✽2✽✽✽✽✽✽DX✽585~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DSB {

    /**
     * Disability Type Code
     * Code identifying the disability status of the individual
     */
    private String dsb01;

    /**
     * Product/Service ID Qualifier
     * Code identifying the type/source of the descriptive number used in
     * Product/Service ID (234)
     */
    private String dsb07;

    /**
     * Medical Code Value
     * Code value for describing a medical condition or procedure
     */
    private String dsb08;


}
