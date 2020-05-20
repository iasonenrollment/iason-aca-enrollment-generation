package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.*;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2100A
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 4:59 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100A {

    /**
     * Name of the member
     */
    private NM1 memberName;

    /**
     * Member Communication Numbers
     */
    private PER memberCommnNumbers;

    /**
     * Member Residence Address
     */
    private N3 memberResidenceAddress;

    /**
     * Member city, state and zipcode
     */
    private N4 memberCityStateAndZip;

    /**
     * Member Demographic details
     */
    private DMG memberDemographics;

    /**
     * Member Employment class
     */
    private List<EC> employmentClass;

    /**
     * Member Income
     */
    private ICM memberIncome;

    /**
     * List of member policy amounts
     */
    private List<AMT> memberPolicyAmounts;

    /**
     * Member Health Information
     */
    private HLH memberHealthInformation;

    /**
     * Member Languages
     */
    private List<LUI> memberLanguages;

}
