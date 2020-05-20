package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.*;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2300
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:01 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2300 {

    private HD healthCoverage;

    private List<DTP> healthCoverageDates;

    private List<AMT> healthCoveragePolicies;

    private List<REF> healthConveragePolicyNumber;

    private REF priorCoverageMonths;

    private List<IDC> identificationCards;

    private List<Loop2310> providerDetails;

    private List<Loop2320> coordinationOfBenefits;
}
