package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: LE
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/14/2020
 * Created Time: 2:03 PM
 *
 * X12 Segment Name: Loop Trailer
 * X12 Purpose: To indicate that the loop immediately preceding this segment is complete
 * X12 Semantic: One loop may be nested contained within another loop, provided the inner
 * nested loop terminates before the other loop. When specified by the
 * standards setting body as mandatory, this segment in combination with
 * “LS”, must be used. It is not to be used if not specifically set forth for use.
 * The loop identifier in the loop header and trailer must be identical. The
 * value for the identifier is the loop ID of the required loop beginning
 * segment. The loop ID number is given on the transaction set diagram in the
 * appropriate ASC X12 version/release.
 *
 * TR3 Example: LE✽2700~
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LE {

    /**
     * Loop Identifier Code
     *
     * The loop ID number given on the transaction set diagram is the value for this data
     * element in segments LS and LE
     */
    private String le01 = "2700";
}
