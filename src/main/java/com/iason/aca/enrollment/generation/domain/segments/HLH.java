package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: HLH
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:14 PM
 *
 * X12 Segment Name: Health Information
 * X12 Purpose: To provide health information
 *
 * TR3 Example: HLH✽X✽74✽210~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HLH {

    /**
     * Health-Related Code
     * Code indicating a specific health situation
     */
    private String hlh01;

    /**
     * Height
     */
    private String hlh02;

    /**
     * Weight
     */
    private String hlh03;
}
