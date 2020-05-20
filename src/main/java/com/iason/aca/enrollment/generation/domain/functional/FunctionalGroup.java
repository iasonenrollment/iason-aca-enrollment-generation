package com.iason.aca.enrollment.generation.domain.functional;

import com.iason.aca.enrollment.generation.domain.segments.GE;
import com.iason.aca.enrollment.generation.domain.segments.GS;
import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: FunctionalGroup
 * Inside the package - com.iason.aca.enrollment.generation.domain.functional
 * Created Date: 5/12/2020
 * Created Time: 4:39 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FunctionalGroup {

    private GS gs;

    private GE ge;
}
