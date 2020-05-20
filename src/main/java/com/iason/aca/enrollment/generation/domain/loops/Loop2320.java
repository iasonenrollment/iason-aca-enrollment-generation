package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.COB;
import com.iason.aca.enrollment.generation.domain.segments.DTP;
import com.iason.aca.enrollment.generation.domain.segments.REF;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2320
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:01 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2320 {

    /**
     * Coordination of benefit that is
     * applicable for the member
     */
    private COB coordinationOfBenefits;

    /**
     * Any additional COBs that is
     * applicable for the member
     */
    private List<REF> additionalCOBs;

    /**
     * COB eligibility dates
     */
    private List<DTP> cobEligibilityDates;

    /**
     * COB related entities
     */
    private List<Loop2330> cobRelatedEntities;
}
