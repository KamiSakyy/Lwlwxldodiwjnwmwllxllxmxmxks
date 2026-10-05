package r;

import android.os.Looper;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends b41.b {

    /* renamed from: g, reason: collision with root package name */
    public static volatile a f31054g;

    /* renamed from: h, reason: collision with root package name */
    public static final i7.c f31055h = new i7.c(1);

    /* renamed from: f, reason: collision with root package name */
    public final c f31056f = new c();

    public static a Z() {
        if (f31054g != null) {
            return f31054g;
        }
        synchronized (a.class) {
            try {
                if (f31054g == null) {
                    f31054g = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f31054g;
    }

    public final boolean a0() {
        this.f31056f.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
