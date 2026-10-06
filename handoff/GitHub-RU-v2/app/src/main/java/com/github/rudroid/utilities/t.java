package com.github.rudroid.utilities;

import android.content.Context;
import android.text.format.DateUtils;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static ArrayList a(Calendar calendar) {
        ArrayList arrayList = new ArrayList(7);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        arrayList.add(Integer.valueOf(firstDayOfWeek));
        while (true) {
            firstDayOfWeek++;
            if (arrayList.size() >= 7) {
                return arrayList;
            }
            int i = firstDayOfWeek % 7;
            if (i == 0) {
                i = 7;
            }
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static String b(Context context, ZonedDateTime zonedDateTime) {
        k71.k.g(zonedDateTime, "dateTime");
        k71.k.g(context, "context");
        String formatDateTime = DateUtils.formatDateTime(context, zonedDateTime.toInstant().toEpochMilli(), 0);
        k71.k.f(formatDateTime, "formatDateTime(...)");
        return formatDateTime;
    }

    public static String c(LocalDate localDate, Context context) {
        k71.k.g(localDate, "date");
        k71.k.g(context, "context");
        String formatDateTime = DateUtils.formatDateTime(context, localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), 4);
        k71.k.f(formatDateTime, "formatDateTime(...)");
        return formatDateTime;
    }

    public static String d(int i, Context context, boolean z) {
        k71.k.g(context, "context");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = i;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        long minutes2 = TimeUnit.HOURS.toMinutes(hours);
        int seconds = i - ((int) TimeUnit.MINUTES.toSeconds(minutes));
        int i2 = ((int) minutes) - ((int) minutes2);
        if (minutes < 1) {
            String string = context.getString(2131952495, Integer.valueOf(i));
            k71.k.d(string);
            return string;
        }
        if (hours < 1) {
            if (seconds > 0) {
                String string2 = context.getString(2131952494, Long.valueOf(minutes), Integer.valueOf(seconds));
                k71.k.d(string2);
                return string2;
            }
            String string3 = context.getString(2131952493, Long.valueOf(minutes));
            k71.k.d(string3);
            return string3;
        }
        if (z) {
            String string4 = context.getString(2131952492, Long.valueOf(hours), Integer.valueOf(i2), Integer.valueOf(seconds));
            k71.k.f(string4, "getString(...)");
            return string4;
        }
        if (i2 > 0) {
            String string5 = context.getString(2131952491, Long.valueOf(hours), Integer.valueOf(i2));
            k71.k.f(string5, "getString(...)");
            return string5;
        }
        String string6 = context.getString(2131952490, Long.valueOf(hours));
        k71.k.f(string6, "getString(...)");
        return string6;
    }

    public static String e(int i, int i2, Context context) {
        k71.k.g(context, "context");
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        String formatDateTime = DateUtils.formatDateTime(context, calendar.getTimeInMillis(), 1);
        k71.k.f(formatDateTime, "formatDateTime(...)");
        return formatDateTime;
    }

    public static boolean f(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        k71.k.g(zonedDateTime, "startDateTime");
        Period between = Period.between(zonedDateTime.toLocalDate(), zonedDateTime2.toLocalDate());
        return between.getMonths() < 1 && between.getYears() == 0;
    }
    public static Object L(Object p1) { return null; }
    public Object y(Object p1) { return null; }
    public Object z(Object p1) { return null; }
}
