package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: QTY
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:46 PM
 *
 * X12 Segment Name: Quantity Information
 * X12 Purpose: To specify quantity information
 * X12 Set Notes: 1. The QTY segment is used to record the total number of subscribers and
 * dependents in the transaction set.
 * X12 Syntax: 1. R0204
 * At least one of QTY02 or QTY04 is required.
 * 2. E0204
 * Only one of QTY02 or QTY04 may be present.
 *
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QTY {

    /**
     * Quantity Qualifier
     * Code specifying the type of quantity
     */
    private String qty01;

    /**
     * Quantity
     * Numeric value of quantity
     */
    private String qty02;
}
