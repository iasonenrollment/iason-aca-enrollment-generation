package com.iason.aca.enrollment.generation.domain.transaction;

import com.iason.aca.enrollment.generation.domain.loops.Loop1000A;
import com.iason.aca.enrollment.generation.domain.loops.Loop1000B;
import com.iason.aca.enrollment.generation.domain.loops.Loop1000C;
import com.iason.aca.enrollment.generation.domain.segments.*;
import lombok.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Header
 * Inside the package - com.iason.aca.enrollment.generation.domain.transaction
 * Created Date: 5/12/2020
 * Created Time: 4:42 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Header {

    private ST transactionSetHeader;

    private BGN beginningSegment;

    private REF transactionSetPolicyNumber;

    private DTP fileEffectiveDate;

    private List<QTY> transactionSetControlTotals;

    private Loop1000A sponsorName;

    private Loop1000B payer;

    private List<Loop1000C> brokers;

    private List<Detail> transactionDetails;

    private SE transactionSetTrailer;

}
