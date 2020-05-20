package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: LX
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:36 PM
 *
 * X12 Segment Name: Transaction Set Line Number
 * X12 Purpose: To reference a line number in a transaction set
 *
 * TR3 Example: LX✽1~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LX {

    /**
     * Assigned Number
     *
     * Number assigned for differentiation within a transaction set
     */
    private String lx01;
}
