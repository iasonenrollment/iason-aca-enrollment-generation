package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.INS;
import com.iason.aca.enrollment.generation.domain.segments.REF;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2000
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 4:59 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2000 {

    private INS memberLevelDetail;
    private REF subscriberIdentifier;
    private REF memberPolicyNumber;
    private List<REF> memberSupplementalIdentifiers;
    private Loop2100A memberName;
    private Loop2100B incorrectMemberName;
    private Loop2100C memberMailingAddress;
    private List<Loop2100D> memberEmployers;
    private List<Loop2100E> memberSchools;
    private Loop2100F custodialParent;
    private List<Loop2100G> responsiblePerson;
    private Loop2100H dropOffLocation;
    private List<Loop2200> disabilityInformation;
    private List<Loop2300> healthCoverage;
    private List<Loop2700> reportingCategories;
}
