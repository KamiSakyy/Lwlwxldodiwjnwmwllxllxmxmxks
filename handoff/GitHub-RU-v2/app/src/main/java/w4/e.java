package w4;

import android.os.Build;
import android.os.Trace;
import b6.a2;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f33320a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f33321b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f33320a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f33321b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a2.g();
        }
        try {
            return ((Boolean) f33321b.invoke(null, Long.valueOf(f33320a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
