package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: COB
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:40 PM
 *
 * X12 Segment Name: Coordination of Benefits
 * X12 Purpose: To supply information on coordination of benefits
 *
 * TR3 Example: COB✽P✽XYZ123✽1~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class COB {

    /**
     * Payer Responsibility Sequence Number Code
     *
     * Code identifying the insurance carrier’s level of responsibility for a payment of a
     * claim
     */
    private String cob01;

    /**
     * Reference Identification
     *
     * Reference information as defined for a particular Transaction Set or as specified
     * by the Reference Identification Qualifier
     */
    private String cob02;

    /**
     * Coordination of Benefits Code
     *
     * Code identifying whether there is a coordination of benefits
     */
    private String cob03;

    /**
     * Service Type Code
     * Code identifying the classification of service
     */
    private String cob04;
}
