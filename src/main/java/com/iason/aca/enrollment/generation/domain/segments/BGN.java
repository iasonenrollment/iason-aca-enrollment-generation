package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: BGN
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:45 PM
 *
 * X12 Segment Name: Beginning Segment
 * X12 Purpose: To indicate the beginning of a transaction set
 * X12 Syntax: 1. C0504
 * If BGN05 is present, then BGN04 is required.
 * Segment Repeat: 1
 * Usage: REQUIRED
 * TR3 Example: BGN✽00✽11227✽19970920✽1200✽ES✽✽✽2~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BGN {

    /**
     * Transaction Set Purpose Code
     * Code identifying purpose of transaction set
     */
    private String bgn01;

    /**
     * Reference Identification
     * Reference information as defined for a particular Transaction Set or as specified
     * by the Reference Identification Qualifier
     * SEMANTIC: BGN02 is the transaction set reference number.
     */
    private String bgn02;

    /**
     * Date
     * Date expressed as CCYYMMDD where CC represents the first two digits of the
     * calendar year
     * SEMANTIC: BGN03 is the transaction set date.
     */
    private String bgn03;

    /**
     * Time
     * Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or
     * HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S =
     * integer seconds (00-59) and DD = decimal seconds; decimal seconds are
     * expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)
     * SYNTAX: C0504
     * SEMANTIC: BGN04 is the transaction set time.
     */
    private String bgn04;

    /**
     * Time Code
     * Code identifying the time. In accordance with International Standards
     * Organization standard 8601, time can be specified by a + or - and an indication in
     * hours in relation to Universal Time Coordinate (UTC) time; since + is a restricted
     * character, + and - are substituted by P and M in the codes that follow
     * SYNTAX: C0504
     * SEMANTIC: BGN05 is the transaction set time qualifier.
     */
    private String bgn05;

    /**
     * Reference Identification
     * Reference information as defined for a particular Transaction Set or as specified
     * by the Reference Identification Qualifier
     * SEMANTIC: BGN06 is the transaction set reference number of a previously sent
     * transaction affected by the current transaction.
     */
    private String bgn06;

    /**
     * Action Code
     *
     * Code Indicating type of action
     */
    private String bgn08;

}
