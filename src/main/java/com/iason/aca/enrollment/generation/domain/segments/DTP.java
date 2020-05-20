package com.iason.aca.enrollment.generation.domain.segments;

import lombok.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: DTP
 * Inside the package - com.iason.aca.enrollment.generation.domain.segments
 * Created Date: 5/12/2020
 * Created Time: 4:46 PM
 *
 * X12 Segment Name: Date or Time or Period
 * X12 Purpose: To specify any or all of a date, a time, or a time period
 **/
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DTP {

    /**
     * Date/Time Qualifier
     * Code specifying type of date or time, or both date and time
     */
    private String dtp01;

    /**
     * Date Time Period Format Qualifier
     * Code indicating the date format, time format, or date and time format
     */
    private String dateTimeFormatQualifier;

    /**
     * Date Time Period
     * Expression of a date, a time, or range of dates, times or dates and times
     */
    private String dateTimePeriod;
}
