package w71;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import k71.k;
import sy.y;
import w61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        d d;
        try {
            d = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            d = y.d(th);
        }
        if (d instanceof m) {
            d = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            k.e(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
