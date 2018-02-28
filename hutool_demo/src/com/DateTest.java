package com;

import static com.Print.print;

import java.util.Date;

import org.junit.Test;

import cn.hutool.core.date.DateUtil;

public class DateTest {
    /***
     * *********************************************************************
     * DateTime类继承于Date.
     * *********************************************************************
     */
    // @Test
    public void format() {
        print(DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));// 2017-12-25
                                                                  // 16:12:58
        Date date = DateUtil.parse("2017-01-05 12:23:56", "yyyy-MM-dd HH:mm:ss");
        print(date);// 2017-01-05 12:23:56
        print(DateUtil.formatDateTime(new Date()));// 2017-12-25 16:12:58
        date = DateUtil.parseDateTime("2017-03-26 15:37:28");
        print(date);// 2017-03-26 15:37:28
    }

    // @Test
    public void offsetDay() {
        Date date = DateUtil.parseDateTime("2017-02-28 15:37:28");
        print(DateUtil.offsetDay(date, 1));// 2017-03-01 15:37:28
        print(DateUtil.offsetDay(date, -1));// 2017-02-27 15:37:28
    }

    // @Test
    public void formatBetween() {
        Date date1 = DateUtil.parseDateTime("2017-02-28 23:37:28");
        Date date2 = DateUtil.parseDateTime("2017-03-01 01:37:28");
        print(DateUtil.betweenDay(date1, date2, true));// 1
        print(DateUtil.betweenDay(date1, date2, false));// 0
    }
}
