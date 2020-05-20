package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.DTP;
import com.iason.aca.enrollment.generation.domain.segments.N1;
import com.iason.aca.enrollment.generation.domain.segments.REF;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2750
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:02 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2750 {

    private N1 reportingCategory;

    private List<REF> reportingCategoryReferences;

    private DTP reportingCategoryDate;

}
