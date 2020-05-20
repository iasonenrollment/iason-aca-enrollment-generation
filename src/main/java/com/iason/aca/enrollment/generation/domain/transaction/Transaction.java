package com.iason.aca.enrollment.generation.domain.transaction;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: Transaction
 * Inside the package - com.iason.aca.enrollment.generation.domain.transaction
 * Created Date: 5/12/2020
 * Created Time: 4:43 PM
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private Header header;
    private Detail detail;
}
