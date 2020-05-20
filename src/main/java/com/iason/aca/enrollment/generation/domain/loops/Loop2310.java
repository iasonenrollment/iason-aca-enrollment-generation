package com.iason.aca.enrollment.generation.domain.loops;

import com.iason.aca.enrollment.generation.domain.segments.*;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Loop2310
 * Inside the package - com.iason.aca.enrollment.generation.domain.loops
 * Created Date: 5/12/2020
 * Created Time: 5:01 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2310 {

    /**
     * Provider Information
     */
    private LX providerInformation;

    /**
     * Name of the provider
     */
    private NM1 providerName;

    /**
     * Address of the provider
     */
    private N3 providerAddress;

    /**
     * Provider City, State and Zip
     */
    private N4 providerCityStateAndZip;

    /**
     * Provider communication numbers
     */
    private List<PER> providerCommnNumbers;

    /**
     * Reason for changing the provider
     */
    private PLA provideChangeReason;
}
