package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: DMG
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:13 PM
 *
 * X12 Segment Name: Demographic Information
 *
 * X12 Purpose: To supply demographic information
 * TR3 Example: DMG✽D8✽19450915✽F✽M~
 *
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DMG {

    /**
     * Date Time Period Format Qualifier
     *
     * Code indicating the date format, time format, or date and time format
     */
    private String dmg01;

    /**
     * Date Time Period
     *
     * Expression of a date, a time, or range of dates, times or dates and times
     */
    private String dmg02;

    /**
     * Gender Code
     *
     * Code indicating the sex of the individual
     */
    private String dmg03;

    /**
     * Marital Status Code
     * Code defining the marital status of a person
     */
    private String dmg04;

    /**
     * COMPOSITE RACE OR ETHNICITY INFORMATION
     *
     * To send general and detailed information on race or ethnicity
     *
     * Race or Ethnicity Code
     */
    private String dmg05_1;

    /**
     * Code List Qualifier Code
     *
     * Code identifying a specific industry code list
     */
    private String dmg05_2;

    /**
     * Industry Code
     *
     * Code indicating a code from a specific industry code list
     */
    private String dmg05_3;

    /**
     * Citizenship Status Code
     * Code indicating citizenship status
     */
    private String dmg06;

    /**
     * Code List Qualifier Code
     *
     * Code identifying a specific industry code list
     */
    private String dmg10;

    /**
     * Industry Code
     *
     * Code indicating a code from a specific industry code list
     *
     */
    private String dmg11;
}
