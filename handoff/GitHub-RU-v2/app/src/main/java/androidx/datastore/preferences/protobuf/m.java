package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile m f2337a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f2338b;

    static {
        m mVar = new m();
        Map map = Collections.EMPTY_MAP;
        f2338b = mVar;
    }

    public static m a() {
        m mVar;
        q0 q0Var = q0.f2366c;
        m mVar2 = f2337a;
        if (mVar2 != null) {
            return mVar2;
        }
        synchronized (m.class) {
            try {
                mVar = f2337a;
                if (mVar == null) {
                    Class cls = l.f2333a;
                    m mVar3 = null;
                    if (cls != null) {
                        try {
                            mVar3 = (m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    mVar = mVar3 != null ? mVar3 : f2338b;
                    f2337a = mVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }
}
