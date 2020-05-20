package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ACT
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:52 PM
 *
 * X12 Segment Name: Account Identification
 *
 * X12 Purpose: To specify account information
 *
 * Situational Rule: Required when the account number of the TPA or Broker is different than
 * the account number for the sponsor. If not required by this
 * implementation guide, do not send.
 * TR3 Example: ACT✽1234✽✽✽✽✽23498765~
 *
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ACT {

    /**
     * Account Number
     *
     * Account number assigned
     */
    private String act01;

    /**
     * Account Number
     * Account number assigned
     */
    private String act06;
}
