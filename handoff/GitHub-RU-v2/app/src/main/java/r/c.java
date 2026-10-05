package r;

import a5.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends b41.b {

    /* renamed from: f, reason: collision with root package name */
    public final Object f31059f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f31060g = Executors.newFixedThreadPool(4, new b());

    /* renamed from: h, reason: collision with root package name */
    public volatile Handler f31061h;

    public static Handler Z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return l.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
