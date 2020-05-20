package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: N1
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:52 PM
 *
 * X12 Segment Name: Party Identification
 * X12 Purpose: To identify a party by type of organization, name, and code
 *
 * TR3 Example: N1✽P5✽✽FI✽12356799~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class N1 {

    /**
     * Entity Identifier Code
     *
     * Code identifying an organizational entity, a physical location, property or an
     * individual
     */
    private String n101;

    /**
     * Name
     * Free-form name
     */
    private String n102;

    /**
     * Identification Code Qualifier
     *
     * Code designating the system/method of code structure used for Identification
     * Code (67)
     */
    private String n103;

    /**
     * Identification Code
     *
     * Code identifying a party or other code
     */
    private String n104;
}
