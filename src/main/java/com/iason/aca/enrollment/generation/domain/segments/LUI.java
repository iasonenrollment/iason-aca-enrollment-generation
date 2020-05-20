package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: LUI
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:15 PM
 *
 * X12 Segment Name: Language Use
 * X12 Purpose: To specify language, type of usage, and proficiency or fluency
 *
 * TR3 Example: LUI✽LD✽123✽✽8~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LUI {

    /**
     * Identification Code Qualifier
     *
     * Code designating the system/method of code structure used for Identification
     * Code (67)
     */
    private String lui01;

    /**
     * Identification Code
     * Code identifying a party or other code
     */
    private String lui02;

    /**
     * Description
     * A free-form description to clarify the related data elements and their content
     */
    private String lui03;

    /**
     * Use of Language Indicator
     * Code indicating the use of a language
     */
    private String lui04;
}
