package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: N4
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:13 PM
 *
 * X12 Segment Name: Geographic Location
 * X12 Purpose: To specify the geographic place of the named party
 *
 * TR3 Example: N4✽KANSAS CITY✽MO✽64108~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class N4 {

    /**
     * City Name
     *
     * Free-form text for city name
     */
    private String n401;

    /**
     * State or Province Code
     *
     * Code (Standard State/Province) as defined by appropriate government agency
     *
     * SITUATIONAL RULE: Required when the address is in the United States of
     * America, including its territories, or Canada. If
     *
     */
    private String n402;

    /**
     * Postal Code
     * Code defining international postal zone code excluding punctuation and blanks
     * (zip code for United States)
     */
    private String n403;

    /**
     * Country Code
     * Code identifying the country
     */
    private String n404;

    /**
     * Location Qualifier
     *
     * Code identifying type of location
     */
    private String n405;

    /**
     * Location Identifier
     *
     * Code which identifies a specific location
     *
     */
    private String n406;

    /**
     * Country Subdivision Code
     *
     * Code identifying the country subdivision
     */
    private String n407;
}
