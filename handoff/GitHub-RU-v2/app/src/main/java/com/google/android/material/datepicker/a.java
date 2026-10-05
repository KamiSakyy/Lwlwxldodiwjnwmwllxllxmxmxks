package com.google.android.material.datepicker;

import java.util.Calendar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static final /* synthetic */ int b = 0;
    public Long a;

    static {
        long j = m.c(1900, 0).w;
        Calendar c = t.c(null);
        c.setTimeInMillis(j);
        t.a(c).getTimeInMillis();
        long j2 = m.c(2100, 11).w;
        Calendar c2 = t.c(null);
        c2.setTimeInMillis(j2);
        t.a(c2).getTimeInMillis();
    }
}
