package com.github.rudroid.copilot;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/* loaded from: /home/user/work/p/classes.dex */
public final class i4 {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f9630a;

    public static final class a {
    }

    static {
        DateTimeFormatter ofLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        k71.k.f(ofLocalizedDate, "ofLocalizedDate(...)");
        f9630a = ofLocalizedDate;
    }
}
