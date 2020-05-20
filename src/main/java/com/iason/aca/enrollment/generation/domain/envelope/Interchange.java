package com.iason.aca.enrollment.generation.domain.envelope;

import com.iason.aca.enrollment.generation.domain.functional.FunctionalGroup;
import com.iason.aca.enrollment.generation.domain.segments.IEA;
import com.iason.aca.enrollment.generation.domain.segments.ISA;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Interchange
 * Inside the package - com.iason.aca.enrollment.generation.domain.envelope
 * Created Date: 5/12/2020
 * Created Time: 4:37 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Interchange {

    private ISA isa;

    private IEA iea;

    private List<FunctionalGroup> functionalGroups;
}
