package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: PLA
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:38 PM
 *
 * X12 Segment Name: Place or Location
 * X12 Purpose: To indicate action to be taken for the location specified and to qualify the
 * location specified
 *
 * TR3 Example: PLA✽2✽1P✽19970628✽✽AI~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PLA {

    /**
     * Action Code
     *
     * Code indicating type of action
     */
    private String pla01;

    /**
     * Entity Identifier Code
     *
     * Code identifying an organizational entity, a physical location, property or an
     * individual
     */
    private String pla02;

    /**
     * Date
     *
     * Date expressed as CCYYMMDD where CC represents the first two digits of the
     * calendar year
     *
     * SEMANTIC: PLA03 is the effective date for the action identified in PLA01.
     */
    private String pla03;

    /**
     * Maintenance Reason Code
     *
     * Code identifying the reason for the maintenance change
     */
    private String pla05;
}
