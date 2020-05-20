package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ICM
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:14 PM
 *
 * X12 Segment Name: Individual Income
 * X12 Purpose: To supply information to determine benefit eligibility, deductibles, and retirement
 * and investment contributions
 *
 * TR3 Example: ICM✽1✽425.25✽40~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ICM {

    /**
     * Frequency Code
     * Code indicating frequency or type of activities or actions being reported
     */
    private String icm01;

    /**
     * Monetary Amount
     *
     * IMPLEMENTATION NAME: Wage Amount
     */
    private String icm02;

    /**
     * Quantity
     *
     * IMPLEMENTATION NAME: Work Hours Count
     */
    private String icm03;

    /**
     * Location Identifier
     *
     * Code which identifies a specific location
     *
     * IMPLEMENTATION NAME: Location Identification Code
     */
    private String icm04;

    /**
     * Salary Grade
     *
     * The salary grade code assigned by the employer
     */
    private String icm05;
}
