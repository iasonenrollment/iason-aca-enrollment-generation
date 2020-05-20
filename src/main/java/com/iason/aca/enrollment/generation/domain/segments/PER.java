package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: PER
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:06 PM
 *
 * X12 Segment Name: Administrative Communications Contact
 * X12 Purpose: To identify a person or office to whom administrative communications should be
 * directed
 *
 * TR3 Notes: 1. When the communication number represents a telephone number in
 * the United States and other countries using the North American
 * Dialing Plan (for voice, data, fax, etc.), the communication number
 * always includes the area code and phone number using the format
 * AAABBBCCCC, where AAA is the area code, BBB is the telephone
 * number prefix, and CCCC is the telephone number (e.g. (534)224-2525
 * would be represented as 5342242525).
 *
 * TR3 Example: PER✽IP✽✽HP✽8015554321~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PER {

    /**
     * Contact Function Code
     * Code identifying the major duty or responsibility of the person or group named
     */
    private String per01;

    /**
     * Communication Number Qualifier
     *
     * Code identifying the type of communication number
     */
    private String per03;

    /**
     * Communication Number
     *
     * Complete communications number including country or area code when
     * applicable
     */
    private String per04;

    /**
     * Communication Number Qualifier
     *
     * Code identifying the type of communication number
     */
    private String per05;

    /**
     * Communication Number
     *
     * Complete communications number including country or area code when
     * applicable
     */
    private String per06;

    /**
     * Communication Number Qualifier
     *
     * Code identifying the type of communication number
     */
    private String per07;

    /**
     * Communication Number
     *
     * Complete communications number including country or area code when
     * applicable
     */
    private String per08;
}
