package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: EC
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:14 PM
 *
 * X12 Segment Name: Employment Class
 * X12 Purpose: To provide class of employment information
 *
 * TR3 Example: EC✽04✽06✽07~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EC {

    /**
     * Employment Class Code
     *
     * Code indicating category of employee
     */
    private String ec01;

    /**
     * Employment Class Code
     * Code indicating category of employee
     */
    private String ec02;

    /**
     * Employment Class Code
     * Code indicating category of employee
     */
    private String ec03;
}
