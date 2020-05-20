package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ISA
 * Inside the package - com.iason.aca.enrollment.generation.domain
 * Created Date: 5/5/2020
 * Created Time: 7:14 PM
 *
 * Sample from 834:
 * ISA✽00✽..........✽01✽SECRET....✽ZZ✽SUBMITTERS.ID..✽ZZ✽
 * RECEIVERS.ID...✽030101✽1253✽^✽00501✽000000905✽1✽T✽:~
 * DIAGRAM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ISA {

    /**
     * Authorization Info Qualifier
     * This is usually "00"
     */
    private String isa01;

    /**
     * Authorization Information
     */
    private String isa02;

    /**
     * Security Information Qualifier
     * Code identifying the type of information in the Security Information
     */
    private String isa03;

    /**
     * Security Information
     * This is used for identifying the security information about the interchange sender
     * or the data in the interchange; the type of information is set by the Security
     * Information Qualifier (I03)
     */
    private String isa04;

    /**
     * Interchange ID Qualifier
     * Code indicating the system/method of code structure used to designate the
     * sender or receiver ID element being qualified
     */
    private String isa05;

    /**
     * Interchange Sender Id
     */
    private String isa06;
    /**
     * Interchange ID Qualifier
     * Code indicating the system/method of code structure used to designate the
     * sender or receiver ID element being qualified
     */
    private String isa07;

    /**
     * Interchange Receiver Id
     */
    private String isa08;

    /**
     * Interchange Date
     */
    private String isa09;

    /**
     * Interchange Time
     */
    private String isa10;

    /**
     * Repetition Separator
     */
    private String isa11;

    /**
     * Interchange Control Version Number
     */
    private String isa12;

    /**
     * Interchange Control Number
     */
    private String isa13;

    /**
     * Acknowledgement Requested
     */
    private String isa14;

    /**
     * Interchange Usage Indicator
     */
    private String isa15;

    /**
     * Component Element Separator
     */
    private String isa16;

}
