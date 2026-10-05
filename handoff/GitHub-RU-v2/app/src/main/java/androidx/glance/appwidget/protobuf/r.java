package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static volatile r f2785a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f2786b;

    static {
        r rVar = new r();
        Map map = Collections.EMPTY_MAP;
        f2786b = rVar;
    }

    public static r a() {
        r rVar;
        w0 w0Var = w0.f2801c;
        r rVar2 = f2785a;
        if (rVar2 != null) {
            return rVar2;
        }
        synchronized (r.class) {
            try {
                rVar = f2785a;
                if (rVar == null) {
                    Class cls = q.f2772a;
                    r rVar3 = null;
                    if (cls != null) {
                        try {
                            rVar3 = (r) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    rVar = rVar3 != null ? rVar3 : f2786b;
                    f2785a = rVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
