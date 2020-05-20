package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.DSB;
import com.iason.aca.enrollment.generation.domain.segments.DTP;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2200
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:01 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2200 {

    /**
     * Member disability information
     */
    private DSB disabilityInformation;

    /**
     * Member disability eligibility dates
     */
    private List<DTP> disabilityEligibilityDates;
}
