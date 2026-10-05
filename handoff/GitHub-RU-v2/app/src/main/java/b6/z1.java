package b6;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f3745a = new AtomicBoolean(false);

    public static void a() {
        if (Build.VERSION.SDK_INT < 29 || !f3745a.get()) {
            return;
        }
        a2.b();
    }
}
