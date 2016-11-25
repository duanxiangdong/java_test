package com.test.calendar;

import java.util.Calendar;
import java.util.Date;

import com.test.util.Constants;
import com.test.util.DateUtils;



public class TestCalendar {

	public static void main(String[] args) {
		System.out.println(getTimeByMinute(-5));
	}

	public static String getTimeByMinute(int minute) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, minute);		
		return DateUtils.formatDate(calendar.getTime(), Constants.DATE_TIME_PATTERN_OTHER);
	}

	public static void test01() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println("endDate:" + DateUtils.formatDate(calendar.getTime(), Constants.DATE_TIME_PATTERN_OTHER));
		calendar.add(Calendar.HOUR, -2);
		System.out.println("beginDate:" + DateUtils.formatDate(calendar.getTime(), Constants.DATE_TIME_PATTERN_OTHER));
	}
}