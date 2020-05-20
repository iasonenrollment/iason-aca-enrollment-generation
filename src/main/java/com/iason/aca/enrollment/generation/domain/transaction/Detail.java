package com.iason.aca.enrollment.generation.domain.transaction;

import com.iason.aca.enrollment.generation.domain.loops.Loop2000;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Detail
 * Inside the package - com.iason.aca.enrollment.generation.domain.transaction
 * Created Date: 5/12/2020
 * Created Time: 4:42 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Detail {

    private List<Loop2000> memberLevelDetails;

}
