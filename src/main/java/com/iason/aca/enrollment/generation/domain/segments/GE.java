package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: GE
 * Inside the package - com.iason.aca.enrollment.generation.domain.functional
 * Created Date: 5/12/2020
 * Created Time: 4:06 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GE {

    /**
     * Total number of Transactions included
     */
    private int ge01;

    /**
     * Group Control Number
     * Same value as GS06
     */
    private String ge02;
}
