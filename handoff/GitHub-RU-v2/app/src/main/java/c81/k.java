package c81;

import a81.u;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class k {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;

    static {
        String str;
        int i = u.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = a81.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = u.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = a81.b.l(i2, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        d = a81.b.l(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        e = TimeUnit.SECONDS.toNanos(a81.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.a;
    }
}
