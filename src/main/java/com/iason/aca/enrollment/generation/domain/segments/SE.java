package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: SE
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 8:11 PM
 *
 * X12 Segment Name: Transaction Set Trailer
 *
 * X12 Purpose: To indicate the end of the transaction set and provide the count of the
 * transmitted segments (including the beginning (ST) and ending (SE) segments)
 *
 * TR3 Example: SE✽39✽0001~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SE {

    /**
     * Number of Included Segments
     *
     * Total number of segments included in a transaction set including ST and SE
     * segments
     *
     * IMPLEMENTATION NAME: Transaction Segment Count
     */
    private String se01;

    /**
     * Transaction Set Control Number
     *
     * Identifying control number that must be unique within the transaction set
     * functional group assigned by the originator for a transaction set
     *
     * The transaction set control numbers in ST02 and SE02 must be
     * identical. This unique number also aids in error resolution
     * research. For example, start with the number 0001 and increment
     * from there. This number must be unique within a specific group
     * and interchange, but the number can repeat in other groups and
     * interchanges.
     */
    private String se02;
}
