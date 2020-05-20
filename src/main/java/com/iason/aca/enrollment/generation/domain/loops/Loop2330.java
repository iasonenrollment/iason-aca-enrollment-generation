package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.N3;
import com.iason.aca.enrollment.generation.domain.segments.N4;
import com.iason.aca.enrollment.generation.domain.segments.NM1;
import com.iason.aca.enrollment.generation.domain.segments.PER;
import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2330
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:02 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2330 {

    /**
     * Name of the other COB Entity
     */
    private NM1 cobRelatedEntityName;

    /**
     * Address of the COB entity
     */
    private N3 cobRelatedEntityAddress;

    /**
     * City, Sate and Zip of COB
     */
    private N4 cobCityStateAndZip;

    /**
     * Administrative Communication Contact
     */
    private PER adminCommnContact;
}
