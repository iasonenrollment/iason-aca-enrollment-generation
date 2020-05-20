package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.N3;
import com.iason.aca.enrollment.generation.domain.segments.N4;
import com.iason.aca.enrollment.generation.domain.segments.NM1;
import com.iason.aca.enrollment.generation.domain.segments.PER;
import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2100E
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:00 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100E {

    /**
     * Member School Name
     */
    private NM1 memberSchoolName;

    /**
     * Member School Communication Numbers
     */
    private PER memberSchoolCommnNumbers;

    /**
     * Member School Street Address;
     */
    private N3 memberSchoolStreetAddress;

    /**
     * Member School City, State and Zip
     */
    private N4 memberSchoolCityStateAndZip;
}
