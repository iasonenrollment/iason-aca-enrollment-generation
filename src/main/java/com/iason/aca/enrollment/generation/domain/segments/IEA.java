package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IEA
 * Inside the package - com.iason.aca.enrollment.generation.domain.envelope
 * Created Date: 5/12/2020
 * Created Time: 4:23 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IEA {

    /**
     * Total number of functional groups
     */
    private String iea01;

    /**
     * Interchange Control Number
     * Should be same as ISA13
     */
    private String iea02;
}
