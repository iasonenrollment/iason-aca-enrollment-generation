package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: NM1
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:05 PM
 *
 * X12 Segment Name: Individual or Organizational Name
 * X12 Purpose: To supply the full name of an individual or organizational entity
 *
 * TR3 Example: NM1✽IL✽1✽SMITH✽JOHN✽M✽✽SR~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NM1 {

    /**
     * Entity Identifier Code
     *
     * Code identifying an organizational entity, a physical location, property or an
     * individual
     */
    private String nm01;

    /**
     * Entity Type Qualifier
     * Code qualifying the type of entity
     */
    private String nm102;

    /**
     * Name Last or Organization Name
     *
     * Individual last name or organizational name
     */
    private String nm103;

    /**
     * Name First
     *
     * Individual first name
     */
    private String nm104;

    /**
     * Name Middle
     * Individual middle name or initial
     */
    private String nm105;

    /**
     * Name Prefix
     * Prefix to individual name
     */
    private String nm106;

    /**
     * Name Suffix
     * Suffix to individual name
     */
    private String nm107;

    /**
     * Identification Code Qualifier
     * Code designating the system/method of code structure used for Identification
     * Code (67)
     */
    private String nm108;

    /**
     * Identification Code
     * Code identifying a party or other code
     */
    private String nm109;
}
