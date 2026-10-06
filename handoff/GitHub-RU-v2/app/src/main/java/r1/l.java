package r1;

import android.os.Looper;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f31094a;

    static {
        long j10;
        try {
            j10 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j10 = -1;
        }
        f31094a = j10;
    }

    public static Object a;
}
