package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.DMG;
import com.iason.aca.enrollment.generation.domain.segments.NM1;
import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2100B
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 4:59 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100B {

    /**
     * Incorrect Member name that was sent
     * in an earlier transaction
     */
    private NM1 incorrectMemberName;

    /**
     * Incorrect Member Demographics that was
     * sent in an earlier transaction
     */
    private DMG incorrectMemberDemographics;
}
