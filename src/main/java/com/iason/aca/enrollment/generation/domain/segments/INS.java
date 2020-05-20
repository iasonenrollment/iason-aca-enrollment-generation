package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: INS
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/18/2020
 * Created Time: 2:56 PM
 *
 * X12 Segment Name: Insured Benefit
 * X12 Purpose: To provide benefit information on insured entities
 *
 * TR3 Notes:
 * Subscriber information must preceed dependent information in a
 * transmission, or the subscriber information must have been
 * submitted to the receiver in a previous transmission.
 *
 * TR3 Example: INS✽Y✽18✽021✽28✽A✽✽✽FT~
 *
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class INS {

    /**
     * Yes/No Condition or Response Code
     * Code indicating a Yes or No condition or response
     *
     * SEMANTIC: INS01 indicates status of the insured. A “Y” value indicates the insured
     * is a subscriber: an “N” value indicates the insured is a dependent.
     *
     * IMPLEMENTATION NAME: Member Indicator
     */
    private String ins01;

    /**
     * Individual Relationship Code
     *
     * Code indicating the relationship between two individuals or entities
     * The value 18 must be used for the subscriber.
     * For dependents, this value identifies their relationship to the
     * subscriber. For example, a daughter would be value 19.
     */
    private String ins02;

    /**
     * Maintenance Type Code
     * Code identifying the specific type of item maintenance
     */
    private String ins03;

    /**
     * Maintenance Reason Code
     * Code identifying the reason for the maintenance change
     */
    private String ins04;

    /**
     * Benefit Status Code
     * The type of coverage under which benefits are paid
     */
    private String ins05;

    /**
     * INS06: MEDICARE STATUS CODE
     * To provide Medicare coverage and associated reason for Medicare eligibility
     *
     * SITUATIONAL RULE: Required if a member is being enrolled or disenrolled
     * in Medicare, is currently in Medicare or has terminated or changed
     * their Medicare enrollment. If not required by this implementation
     * guide, do not send.
     *
     * INS06_1: Medicare Plan Code - Code identifying the Medicare Plan
     */
    private String ins06_1;

    /**
     * Eligibility Reason Code
     * Code specifying reason for eligibility
     *
     * SITUATIONAL RULE: Required if the reason for Medicare is
     * provided to the sponsor by the member.
     *
     */
    private String ins06_2;

    /**
     * Consolidated Omnibus Budget Reconciliation Act (COBRA)
     * A Qualifying Event is any of the following which results in loss of coverage for a
     * Qualified Beneficiary
     *
     * SITUATIONAL RULE: Required when a member is being enrolled in or is
     * enrolled for a benefit covered by COBRA.
     *
     * IMPLEMENTATION NAME: Consolidated Omnibus Budget Reconciliation Act
     * (COBRA) Qualifying Event Code
     */
    private String ins07;

    /**
     * Employment Status Code
     *
     * Code showing the general employment status of an employee/claimant
     *
     * SITUATIONAL RULE: Required for subscriber.
     *
     * If this insurance enrollment is through a non-employment based
     * program such as Medicare or Medicaid then this data element will
     * contain the status of the subscriber in that program, rather than
     * their employment status. Codes for non-employment based
     * programs will be limited to “AC”, Active and “TE”, Terminated.
     *
     */
    private String ins08;

    /**
     * Student Status Code
     *
     * Code indicating the student status of the patient if 19 years of age or older, not
     * handicapped and not the insured
     *
     * SITUATIONAL RULE: Required when describing a non-spouse dependent
     * whose age requires a qualifying condition for enrollment (e.g.,
     * being an active student). See the Plan contract for details of the age
     * requirements for student status usage.
     */
    private String ins09;

    /**
     * Yes/No Condition or Response Code
     *
     * Code indicating a Yes or No condition or response
     *
     * SEMANTIC: INS10 is the handicapped status indicator. A “Y” value indicates an
     * individual is handicapped; an “N” value indicates an individual is not handicapped.
     *
     * SITUATIONAL RULE: Required when the member is handicapped or to
     * correct a previous report of handicapped status.
     */
    private String ins10;

    /**
     * Date Time Period Format Qualifier
     *
     * Code indicating the date format, time format, or date and time format
     *
     * SITUATIONAL RULE: Required when the Insured Individual Death Date is
     * sent in INS12.
     */
    private String ins11;

    /**
     * Date Time Period
     *
     * Expression of a date, a time, or range of dates, times or dates and times
     *
     * SYNTAX: P1112
     * SEMANTIC: INS12 is the date of death.
     *
     * SITUATIONAL RULE: Required if the subscriber/dependent is deceased. If
     * not required by this implementation guide, do not send. This is the
     * date of death for the subscriber/dependent and does not replace
     * the use of the termination date within the 2300 loop.
     *
     * IMPLEMENTATION NAME: Member Individual Death Date
     *
     */
    private String ins12;

    /**
     * Confidentiality Code
     *
     * Code indicating the access to insured information
     *
     * SITUATIONAL RULE: Required when the member has specified the access
     * to their information.
     */
    private String ins13;

    /**
     * Number
     * A Generic Number
     *
     * SEMANTIC: INS17 is the number assigned to each family member born with the
     * same birth date. This number identifies birth sequence for multiple births allowing
     * proper tracking and response of benefits for each dependent (i.e., twins, triplets,
     * etc.).
     *
     * SITUATIONAL RULE: Required when reporting family members with the
     * same birth date if a birth sequence number is needed for proper
     * reporting, tracking or response to benefits.
     *
     * IMPLEMENTATION NAME: Birth Sequence Number
     */
    private String ins17;
}
