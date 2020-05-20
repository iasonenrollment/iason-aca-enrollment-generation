package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: HD
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:31 PM
 *
 * X12 Segment Name: Health Coverage
 * X12 Purpose: To provide information on health coverage
 *
 * TR3 Example: HD✽021✽✽HLT✽PLAN A BCD✽FAM~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HD {

    /**
     * Maintenance Type Code
     *
     * Code identifying the specific type of item maintenance
     */
    private String hd01;

    /**
     * Insurance Line Code
     *
     * Code identifying a group of insurance products
     */
    private String hd03;

    /**
     * Plan Coverage Description
     * A description or number that identifies the plan or coverage
     */
    private String hd04;

    /**
     * Coverage Level Code
     *
     * Code indicating the level of coverage being provided for this insured
     */
    private String hd05;

    /**
     * Yes/No Condition or Response Code
     *
     * Code indicating a Yes or No condition or response
     * SEMANTIC: HD09 is a late enrollee indicator. A “Y” value indicates the insured is a
     * late enrollee, which can result in a reduction of benefits; an “N” value indicates
     * the insured is a regular enrollee.
     */
    private String hd09;
}
