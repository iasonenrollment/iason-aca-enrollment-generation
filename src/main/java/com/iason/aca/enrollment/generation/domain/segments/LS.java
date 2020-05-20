package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: LS
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 1:57 PM
 *
 * X12 Segment Name: Loop Header
 * X12 Purpose: To indicate that the next segment begins a loop
 * X12 Semantic: 1. One loop may be nested contained within another loop, provided the inner
 * nested loop terminates before the outer loop. When specified by the
 * standard setting body as mandatory, this segment in combination with “LE”,
 * must be used. It is not to be used if not specifically set forth for use. The
 * loop identifier in the loop header and trailer must be identical. The value for
 * the identifier is the loop ID of the required loop segment. The loop ID
 * number is given on the transaction set diagram in the appropriate ASC X12
 * version/release.
 *
 * TR3 Example: LS✽2700~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LS {

    /**
     * Loop Identifier Code
     *
     * The loop ID number given on the transaction set diagram is the value for this data
     * element in segments LS and LE
     */
    private String ls01 = "2700";
}
