package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IDC
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:32 PM
 *
 * X12 Segment Name: Identification Card
 * X12 Purpose: To provide notification to produce replacement identification card(s)
 *
 * TR3 Notes: An enrollment statement refers to a situation where no change is
 * being made to the enrollment except to request a replacement ID card.
 *
 * TR3 Example: IDC✽12345✽H~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IDC {

    /**
     * Plan Coverage Description
     *
     * A description or number that identifies the plan or coverage
     */
    private String idc01;

    /**
     * Identification Card Type Code
     *
     * Code identifying the type of identification card
     */
    private String idc02;

    /**
     * Quantity
     *
     * Numeric value of quantity
     * SEMANTIC: IDC03 is the number of cards being requested.
     */
    private String idc03;

    /**
     * Action Code
     *
     * Code indicating type of action
     * SEMANTIC: IDC04 is the reason for the card being requested, i.e., add or a change.
     */
    private String idc04;
}
