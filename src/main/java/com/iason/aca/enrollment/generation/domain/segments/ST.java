package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ST
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:44 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ST {

    /**
     * Transaction Set Identifier Code
     * Code uniquely identifying a Transaction Set
     *
     * SEMANTIC: The transaction set identifier (ST01) is used by the translation routines
     * of the interchange partners to select the appropriate transaction set definition
     * (e.g., 810 selects the Invoice Transaction Set).
     *
     * X12 Segment Name: Transaction Set Header
     * X12 Purpose: To indicate the start of a transaction set and to assign a control number
     *
     * Segment Repeat: 1
     * Usage: REQUIRED
     * TR3 Example: ST✽834✽0001✽005010X220~
     */
    private String st01;

    /**
     * Transaction Set Control Number
     * Identifying control number that must be unique within the transaction set
     * functional group assigned by the originator for a transaction set
     *
     * The Transaction Set Control Number in ST02 and SE02 must be
     * identical. The number must be unique within a specific interchange
     * (ISA-IEA), but can repeat in other interchanges.
     */
    private String st02;

    /**
     * Implementation Convention Reference
     * Reference assigned to identify Implementation Convention
     *
     * SEMANTIC: The implementation convention reference (ST03) is used by the
     * translation routines of the interchange partners to select the appropriate
     * implementation convention to match the transaction set definition. When used,
     * this implementation convention reference takes precedence over the
     * implementation reference specified in the GS08.
     */
    private String st03;
}
