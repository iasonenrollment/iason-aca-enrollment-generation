package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.N3;
import com.iason.aca.enrollment.generation.domain.segments.N4;
import com.iason.aca.enrollment.generation.domain.segments.NM1;
import com.iason.aca.enrollment.generation.domain.segments.PER;
import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2100G
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:00 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100G {

    /**
     * Responsible Person Name
     */
    private NM1 responsiblePersonName;

    /**
     * Responsible Person Communication Numbers
     */
    private PER responsiblePersonCommnNumbers;

    /**
     * Responsible Person Street Address;
     */
    private N3 responsiblePersonStreetAddress;

    /**
     * Responsible Person City, State and Zip
     */
    private N4 responsiblePersonCityStateAndZip;
}
