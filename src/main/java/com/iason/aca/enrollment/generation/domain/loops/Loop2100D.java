package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.N3;
import com.iason.aca.enrollment.generation.domain.segments.N4;
import com.iason.aca.enrollment.generation.domain.segments.NM1;
import com.iason.aca.enrollment.generation.domain.segments.PER;
import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2100D
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:00 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100D {

    /**
     * Member Employer Name
     */
    private NM1 memberEmployerName;

    /**
     * Member Employer Communication Numbers
     */
    private PER memberEmployerCommnNumbers;

    /**
     * Member Employer Street Address;
     */
    private N3 memberEmployerStreetAddress;

    /**
     * Member Employer City, State and Zip
     */
    private N4 memberEmployerCityStateAndZip;
}
