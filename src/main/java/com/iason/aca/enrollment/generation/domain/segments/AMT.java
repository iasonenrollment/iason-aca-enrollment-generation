package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: AMT
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:14 PM
 * X12 Segment Name: Monetary Amount Information
 * X12 Purpose: To indicate the total monetary amount
 *
 * TR3 Example: AMT✽D2✽100~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AMT {

    /**
     * Amount Qualifier Code
     */
    private String amt01;

    /**
     * Monetary Amount
     */
    private String amt02;
}
