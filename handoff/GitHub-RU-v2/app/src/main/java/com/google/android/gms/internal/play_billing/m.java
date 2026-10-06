package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public a.a a;
    public boolean b;
    public long c;
    public long d;

    public m(a.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("ticker");
        }
        this.a = aVar;
    }

    public final void a() {
        if (this.b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.b = true;
        this.d = this.a.F();
    }

    public final String toString() {
        String str;
        long F = this.b ? (this.a.F() - this.d) + this.c : this.c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(F, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(F, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(F, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(F, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(F, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(F, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(F / timeUnit2.convert(1L, timeUnit)));
        switch (l.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return f1.e.h(format, " ", str);
    }

    public Object a;
}
