package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.LE;
import com.iason.aca.enrollment.generation.domain.segments.LS;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2700
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:02 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2700 {

    /**
     * Additional reporting categories
     */
    private LS additionalReportingCategories;

    /**
     * Member reporting categories
     */
    private List<Loop2710> memberReportingCategories;

    /**
     * Termination segment;
     */
    private LE addtnlRprtngCtgrsLoopTermn;
}
