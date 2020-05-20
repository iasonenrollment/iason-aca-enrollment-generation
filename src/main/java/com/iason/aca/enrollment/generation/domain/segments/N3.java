package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: N2
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:13 PM
 *
 * X12 Segment Name: Party Location
 * X12 Purpose: To specify the location of the named party
 *
 * Situational Rule: Required when enrolling subscribers, dependents with different address
 * information, or when changing a member’s address.
 *
 * TR3 Example: N3✽50 ORCHARD STREET~
 *
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class N3 {

    /**
     * Address Information
     *
     * IMPLEMENTATION NAME: Member Address Line 1
     */
    private String n301;

    /**
     * Address Information
     *
     * IMPLEMENTATION NAME: Member Address Line 2
     */
    private String n302;
}
